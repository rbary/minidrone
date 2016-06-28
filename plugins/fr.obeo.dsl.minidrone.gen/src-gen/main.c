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
 *             private implementations
 *
 *****************************************/
void Zheta (){
	// straight command
	straight(deviceController, 0);
	// turn command
	turn(deviceController, 0);
	// block command
	Cassiopea();
}

void Cassiopea (){
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
	error = startDeviceController(deviceController);
}
/*****************************************
 *
 *			Piloting
 *
 *****************************************/
	// straight command
	straight(deviceController, 0);
	// block command
	Zheta();

/*****************************************
 *
 *			End
 *
 *****************************************/
stopDeviceController(deviceController);
	return EXIT_SUCCESS;
}
