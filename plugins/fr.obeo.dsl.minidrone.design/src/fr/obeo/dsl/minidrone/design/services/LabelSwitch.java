package fr.obeo.dsl.minidrone.design.services;

import fr.obeo.dsl.minidrone.Animation;
import fr.obeo.dsl.minidrone.AnimationMode;
import fr.obeo.dsl.minidrone.Audio;
import fr.obeo.dsl.minidrone.Block;
import fr.obeo.dsl.minidrone.Jump;
import fr.obeo.dsl.minidrone.Loop;
import fr.obeo.dsl.minidrone.Straight;
import fr.obeo.dsl.minidrone.TakePicture;
import fr.obeo.dsl.minidrone.Timer;
import fr.obeo.dsl.minidrone.Turn;
import fr.obeo.dsl.minidrone.JumpMode;
import fr.obeo.dsl.minidrone.Led;
import fr.obeo.dsl.minidrone.MiniDroneProgram;
import fr.obeo.dsl.minidrone.Piloting;
import fr.obeo.dsl.minidrone.PilotingMode;
import fr.obeo.dsl.minidrone.RecordVideo;
import fr.obeo.dsl.minidrone.Speed;
import fr.obeo.dsl.minidrone.util.MiniDroneSwitch;

public class LabelSwitch extends MiniDroneSwitch<String> {

    // Block instruction case
    public String caseBlock(Block block) {
        return "Block"; //$NON-NLS-1$
    }

    // Loop instruction case
    public String caseLoop(Loop loop) {
        return "while (" + loop.getCondition().getExpression() + ")"; //$NON-NLS-1$ //$NON-NLS-2$
    }

    // Straight instruction case
    public String caseStraight(Straight straight) {
        int distance = straight.getDistance();
        return "Straight distance " + distance + " m"; //$NON-NLS-1$ //$NON-NLS-2$
    }

    // Turn instruction case
    public String caseTurn(Turn turn) {
        return "Turn"; //$NON-NLS-1$
    }

    // Jump instruction case
    public String caseJump(Jump jump) {
        JumpMode mode = jump.getMode();
        return "Jump mode " + mode; //$NON-NLS-1$
    }

    // Take Picture instruction case
    public String caseTakePicture(TakePicture takePicture) {
        return "Take Picture"; //$NON-NLS-1$
    }

    // Record Video instruction case
    public String caseRecordVideo(RecordVideo recordVideo) {
        Boolean enable = recordVideo.isEnable();
        return "Record Video " + enable; //$NON-NLS-1$
    }

    // Piloting instruction case
    public String casePiloting(Piloting piloting) {
        PilotingMode mode = piloting.getMode();
        return "Piloting mode " + mode; //$NON-NLS-1$
    }

    // Audio instruction case
    public String caseAudio(Audio audio) {
        return "Audio"; //$NON-NLS-1$
    }

    // Led instruction case
    public String caseLed(Led led) {
        return "Led"; //$NON-NLS-1$
    }

    // Timer instruction case
    public String caseTimer(Timer timer) {
        int duration = timer.getDuration();
        return "Timer duration " + duration + " s"; //$NON-NLS-1$ //$NON-NLS-2$
    }

    // Animation instruction case
    public String caseAnimation(Animation animation) {
        AnimationMode mode = animation.getMode();
        return "Animation mode " + mode; //$NON-NLS-1$
    }

    // Speed instruction case
    public String caseSpeed(Speed speed) {
        int percentage = speed.getPercentage();
        return "Speed " + percentage + " %"; //$NON-NLS-1$ //$NON-NLS-2$
    }

    // Minidrone program case
    public String caseMiniDroneProgram(MiniDroneProgram minidroneProgram) {
        String label = "minidrone " + minidroneProgram.getMinidroneName() + "\n" + //$NON-NLS-1$ //$NON-NLS-2$
                "speed " + minidroneProgram.getSpeedPercentage() + " %\n" + //$NON-NLS-1$//$NON-NLS-2$
                "volume " + minidroneProgram.getSoundVolume() + " %\n" + //$NON-NLS-1$ //$NON-NLS-2$
                "audio " + minidroneProgram.getAudioMode() + "\n" + //$NON-NLS-1$//$NON-NLS-2$
                "piloting " + minidroneProgram.getPiloting(); //$NON-NLS-1$
        return label;
    }
}
