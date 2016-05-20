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
 ****************************************/

ARDISCOVERY_Device_t * createInitDiscoveryDevice() {
	eARDISCOVERY_ERROR errorDiscovery = ARDISCOVERY_OK;
	ARDISCOVERY_Device_t *discoveryDevice = NULL;

	discoveryDevice = ARDISCOVERY_Device_New(&errorDiscovery);

	if (errorDiscovery == ARDISCOVERY_OK) {
		//create a specific JS discovery device
		errorDiscovery = ARDISCOVERY_Device_InitWifi(discoveryDevice,
				ARDISCOVERY_PRODUCT_JS, "JS", JS_IP_ADDRESS, JS_DISCOVERY_PORT);

		if (errorDiscovery != ARDISCOVERY_OK) {
			ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG_JS_CMD, "Discovery error :%s",
					ARDISCOVERY_Error_ToString(errorDiscovery));
			return NULL;
		}
	} else {
		ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG_JS_CMD, "Discovery error :%s",
				ARDISCOVERY_Error_ToString(errorDiscovery));
		return NULL;
	}

	ARSAL_PRINT(ARSAL_PRINT_INFO, TAG_JS_CMD,
			"Creation of discovery device succeeded");
	return discoveryDevice;
}

ARCONTROLLER_Device_t * createDeviceController(
		ARDISCOVERY_Device_t *discoveryDevice) {
	eARCONTROLLER_ERROR errorController = ARCONTROLLER_OK;
	ARCONTROLLER_Device_t *deviceController = NULL;

	deviceController = ARCONTROLLER_Device_New(discoveryDevice,
			&errorController);

	if (errorController != ARCONTROLLER_OK) {
		ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG_JS_CMD,
				"Creation of device controller failed.");
		return NULL;
	}
	ARSAL_PRINT(ARSAL_PRINT_INFO, TAG_JS_CMD,
			"Creation of device controller succeeded.");
	ARDISCOVERY_Device_Delete(&discoveryDevice);
	return deviceController;
}

int startDeviceController(ARCONTROLLER_Device_t *deviceController) {
	int failed = 0;
	eARCONTROLLER_ERROR errorController = ARCONTROLLER_OK;
	ARSAL_PRINT(ARSAL_PRINT_INFO, TAG_JS_CMD,
			"Start device controller and try connecting...");
	errorController = ARCONTROLLER_Device_Start(deviceController);

	sleep(1);

	if (errorController != ARCONTROLLER_OK) {
		ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG_JS_CMD,
				" start device controller failed ...");
		failed = 1;
	}
	return failed;
}

void stopDeviceController(ARCONTROLLER_Device_t *deviceController) {
	eARCONTROLLER_ERROR errorController = ARCONTROLLER_OK;
	ARSAL_PRINT(ARSAL_PRINT_INFO, TAG_JS_CMD, "disconnecting ...");
	errorController = ARCONTROLLER_Device_Stop(deviceController);

	if (errorController != ARCONTROLLER_OK) {
		ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG_JS_CMD, "add callback failed.");
	}
}

eARCONTROLLER_DEVICE_STATE getDeviceState(
		ARCONTROLLER_Device_t *deviceController, ARSAL_Sem_t stateSem,
		eARCONTROLLER_DEVICE_STATE deviceState) {
	// wait state update update
	ARSAL_Sem_Wait(&(stateSem));

	eARCONTROLLER_ERROR errorController = ARCONTROLLER_OK;
	deviceState = ARCONTROLLER_Device_GetState(deviceController,
			&errorController);

	if ((errorController != ARCONTROLLER_OK)
			|| (deviceState != ARCONTROLLER_DEVICE_STATE_RUNNING)) {
		ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG_JS_CMD, "- deviceState :%d",
				deviceState);
		ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG_JS_CMD, "- error :%s",
				ARCONTROLLER_Error_ToString(errorController));
	}
	return deviceState;
}

// Commands sending
int none(ARCONTROLLER_Device_t *deviceController) {
	int failed = 0;
	eARCONTROLLER_ERROR errorController = ARCONTROLLER_OK;

	errorController = deviceController->jumpingSumo->setPilotingPCMDFlag(
			deviceController->jumpingSumo, 0);
	errorController = deviceController->jumpingSumo->setPilotingPCMDSpeed(
			deviceController->jumpingSumo, 0);
	errorController = deviceController->jumpingSumo->setPilotingPCMDTurn(
			deviceController->jumpingSumo, 0);

	usleep(50000);
	if (errorController != ARCONTROLLER_OK) {
		ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG_JS_CMD,
				"Send audio mode setting command failed ...");
		failed = 1;
	}


	return failed;
}

