// ConveyorStates.java

package org.conveyor;

public class States2 {
    
    // State to check if a bottle is at position 1
    public static volatile boolean BOTTLE_AT_POS1 = false;
    
    // State to check if a bottle left position 5
    public static volatile boolean BOTTLE_LEFT_POS5 = false;
    
    // State to check the status of the conveyor motor
    public static volatile boolean MOT_CONVEYOR_ON_OFF = false;


    public static volatile boolean drawConveyorRunning = true;
    public static volatile int bottlePos = 0;
  

}
