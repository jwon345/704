package org.conveyor;

import java.util.Arrays;
import java.util.List;

public class ConveyorVizWorker extends Worker {

    @Override
    public void setSignal(boolean status) {
        switch(signame){
            case Ports.BOTTLE_AT_POS1:
                States.BOTTLE_AT_START = status;
                break;
            case Ports.BOTTLE_LEFT_POS5:
                States.BOTTLE_AT_END = status;
                break;
            case Ports.MOT_CONVEYOR_ON_OFF:
                States.MOTOR_ON = status;
                break;
            case Ports.BOTTLE_DEPLOYED:
                // Handle logic
                break;
            case Ports.BOTTLE_FINISHED_AT_POS5:
                // Handle logic
                break;
            default: 
                System.err.println("Wrong sig name : "+signame);
                System.exit(1);
        }
    }

    static final List<String> signames = Arrays.asList(
        Ports.BOTTLE_AT_POS1,
        Ports.BOTTLE_LEFT_POS5,
        Ports.MOT_CONVEYOR_ON_OFF,
        Ports.BOTTLE_DEPLOYED,
        Ports.BOTTLE_FINISHED_AT_POS5
    );
    
    @Override
    public boolean hasSignal(String sn) {
        return signames.contains(sn);
    }
}