int straight(ARCONTROLLER_Device_t *deviceController, int distance) {
	int failed = 0;

	eARCONTROLLER_ERROR errorController = ARCONTROLLER_OK;
	errorController = deviceController->jumpingSumo->setPilotingPCMDFlag(
			deviceController->jumpingSumo, 1);
	errorController = deviceController->jumpingSumo->setPilotingPCMDSpeed(
			deviceController->jumpingSumo, speedPercentage);


	// compute the suitable timer to get the appropriate distance function of speed percentage declared
	usleep(distance * computeStraightUsleep(distance, speedPercentage));

	none(deviceController);

	if (errorController != ARCONTROLLER_OK) {
		ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG_JS_CMD,
				"send straight command failed ...");
		failed = 1;
	}
	return failed;
}

int turn(ARCONTROLLER_Device_t *deviceController, int angle) {
	int failed = 0;

	eARCONTROLLER_ERROR errorController = ARCONTROLLER_OK;
	errorController = deviceController->jumpingSumo->setPilotingPCMDFlag(
			deviceController->jumpingSumo, 1);
	errorController = deviceController->jumpingSumo->setPilotingPCMDTurn(
			deviceController->jumpingSumo, computeAnglePercent(angle));

	//microseconds timer to let the minidrone receive the command
	usleep(500000);

	none(deviceController);

	if (errorController != ARCONTROLLER_OK) {
		ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG_JS_CMD, "send turn command failed");
		failed = 1;
	}
	return failed;
}

int jump(ARCONTROLLER_Device_t *deviceController, int jumpType) {
	int failed = 0;
	eARCONTROLLER_ERROR errorController = ARCONTROLLER_OK;

	switch (jumpType) {
	case JUMP_HIGH:
		errorController = deviceController->jumpingSumo->sendAnimationsJump(
				deviceController->jumpingSumo,
				ARCOMMANDS_JUMPINGSUMO_ANIMATIONS_JUMP_TYPE_HIGH);
		break;
	case JUMP_LONG:
		errorController = deviceController->jumpingSumo->sendAnimationsJump(
				deviceController->jumpingSumo,
				ARCOMMANDS_JUMPINGSUMO_ANIMATIONS_JUMP_TYPE_LONG);
		break;
	default:
		break;
	}

	if (errorController != ARCONTROLLER_OK) {
		ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG_JS_CMD,
				"send jump command failed ...");
		failed = 1;
	}
	return failed;
}

void timer(int duration) {
	sleep(duration);
}

void speed(int newValue) {
	speedPercentage = newValue;
}

int posture(ARCONTROLLER_Device_t *deviceController,
		int postureType) {
	int failed = 0;
	eARCONTROLLER_ERROR errorController = ARCONTROLLER_OK;

	switch (postureType) {
	case JUMPER:
		errorController = deviceController->jumpingSumo->sendPilotingPosture(
				deviceController->jumpingSumo,
				ARCOMMANDS_JUMPINGSUMO_PILOTING_POSTURE_TYPE_JUMPER);
		break;
	case KICKER:
		errorController = deviceController->jumpingSumo->sendPilotingPosture(
				deviceController->jumpingSumo,
				ARCOMMANDS_JUMPINGSUMO_PILOTING_POSTURE_TYPE_KICKER);
		break;
	case AUTOBALANCE:
		errorController = deviceController->jumpingSumo->sendPilotingPosture(
				deviceController->jumpingSumo,
				ARCOMMANDS_JUMPINGSUMO_PILOTING_POSTURE_TYPE_STANDING);
		break;
	default:
		break;
	}
	//microseconds timer to let the minidrone receive the command
	usleep(MIN_USEC_TIMER);

	if (errorController != ARCONTROLLER_OK) {
		ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG_JS_CMD,
				"Send piloting posture setting command failed ...");
		failed = 1;
	}
	return failed;
}

