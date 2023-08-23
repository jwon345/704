package org.conveyor;

public class Ports {
    // Input Signals
    public static final String BOTTLE_AT_POS1 = "ConveyorControllerCD.BOTTLE_AT_POS1";
    public static final String BOTTLE_LEFT_POS5 = "ConveyorControllerCD.BOTTLE_LEFT_POS5";
    
    // Output Signals
    public static final String MOT_CONVEYOR_ON_OFF = "ConveyorControllerCD.MOT_CONVEYOR_ON_OFF";
    
    // GUI Signals (Assumptions)
    public static final String BOTTLE_DEPLOYED = "ConveyorPlantCD.bottleDeployed";
    public static final String BOTTLE_FINISHED_AT_POS5 = "ConveyorPlantCD.BOTTLE_FINISHED_AT_POS5";
    
    public static final int PORT_CONVEYOR_PLANT = 10000;
}
