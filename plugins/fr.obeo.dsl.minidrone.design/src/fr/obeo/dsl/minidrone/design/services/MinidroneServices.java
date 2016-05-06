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

import fr.obeo.dsl.minidrone.AbstractInstruction;
import fr.obeo.dsl.minidrone.MiniDroneProgram;

import java.util.List;

import org.eclipse.emf.ecore.EObject;



/**
 * 
 * @author rbary
 *
 */
public class MinidroneServices {

    /**
     * Called to get the next instruction from the current instruction in Minidrone Program instructions collection
     * @param abstractInstruction
     * @return AbstractInstruction
     */
    public AbstractInstruction getNextInstruction(AbstractInstruction abstractInstruction) {
        final NextInstructionSwitch nextInstructionSwitch = new NextInstructionSwitch();
        List<AbstractInstruction> instructions = nextInstructionSwitch.doSwitch(abstractInstruction.eContainer());
        int currentIndex = instructions.indexOf(abstractInstruction);
        if (currentIndex < instructions.size()) {
            return instructions.get(currentIndex + 1);
        }
        return null;
    }
    
    /**
     * Retrieve the last abstract instruction of Minidrone Program instructions collection
     * @param abstractIntruction
     * @return boolean
     */
    public boolean isTheLastInstruction(AbstractInstruction abstractIntruction) {
        MiniDroneProgram minidroneProgram = (MiniDroneProgram) abstractIntruction.eContainer();
        List<AbstractInstruction> instructions = minidroneProgram.getInstructions();
        int lastIndex = instructions.size()-1;
        if(abstractIntruction.equals(instructions.get(lastIndex))){
            return true;
        }
        return false; 
    }
    
    /**
     * Called to compute a specific label
     * @param object
     * @return String
     */
    public String computeLabel(EObject object){
        LabelSwitch labelSwitch = new LabelSwitch();
        return labelSwitch.doSwitch(object);
    } 
}