int animation(ARCONTROLLER_Device_t *deviceController, int animation) {
	int failed = 0;
	eARCONTROLLER_ERROR errorController = ARCONTROLLER_OK;

	switch (animation) {
	case TOUCH:
		deviceController->jumpingSumo->sendAnimationsSimpleAnimation(
				deviceController->jumpingSumo,
				ARCOMMANDS_JUMPINGSUMO_ANIMATIONS_SIMPLEANIMATION_ID_TAP);
		break;
	case SHAKE:
		deviceController->jumpingSumo->sendAnimationsSimpleAnimation(
				deviceController->jumpingSumo,
				ARCOMMANDS_JUMPINGSUMO_ANIMATIONS_SIMPLEANIMATION_ID_SLOWSHAKE);
		break;
	case METRONOME:
		deviceController->jumpingSumo->sendAnimationsSimpleAnimation(
				deviceController->jumpingSumo,
				ARCOMMANDS_JUMPINGSUMO_ANIMATIONS_SIMPLEANIMATION_ID_METRONOME);
		break;
	case WAVE:
		deviceController->jumpingSumo->sendAnimationsSimpleAnimation(
				deviceController->jumpingSumo,
				ARCOMMANDS_JUMPINGSUMO_ANIMATIONS_SIMPLEANIMATION_ID_ONDULATION);
		break;
	case SPIN:
		deviceController->jumpingSumo->sendAnimationsSimpleAnimation(
				deviceController->jumpingSumo,
				ARCOMMANDS_JUMPINGSUMO_ANIMATIONS_SIMPLEANIMATION_ID_SPIN);
		break;
	case SPINJUMP:
		deviceController->jumpingSumo->sendAnimationsSimpleAnimation(
				deviceController->jumpingSumo,
				ARCOMMANDS_JUMPINGSUMO_ANIMATIONS_SIMPLEANIMATION_ID_SPINJUMP);
		break;
	case SPINPOSTURE:
		deviceController->jumpingSumo->sendAnimationsSimpleAnimation(
				deviceController->jumpingSumo,
				ARCOMMANDS_JUMPINGSUMO_ANIMATIONS_SIMPLEANIMATION_ID_SPINTOPOSTURE);
		break;
	case SLALOM:
		deviceController->jumpingSumo->sendAnimationsSimpleAnimation(
				deviceController->jumpingSumo,
				ARCOMMANDS_JUMPINGSUMO_ANIMATIONS_SIMPLEANIMATION_ID_SLALOM);
		break;
	case SPIRAL:
		deviceController->jumpingSumo->sendAnimationsSimpleAnimation(deviceController->jumpingSumo,
				ARCOMMANDS_JUMPINGSUMO_ANIMATIONS_SIMPLEANIMATION_ID_SPIRAL);
		break;
	default:
		break;
	}

	usleep(2000000);

	none(deviceController);

	if (errorController != ARCONTROLLER_OK) {
		ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG_JS_CMD, "send turn command failed");
		failed = 1;
	}
	return failed;
}

int audio(ARCONTROLLER_Device_t *deviceController,
		int audioMode) {
	int failed = 0;
	eARCONTROLLER_ERROR errorController = ARCONTROLLER_OK;

	// Setting the audio mode
	switch (audioMode) {
	case MONSTER:
		errorController = deviceController->jumpingSumo->sendAudioSettingsTheme(
				deviceController->jumpingSumo,
				ARCOMMANDS_JUMPINGSUMO_AUDIOSETTINGS_THEME_THEME_MONSTER);
		break;
	case INSECT:
		errorController = deviceController->jumpingSumo->sendAudioSettingsTheme(
				deviceController->jumpingSumo,
				ARCOMMANDS_JUMPINGSUMO_AUDIOSETTINGS_THEME_THEME_INSECT);
		break;
	case ROBOT:
		errorController = deviceController->jumpingSumo->sendAudioSettingsTheme(
				deviceController->jumpingSumo,
				ARCOMMANDS_JUMPINGSUMO_AUDIOSETTINGS_THEME_THEME_ROBOT);
		break;
	default:
		errorController = deviceController->jumpingSumo->sendAudioSettingsTheme(
				deviceController->jumpingSumo,
				ARCOMMANDS_JUMPINGSUMO_AUDIOSETTINGS_THEME_THEME_DEFAULT);
		break;
	}

	//microsecond timer to let the minidrone receive the command
	usleep(MIN_USEC_TIMER);

	if (errorController != ARCONTROLLER_OK) {
		ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG_JS_CMD,
				"Send audio mode setting command failed ...");
		failed = 1;
	}
	return failed;
}

int volume(ARCONTROLLER_Device_t *deviceController,
		int volumePercentage) {
	int failed = 0;
	eARCONTROLLER_ERROR errorController = ARCONTROLLER_OK;

	// setting the volume percentage
	errorController =
			deviceController->jumpingSumo->sendAudioSettingsMasterVolume(
					deviceController->jumpingSumo, volumePercentage);

	if (errorController != ARCONTROLLER_OK) {
		ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG_JS_CMD,
				"Send audio mode setting command failed ...");
		failed = 1;
	}

	return failed;
}

useconds_t computeStraightUsleep(int distance, int speedPercent) {
	useconds_t u_timer;

	switch (speedPercent) {
	case 20:
		u_timer = U_TIMER_SPEED_20;
		break;
	case 30:
		u_timer = U_TIMER_SPEED_30;
		break;
	case 40:
		u_timer = U_TIMER_SPEED_40;
		break;
	case 50:
		u_timer = U_TIMER_SPEED_50;
		break;
	case 60:
		u_timer = U_TIMER_SPEED_60;
		break;
	case 70:
		u_timer = U_TIMER_SPEED_70;
		break;
	case 80:
		u_timer = U_TIMER_SPEED_80;
		break;
	case 90:
		u_timer = U_TIMER_SPEED_90;
		break;
	case 100:
		u_timer = U_TIMER_SPEED_100;
		break;
	default:
		break;
	}
	return u_timer;
}

int computeAnglePercent(int angle) {
	int angle_percent;
	angle_percent = (100 * angle) / ANGLE_MAX;
	return angle_percent;
}
