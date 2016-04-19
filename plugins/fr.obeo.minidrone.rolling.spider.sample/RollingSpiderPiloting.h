#ifndef _ROLLINGSPIDER_PILOTING_H_
#define _ROLLINGSPIDER_POLITING_H_

#include <ihm.h>

#include <libARController/ARController.h>


int ardiscoveryConnect (ARCONTROLLER_Device_t *deviceManager);
int startNetwork (ARCONTROLLER_Device_t *deviceManager);
void onDisconnectNetwork(ARNETWORK_Manager_t *manager, ARNETWORKAL_Manager_t *alManager, void *customData);
int stopNetwork(ARCONTROLLER_Device_t *deviceManager);
void stateChanged(eARCONTROLLER_DEVICE_STATE newState, eARCONTROLLER_ERROR error, void *customData);
void commandReceived (eARCONTROLLER_DICTIONARY_KEY commandKey, ARCONTROLLER_DICTIONARY_ELEMENT_t *elementDictionary, void *customData);
void batteryStateChanged (uint8_t percent);

//IHM callbacks
void onInputEvent (eIHM_INPUT_EVENT event, void *customData);
int customPrintCallBack (eARSAL_PRINT_LEVEL level, const char *tag, const char *format, va_list va);

#endif /* _ROLLINGSPIDER_PILOTING_H_ */
