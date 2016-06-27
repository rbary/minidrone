/**
 * Copyright (c) 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Obeo - initial API and implementation
 * 
 */

package fr.obeo.dsl.minidrone.design.services;

import java.util.List;

import fr.obeo.dsl.minidrone.Block;
import fr.obeo.dsl.minidrone.MiniDroneProgram;
import fr.obeo.dsl.minidrone.util.MiniDroneSwitch;
import fr.obeo.dsl.minidrone.AbstractInstruction;

public class NextInstructionSwitch extends MiniDroneSwitch<List<AbstractInstruction>>{
    
    // Block eContainer case 
    public List<AbstractInstruction> caseBlock(Block block){
        return block.getInstructions();
    }
    
    // MinidroneProgram eContainer case
    public List<AbstractInstruction> caseMiniDroneProgram(MiniDroneProgram minidrone){
        return minidrone.getInstructions();
    }
}