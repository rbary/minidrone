#include <stdlib.h>
#include <curses.h>
#include <string.h>
#include <unistd.h>
#include <signal.h>

#include <libARSAL/ARSAL.h>
#include <libARController/ARController.h>
#include <libARDiscovery/ARDiscovery.h>

#include "RollingSpiderPiloting.h"
#include "ihm.h"

/*****************************************
*
*             define :
*
*****************************************/
#define TAG "Obeo's Rolling Spider"
#define ERROR_STR_LENGTH 2048
#define IHM

/*****************************************
*
*             declarations :
*
*****************************************/

int gIHMRun = 1;
char gErrorStr[ERROR_STR_LENGTH];
IHM_t *ihm = NULL;

FILE *videoOut = NULL;
int writeImgs = 0;
int frameNb = 0;
ARSAL_Sem_t stateSem;

//this function is called when the state of the device controller has changed:
void stateChanged(eARCONTROLLER_DEVICE_STATE newState,
eARCONTROLLER_ERROR error, void *customData) {
	ARSAL_PRINT(ARSAL_PRINT_INFO, TAG, "-stateChanged newState: %d .....",newState);
	switch (newState) {
		case ARCONTROLLER_DEVICE_STATE_STOPPED:
			ARSAL_Sem_Post(&(stateSem));
			gIHMRun = 0;
			break;
		case ARCONTROLLER_DEVICE_STATE_RUNNING:
			ARSAL_Sem_Post(&(stateSem));
			break;
		default:
			break;
		}
}
/*********************** PRIVATE IMPLEMENTATION *******************************/

//this function is called when a command has been received from the drone:
void commandReceived(eARCONTROLLER_DICTIONARY_KEY commandKey,
			ARCONTROLLER_DICTIONARY_ELEMENT_t *elementDictionary,
			void *customData)
{

		ARCONTROLLER_Device_t *deviceController = customData;
		eARCONTROLLER_ERROR error = ARCONTROLLER_OK;

		if (deviceController != NULL) {

			//if the command received is a battery state changed
			if (commandKey
					== ARCONTROLLER_DICTIONARY_KEY_COMMON_COMMONSTATE_BATTERYSTATECHANGED) {
				ARCONTROLLER_DICTIONARY_ARG_t *arg = NULL;
				ARCONTROLLER_DICTIONARY_ELEMENT_t *singleElement =
				NULL;

				if (elementDictionary != NULL) {
					//get the command received in the device controller
					HASH_FIND_STR(elementDictionary,
					ARCONTROLLER_DICTIONARY_SINGLE_KEY,
							singleElement);

					if (singleElement != NULL) {
						//get the value
						HASH_FIND_STR(singleElement->arguments,
								ARCONTROLLER_DICTIONARY_KEY_COMMON_COMMONSTATE_BATTERYSTATECHANGED_PERCENT,
								arg);

						if (arg != NULL) {
							//update UI
							batteryStateChanged(arg->value.U8);
						} else {
							ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG,
									"arg is NULL");
						}
					} else {
						ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG,
								"singleElement is NULL");
					}
				}
			} else {
				ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG,
						"elements is NULL");
			}
		}
}

//this function is called when for the battery state changing:

void batteryStateChanged(uint8_t percent)
{
	//callback of battery level changing
	if (ihm != NULL) {
		IHM_PrintBattery(ihm, percent);
	}
}

//ihm callbacks:
void onInputEvent(eIHM_INPUT_EVENT event, void *customData)
{
	//handle IHM input events
	ARCONTROLLER_Device_t *deviceController =
			(ARCONTROLLER_Device_t *) customData;
	eARCONTROLLER_ERROR error = ARCONTROLLER_OK;

	switch (event) {
		case IHM_INPUT_EVENT_EXIT:
			IHM_PrintInfo(ihm,"IHM_INPUT_EVENT_EXIT ...");
			gIHMRun = 0;
			break;
		case IHM_INPUT_EVENT_EMERGENCY:
			if(deviceController != NULL){
				error = deviceController->miniDrone->sendPilotingEmergency(
						deviceController->miniDrone);
			}
			break;
		case IHM_INPUT_EVENT_TAKEOFF:
			if(deviceController != NULL){
				error = deviceController->miniDrone->sendPilotingTakeOff(
						deviceController->miniDrone);
			}
			break;
		case IHM_INPUT_EVENT_LANDING:
			if(deviceController != NULL){
				error = deviceController->miniDrone->sendPilotingLanding(
						deviceController->miniDrone);
			}
			break;
		/*case IHM_INPUT_EVENT_FORWARD:
			break;
		case IHM_INPUT_EVENT_BACK:
			break;
		case IHM_INPUT_EVENT_ROLL_LEFT:
			break;
		case IHM_INPUT_EVENT_ROLL_RIGHT:
			break;*/
		default:
			break;
	}

	//this should be improved, here it just display that one error occured
	if (error != ARCONTROLLER_OK){
		IHM_PrintInfo(ihm, "Error sending an event");
	}
}

int customPrintCallback(eARSAL_PRINT_LEVEL level, const char *tag,
		const char * format, va_list va)
{
	// Custom callback used when ncurses is runing for not disturb the IHM

	if ((level == ARSAL_PRINT_ERROR) && (strcmp(TAG, tag) == 0)) {
		// Save the last Error
		vsnprintf(gErrorStr, (ERROR_STR_LENGTH - 1), format, va);
		gErrorStr[ERROR_STR_LENGTH - 1] = '\0';
	}
	return 1;
}

