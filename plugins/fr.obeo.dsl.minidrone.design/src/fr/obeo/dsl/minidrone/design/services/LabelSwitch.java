package fr.obeo.dsl.minidrone.design.services;


import fr.obeo.dsl.minidrone.Animation;
import fr.obeo.dsl.minidrone.AnimationMode;
import fr.obeo.dsl.minidrone.Audio;
import fr.obeo.dsl.minidrone.AudioMode;
import fr.obeo.dsl.minidrone.Block;
import fr.obeo.dsl.minidrone.Jump;
import fr.obeo.dsl.minidrone.Loop;
import fr.obeo.dsl.minidrone.Straight;
import fr.obeo.dsl.minidrone.TakePicture;
import fr.obeo.dsl.minidrone.Timer;
import fr.obeo.dsl.minidrone.Turn;
import fr.obeo.dsl.minidrone.Volume;
import fr.obeo.dsl.minidrone.JumpMode;
import fr.obeo.dsl.minidrone.Posture;
import fr.obeo.dsl.minidrone.PostureMode;
import fr.obeo.dsl.minidrone.RecordVideo;
import fr.obeo.dsl.minidrone.Speed;
import fr.obeo.dsl.minidrone.util.MiniDroneSwitch;

public class LabelSwitch extends MiniDroneSwitch<String> {

    // Block instruction case
    public String caseBlock(Block block) {
        String label = "Block "+block.getName(); //$NON-NLS-1$
        return label; 
    }

    // Loop instruction case
    public String caseLoop(Loop loop) {
        return "while (" + loop.getCondition().getExpression() + ")"; //$NON-NLS-1$ //$NON-NLS-2$
    }

    // Straight instruction case
    public String caseStraight(Straight straight) {
        int distance = straight.getDistance();
        String label = distance+" m"; //$NON-NLS-1$
        return label;
    }

    // Turn instruction case
    public String caseTurn(Turn turn) {
        int angle = turn.getAngle();
        String label = "angle "+angle+"°";//$NON-NLS-1$ //$NON-NLS-2$
        return label;
    }

    // Jump instruction case
    public String caseJump(Jump jump) {
        JumpMode mode = jump.getMode();
        return mode.toString().toLowerCase();
    }

    // Take Picture instruction case
    public String caseTakePicture(TakePicture takePicture) {
        return "Take Picture"; //$NON-NLS-1$
    }

    // Record Video instruction case
    public String caseRecordVideo(RecordVideo recordVideo) {
        Boolean enable = recordVideo.isEnable();
        if (enable == true) {
            return "on"; //$NON-NLS-1$
        }
        return "off"; //$NON-NLS-1$
    }

    // Posture instruction case
    public String casePosture(Posture posture) {
        PostureMode mode = posture.getMode();
        return mode.toString().toLowerCase(); 
    }

    // Audio instruction case
    public String caseAudio(Audio audio) {
        AudioMode mode = audio.getMode();
        return mode.toString().toLowerCase();
    }

    // Timer instruction case
    public String caseTimer(Timer timer) {
        int duration = timer.getDuration();
        return duration+" s"; //$NON-NLS-1$
    }

    // Animation instruction case
    public String caseAnimation(Animation animation) {
        AnimationMode mode = animation.getMode();
        return mode.toString().toLowerCase();
    }

    // Speed instruction case
    public String caseSpeed(Speed speed) {
        int percentage = speed.getPercentage();
        String label = percentage+" %"; //$NON-NLS-1$
        return label;
    }
    
    // Volume instruction case
    public String caseVolume(Volume volume) {
        int percentage = volume.getPercentage();
        String label = percentage+" %"; //$NON-NLS-1$
        return label;
    }
}
