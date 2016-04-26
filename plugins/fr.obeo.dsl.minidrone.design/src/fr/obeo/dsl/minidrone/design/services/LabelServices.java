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

import org.eclipse.emf.ecore.EObject;

/**
 * A service call to manage diagram elements labels
 */

public class LabelServices {
    
    public String computeLabel(EObject object){
        LabelSwitch labelSwitch = new LabelSwitch();
        return labelSwitch.doSwitch(object);
    }   
}
