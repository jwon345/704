package org.conveyor;

public class Ports {
    // Input Signals
    public static final String BOTTLE_AT_POS1 = "ConveyorCD.bottleAtPos1";
    public static final String BOTTLE_LEFT_POS5 = "ConveyorCD.bottleLeftPos5";
    
    // Output Signals
    public static final String MOT_CONVEYOR_ON_OFF = "ConveyorCD.motConveyorOnOff";
    
    // GUI Signals (Assumptions)
    public static final String BOTTLE_DEPLOYED = "ConveyorCD.bottleDeployed";
    public static final String BOTTLE_FINISHED_AT_POS5 = "ConveyorCD.bottleFinishedAtPos5";
}
