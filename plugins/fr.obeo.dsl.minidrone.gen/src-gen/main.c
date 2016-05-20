/**
 * Copyright (c) 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Obeo - initial API and implementation
 *
 */

/*****************************************
 *
 *             include
 *
 *****************************************/

#include "JumpingSumoPiloting.h"

/*****************************************
 *
 *             private implementation
 *
 *****************************************/

void stateChanged(eARCONTROLLER_DEVICE_STATE newState,
		eARCONTROLLER_ERROR error, void *customData) {
	ARSAL_PRINT(ARSAL_PRINT_INFO, TAG_MAIN,
			"    - stateChanged newState: %d .....", newState);

	switch (newState) {
	case ARCONTROLLER_DEVICE_STATE_STOPPED:
		ARSAL_Sem_Post(&(stateSem));
		break;

	case ARCONTROLLER_DEVICE_STATE_RUNNING:
		ARSAL_Sem_Post(&(stateSem));
		break;
	default:
		break;
	}
}

void commandReceived(eARCONTROLLER_DICTIONARY_KEY commandKey,
		ARCONTROLLER_DICTIONARY_ELEMENT_t *elementDictionary, void *customData) {
	ARCONTROLLER_Device_t *deviceController = customData;

	if (deviceController != NULL) {
		// if the command received is a battery state changed
		if (commandKey
				== ARCONTROLLER_DICTIONARY_KEY_COMMON_COMMONSTATE_BATTERYSTATECHANGED) {
			ARCONTROLLER_DICTIONARY_ARG_t *arg = NULL;
			ARCONTROLLER_DICTIONARY_ELEMENT_t *singleElement = NULL;

			if (elementDictionary != NULL) {
				// get the command received in the device controller
				HASH_FIND_STR(elementDictionary,
						ARCONTROLLER_DICTIONARY_SINGLE_KEY, singleElement);

				if (singleElement != NULL) {
					// get the value
					HASH_FIND_STR(singleElement->arguments,
							ARCONTROLLER_DICTIONARY_KEY_COMMON_COMMONSTATE_BATTERYSTATECHANGED_PERCENT,
							arg);

					if (arg != NULL) {
						ARSAL_PRINT(ARSAL_PRINT_INFO, TAG_MAIN,
								"command received :%d", arg->value.U8);
					} else {
						ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG_MAIN, "arg is NULL");
					}
				} else {
					ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG_MAIN,
							"singleElement is NULL");
				}
			} else {
				ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG_MAIN, "elements is NULL");
			}
		}
	}
}

/*****************************************
 *
 *             main implementation
 *
 *****************************************/
int main(int argc, char **argv) {
	//local declarations
	int error = 0;
	speedPercentage = DEFAULT_SPEED_PERCENT;
	ARSAL_Sem_Init(&(stateSem), 0, 0);
	eARCONTROLLER_DEVICE_STATE deviceState;
	ARDISCOVERY_Device_t *discoveryDevice = NULL;
	ARCONTROLLER_Device_t *deviceController = NULL;

	/*****************************************
	 *
	 *   		Initialization
	 *
	 *****************************************/

	ARSAL_PRINT(ARSAL_PRINT_INFO, TAG_MAIN, "-- JSPilotingMinimal --");

	// Create new discovery device
	if (!error) {
		discoveryDevice = createInitDiscoveryDevice();
		if (discoveryDevice == NULL) {
			error = 1;
		}
	}

	// Create new device controller
	if (!error) {
		deviceController = createDeviceController(discoveryDevice);
		if (discoveryDevice == NULL) {
			error = 1;
		}
	}

	if (!error) {
		eARCONTROLLER_ERROR errorController = ARCONTROLLER_OK;
		errorController = ARCONTROLLER_Device_AddStateChangedCallback(
				deviceController, stateChanged, deviceController);

		if (errorController != ARCONTROLLER_OK) {
			ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG_MAIN,
					"add State callback failed.");
			error = 1;
		}
	}

	if (!error) {
		eARCONTROLLER_ERROR errorController = ARCONTROLLER_OK;
		errorController = ARCONTROLLER_Device_AddCommandReceivedCallback(
				deviceController, commandReceived, deviceController);

		if (errorController != ARCONTROLLER_OK) {
			ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG_MAIN,
					"add State callback failed.");
			error = 1;
		}
	}

	if (!error) {
		error = startDeviceController(deviceController);
	}
    /*****************************************
     *
     *			Piloting
     *
     *****************************************/
		// jump command
		jump(deviceController, LONG);

		// straight command
		straight(deviceController, 3);

		// turn command
		turn(deviceController, 90);

		// animation command
		animation(deviceController, SPIRAL);

		// timer command
		timer(5);


		// Send posture setting command
		posture(deviceController, KICKER);

		// speed command
		speed(75);

		// volume command
		volume(deviceController, 75);


		//audio command
		audio(deviceController, ROBOT);
    /*****************************************
     *
     *			End
     *
     *****************************************/
	stopDeviceController(deviceController);
	ARSAL_PRINT(ARSAL_PRINT_INFO, TAG_MAIN, "-- END --");
	return EXIT_SUCCESS;
}
