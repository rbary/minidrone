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

import fr.obeo.dsl.minidrone.Straight;
import fr.obeo.dsl.minidrone.TakePicture;
import fr.obeo.dsl.minidrone.Timer;
import fr.obeo.dsl.minidrone.Animation;
import fr.obeo.dsl.minidrone.AnimationMode;
import fr.obeo.dsl.minidrone.Audio;
import fr.obeo.dsl.minidrone.Jump;
import fr.obeo.dsl.minidrone.Turn;
import fr.obeo.dsl.minidrone.JumpMode;
import fr.obeo.dsl.minidrone.Led;
import fr.obeo.dsl.minidrone.MiniDroneProgram;
import fr.obeo.dsl.minidrone.Piloting;
import fr.obeo.dsl.minidrone.PilotingMode;
import fr.obeo.dsl.minidrone.RecordVideo;
import fr.obeo.dsl.minidrone.Speed;

/**
 * A service call to manage diagram elements labels
 */

public class LabelServices {

    // label computing for Straight instruction
    public String computeLabel(Straight instruction) {
        int distance = instruction.getDistance();
        return "Straight distance "+ distance+" m"; //$NON-NLS-1$ //$NON-NLS-2$
    }

    // label computing for Turn instruction
    public String computeLabel(Turn instruction) {
        return "Turn"; //$NON-NLS-1$
    }

    // label computing for Jump instruction
    public String computeLabel(Jump instruction) {
        JumpMode mode = instruction.getMode();
        return "Jump mode "+ mode; //$NON-NLS-1$
    }

    // label computing for Take Picture instruction
    public String computeLabel(TakePicture instruction) {
        return "Take Picture"; //$NON-NLS-1$
    }

    // label computing for Record Video instruction
    public String computeLabel(RecordVideo instruction) {
        Boolean enable = instruction.isEnable();
        return "Record Video "+enable; //$NON-NLS-1$
    }

    // label computing for Piloting instruction
    public String computeLabel(Piloting instruction) {
        PilotingMode mode = instruction.getMode();
        return "Piloting mode "+ mode; //$NON-NLS-1$
    }

    // label computing for Audio instruction
    public String computeLabel(Audio instruction) {
        return "Audio"; //$NON-NLS-1$
    }

    // label computing for Led instruction
    public String computeLabel(Led instruction) {
        return "Led"; //$NON-NLS-1$

    }

    // label computing for Timer instruction
    public String computeLabel(Timer instruction) {
        int duration = instruction.getDuration();
        return "Timer duration "+duration+" s"; //$NON-NLS-1$ //$NON-NLS-2$
    }

    // label computing for Animation instruction
    public String computeLabel(Animation instruction) {
        AnimationMode mode = instruction.getMode();
        return "Animation mode "+mode; //$NON-NLS-1$
    }
    
    // label computing for Speed instruction
    public String computeLabel(Speed instruction) {
        int percentage = instruction.getPercentage();
        return "Speed "+percentage+" %"; //$NON-NLS-1$ //$NON-NLS-2$
    }

    public String computeLabel(MiniDroneProgram p){
        String label = "minidrone "+p.getMinidroneName()+"\n"+ //$NON-NLS-1$ //$NON-NLS-2$
                       "speed "+p.getSpeedPercentage()+" %\n"+  //$NON-NLS-1$//$NON-NLS-2$
                       "volume "+p.getSoundVolume()+" %\n"+ //$NON-NLS-1$ //$NON-NLS-2$
                       "audio "+p.getAudioMode()+"\n"+  //$NON-NLS-1$//$NON-NLS-2$
                       "piloting "+p.getPiloting(); //$NON-NLS-1$       
        return label;        
    }
}
