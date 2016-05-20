package fr.obeo.dsl.minidrone.design.services;

import java.util.List;

import fr.obeo.dsl.minidrone.Block;
import fr.obeo.dsl.minidrone.MiniDroneProgram;
import fr.obeo.dsl.minidrone.util.MiniDroneSwitch;
import fr.obeo.dsl.minidrone.AbstractInstruction;

public class NextInstructionSwitch extends MiniDroneSwitch<List<AbstractInstruction>>{
    
    public List<AbstractInstruction> caseBlock(Block block){
        return block.getInstructions();
    }
    
    public List<AbstractInstruction> caseMiniDroneProgram(MiniDroneProgram minidrone){
        return minidrone.getInstructions();
    }
}