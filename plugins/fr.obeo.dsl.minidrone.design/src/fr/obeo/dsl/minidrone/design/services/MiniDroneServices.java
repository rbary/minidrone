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



/**
 * A service called to compute the next one instruction in the minidrone program
 * instructions sequence from the current one
 */
public class MiniDroneServices {

    /**
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
    
    public boolean isLastInstruction(AbstractInstruction abstractIntruction) {
        MiniDroneProgram minidroneProgram = (MiniDroneProgram) abstractIntruction.eContainer();
        List<AbstractInstruction> instructions = minidroneProgram.getInstructions();
        int lastIndex = instructions.size()-1;
        if(abstractIntruction.equals(instructions.get(lastIndex))){
            return true;
        }
        return false; 
    }
}
