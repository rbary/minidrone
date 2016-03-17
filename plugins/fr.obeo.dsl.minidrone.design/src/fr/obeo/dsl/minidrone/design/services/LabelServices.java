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

package fr.obeo.dsl.minidrone.design.services;

import fr.obeo.dsl.minidrone.Go;
import fr.obeo.dsl.minidrone.Jump;
import fr.obeo.dsl.minidrone.Turn;
import fr.obeo.dsl.minidrone.JumpType;

/**
 * A service call to manage diagram elements labels
 */

public class LabelServices {
    
	// Label computing for Go instruction
	public String computeLabel(Go instruction) {
			int distance = instruction.getDistance();
			return "Go : Distance = "+distance; //$NON-NLS-1$
	}
	
	// Label computing for Turn instruction
	public String computeLabel(Turn instruction) {
		int angle = instruction.getAngle();
		return "Turn : Angle = "+angle; //$NON-NLS-1$
	}
	
	// Label computing for Jump instruction
	public String computeLabel(Jump instruction) {
		JumpType jumpType = instruction.getJumpType();
		return "Jump : Type = "+jumpType; //$NON-NLS-1$
	}
}
