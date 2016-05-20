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

#ifndef JUMPINGSUMOPILOTING_H_
#define JUMPINGSUMOPILOTING_H_

/*****************************************
 *
 *             include
 *
 *****************************************/
#include <stdlib.h>
#include <curses.h>
#include <string.h>
#include <unistd.h>

#include <ARDroneSDK_Unix/include/libARSAL/ARSAL.h>
#include <ARDroneSDK_Unix/include/libARController/ARController.h>
#include <ARDroneSDK_Unix/include/libARDiscovery/ARDiscovery.h>


/*****************************************
 *
 *             define :
 *
 *****************************************/
#define DEFAULT_SPEED_PERCENT 50
#define ANGLE_MAX 360
#define TAG_JS_CMD "JSPilotingMinCommands"
#define TAG_MAIN "Main"
#define JS_IP_ADDRESS "192.168.2.1"
#define JS_DISCOVERY_PORT 44444

// Minimal utimer
#define MIN_USEC_TIMER 500000

// Unit utimers
#define U_TIMER_SPEED_20 4500000
#define U_TIMER_SPEED_30 2000000
#define U_TIMER_SPEED_40 1300000
#define U_TIMER_SPEED_50 860000
#define U_TIMER_SPEED_60 650000
#define U_TIMER_SPEED_70 570000
#define U_TIMER_SPEED_80 400000
#define U_TIMER_SPEED_90 350000
#define U_TIMER_SPEED_100 300000

//Jump mode
#define JUMP_LONG 0
#define JUMP_HIGH 1

//Posture mode
#define JUMPER 0
#define KICKER 1
#define AUTOBALANCE 2

//Audio Mode
#define MONSTER 0
#define INSECT 1
#define ROBOT 2

//Animations
#define SPIN 0
#define TOUCH 1
#define SHAKE 2
#define METRONOME 3
#define WAVE 4
#define SPINJUMP 5
#define SLALOM 6
#define SPINPOSTURE 7
#define SPIRAL 8

ARSAL_Sem_t stateSem;
int speedPercentage;

// called to create and init a discovery device; implies a JS discovery device creation with Wifi init
ARDISCOVERY_Device_t * createInitDiscoveryDevice();

// called to create a device controller
ARCONTROLLER_Device_t * createDeviceController(ARDISCOVERY_Device_t *discoveryDevice);

// called to add a state change callback to a device controller to be notified when the device controller starts, stops
int addStateChangeCallbackToDeviceController(ARCONTROLLER_Device_t *deviceController, ARCONTROLLER_Device_StateChangedCallback_t *stateChangedCallback);

// called to add a command reception callback to a device controller to be notified when a command has been received from JS
int addCommandReceivedCallbackToDeviceController(ARCONTROLLER_Device_t *deviceController, ARCONTROLLER_DICTIONARY_CALLBACK_t commandReceivedCallback);

// called to start the device controller implies a wifi connection between our system (Unix laptop) and the JS as result
int startDeviceController(ARCONTROLLER_Device_t *deviceController);

// called to stop the device controller implies a wifi disconnection between our system(Unix laptop) and the JS as result
void stopDeviceController(ARCONTROLLER_Device_t *deviceController);

// called to get the state of the JS
eARCONTROLLER_DEVICE_STATE getDeviceState(ARCONTROLLER_Device_t *deviceController,ARSAL_Sem_t stateSem, eARCONTROLLER_DEVICE_STATE deviceState );

// Called to send a none command
int none(ARCONTROLLER_Device_t *deviceController);

// Called to send a command making go straight the JS
int straight(ARCONTROLLER_Device_t *deviceController,int distance);

// Called to send a command making turn the JS
int turn(ARCONTROLLER_Device_t *deviceController,int angle);

// Called to send a command making jump the JS
int jump(ARCONTROLLER_Device_t *deviceController,int jumpMode);

// Called to run a timer in seconds
void timer(int duration);

// Called to send a command setting speed percentage
void speed(int newValue);

// Called to send a command to set the piloting posture of the JS
int posture(ARCONTROLLER_Device_t *deviceController, int postureMode);

// Called to send a command to make the js animate (acrobatics)
int animation(ARCONTROLLER_Device_t *deviceController, int animation);

// Called to send a command setting audio theme and volume of the JS
int audio(ARCONTROLLER_Device_t *deviceController, int audioMode);

// Called to set the volume
int volume(ARCONTROLLER_Device_t *deviceController, int volumePercentage);

// Called to compute the microsecond sleep when we send command to make straight the JS
useconds_t computeStraightUsleep(int distance, int velocityPercent);

// Called to compute angle percent
int computeAnglePercent(int angle);

#endif /* JUMPINGSUMOPILOTING_H_ */