/*********************************** MAIN ****************************/
int main(int argc, char *argv[]) {
	//local declarations
	int failed = 0;
	ARDISCOVERY_Device_t *device = NULL;
	ARCONTROLLER_Device_t *deviceController = NULL;
	eARCONTROLLER_ERROR error = ARCONTROLLER_OK;
	eARCONTROLLER_DEVICE_STATE deviceState =
			ARCONTROLLER_DEVICE_STATE_MAX;
	pid_t child = 0;
	ARSAL_Sem_Init(&(stateSem), 0, 0);

#ifdef _ROLLINGSPIDER_PILOTING_IHM_H_
	ihm = IHM_New(&onInputEvent);
	if (ihm != NULL) {
		gErrorStr[0] = '\0';
		ARSAL_Print_SetCallback(customPrintCallback); //use a custom callback to print, for not disturb ncurses IHM

		IHM_PrintHeader(ihm, "-- Rolling Spider Piloting --");
	} else {
		ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG,
				"Creation of IHM failed.");
		failed = 1;
	}
#endif

	//create a discovery device
	if(!failed){
		ARSAL_PRINT(ARSAL_PRINT_INFO, TAG, "- init discovery device ...");
		eARDISCOVERY_ERROR errorDiscovery = ARDISCOVERY_OK;


		device = ARDISCOVERY_Device_New(&errorDiscovery);

		if (errorDiscovery == ARDISCOVERY_OK) {
			ARSAL_PRINT(ARSAL_PRINT_INFO, TAG, "- ARDISCOVERY_Device_InitBLE ...");

			// create a Rolling Spider discovery device (ARDISCOVERY_PRODUCT_JS)
			/**errorDiscovery = ARDISCOVERY_Device_InitBLE(device,
					ARDISCOVERY_PRODUCT_MINIDRONE,bleDeviceManager,BLEDevice);**/
		}
	}

	// create a device controller
	if (!failed) {
		deviceController = ARCONTROLLER_Device_New(device, &error);

		if (error != ARCONTROLLER_OK) {
			ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG,
					"Creation of deviceController failed.");
			failed = 1;
		} else {
			IHM_setCustomData(ihm, deviceController);
		}
	}

	if (!failed) {
		ARSAL_PRINT(ARSAL_PRINT_INFO, TAG, "- delete discovey device ... ");
		ARDISCOVERY_Device_Delete(&device);
	}
	//add commands received callback
	// add the command received callback to be informed when a command has been received from the device
	if (!failed) {
		error = ARCONTROLLER_Device_AddCommandReceivedCallback(deviceController,
				commandReceived, deviceController);

		if (error != ARCONTROLLER_OK) {
			ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG, "add callback failed.");
			failed = 1;
		}
	}

	// add the state change callback to be informed when the device controller starts, stops...
	if (!failed) {
			error = ARCONTROLLER_Device_AddStateChangedCallback(deviceController,
					stateChanged, deviceController);

			if (error != ARCONTROLLER_OK) {
				ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG, "add State callback failed.");
				failed = 1;
			}
	}


	// connecting to the minidrone
	if (!failed) {
			IHM_PrintInfo(ihm, "Connecting ...");
			ARSAL_PRINT(ARSAL_PRINT_INFO, TAG, "Connecting ...");
			error = ARCONTROLLER_Device_Start(deviceController);

			if (error != ARCONTROLLER_OK) {
				failed = 1;
				ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG, "- error :%s",
						ARCONTROLLER_Error_ToString(error));
			}
	}

	//waiting for a state update
	if (!failed) {
		ARSAL_Sem_Wait(&(stateSem));

		deviceState = ARCONTROLLER_Device_GetState(deviceController, &error);

		if ((error != ARCONTROLLER_OK)
				|| (deviceState != ARCONTROLLER_DEVICE_STATE_RUNNING)) {
			failed = 1;
			ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG, "- deviceState :%d",
					deviceState);
			ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG, "- error :%s",
					ARCONTROLLER_Error_ToString(error));
		}
	}

	//running step when the drone is ready to work
	if (!failed) {
		IHM_PrintInfo(ihm,
				"Running ... ('t' to takeoff; 'l' to land; 'e' for emergency; 'q' to quit)");

	#ifdef _ROLLINGSPIDER_PILOTING_IHM_H_
		while (gIHMRun) {
			usleep(50);
		}
	#else
		ARSAL_PRINT(ARSAL_PRINT_INFO, TAG, "- sleep 20 ... ");
		sleep(20);
		ARSAL_PRINT(ARSAL_PRINT_INFO, TAG, "- sleep end ... ");
	#endif
	}

#ifdef _ROLLINGSPIDER_PILOTING_IHM_H_
	IHM_Delete(&ihm);
#endif

	// we are here because of a disconnection or user has quit IHM, so safely delete everything
	if (deviceController != NULL) {

		deviceState = ARCONTROLLER_Device_GetState(deviceController, &error);
		if ((error == ARCONTROLLER_OK)
				&& (deviceState != ARCONTROLLER_DEVICE_STATE_STOPPED)) {
			IHM_PrintInfo(ihm, "Disconnecting ...");
			ARSAL_PRINT(ARSAL_PRINT_INFO, TAG, "Disconnecting ...");

			error = ARCONTROLLER_Device_Stop(deviceController);

			if (error == ARCONTROLLER_OK) {
				// wait state update update
				ARSAL_Sem_Wait(&(stateSem));
			}
		}

		IHM_PrintInfo(ihm, "");
		ARSAL_PRINT(ARSAL_PRINT_INFO, TAG, "ARCONTROLLER_Device_Delete ...");
		ARCONTROLLER_Device_Delete(&deviceController);
	}

	ARSAL_Sem_Destroy(&(stateSem));

	ARSAL_PRINT(ARSAL_PRINT_INFO, TAG, "-- END --");

	return EXIT_SUCCESS;
}
