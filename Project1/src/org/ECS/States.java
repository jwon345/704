package org.ECS;

public class States {
	public static volatile boolean sirenONOFF_E = false;
	
	public static volatile int zoneOneLightingI_E = 0;
	public static volatile int zoneTwoLightingI_E = 0;
	public static volatile int zoneThreeLightingI_E = 0;
	public static volatile int zoneFourLightingI_E = 0;
	public static volatile int zoneFiveLightingI_E = 0;
	public static volatile int zoneSixLightingI_E = 0;
	public static volatile int zoneSevenLightingI_E = 0;
	    
	public static volatile boolean zoneOneLightONOFF_E = false;
	public static volatile boolean zoneTwoLightONOFF_E = false;
	public static volatile boolean zoneThreeLightONOFF_E = false;
	public static volatile boolean zoneFourLightONOFF_E = false;
	public static volatile boolean zoneFiveLightONOFF_E = false;
	public static volatile boolean zoneSixLightONOFF_E = false;
	public static volatile boolean zoneSevenLightONOFF_E = false;
	
	public static volatile boolean zoneOneWindowONOFF_E = false;
	public static volatile boolean zoneTwoWindowONOFF_E = false;
	public static volatile boolean zoneThreeWindowONOFF_E = false;
	public static volatile boolean zoneFourWindowONOFF_E = false;
	public static volatile boolean zoneFiveWindowONOFF_E = false;
	public static volatile boolean zoneSixWindowONOFF_E = false;
	public static volatile boolean zoneSevenWindowONOFF_E = false;
	
	
	public static volatile boolean zoneOneSevenFanONOFF_E = false;
	public static volatile boolean zoneOneSevenHeaterONOFF_E = false;
	public static volatile boolean zoneTwoThreeFanONOFF_E = false;
	public static volatile boolean zoneTwoThreeHeaterONOFF_E = false;
	public static volatile boolean zoneFourFiveSixACONOFF_E = false;
	    
	// CAPPER
    public static volatile boolean CYL_POS5_ZAXIS_EXTENDED = false;
    public static volatile boolean GRIPPER_TURN_RETRACTED = false;
    public static volatile boolean GRIPPER_TURN_EXTENDED = false;
    public static volatile boolean CAP_GRIPPER_POS5_EXTENDED = false;
    public static volatile boolean CYL_CLAMP_BOTTLE_EXTENDED = false;
    public static volatile boolean BOTTLE_AT_POS4 = false;
    public static volatile boolean GRIPPER_ZAXIS_LOWERED = false;
    public static volatile boolean GRIPPER_ZAXIS_LIFTED = false;
    public static volatile boolean GRIPPER_TURN_HOME_POS = false;
    public static volatile boolean GRIPPER_TURN_FINAL_POS = false;
	
	
	//FILLER
	public static volatile boolean BOTTLE_AT_POS2 = false;
	public static volatile boolean DOS_UNIT_EVAC = false;
	public static volatile boolean DOS_UNIT_FILLED = false;
	public static volatile boolean VALVE_INJECTOR_ONOFF = false;
	public static volatile boolean VALVE_INLET_ONOFF = false;
	public static volatile boolean DOS_UNIT_VALVE_RETRACT = false;
	public static volatile boolean DOS_UNIT_VALVE_EXTEND = false;
	
	// CONVEYOR
	public static volatile boolean MOTOR_ONOFF = false; 
	public static volatile boolean BOTTLE_AT_POS1 = false; 
	public static volatile boolean DEPLOY = false; 
	public static volatile boolean BottleLeftAtPos5 = false; 
	
	//TABLE
    public static volatile boolean ROTARY_TABLE_TRIGGERED = false;
    public static volatile boolean BOTTLE_AT_POS3 = false;
    public static volatile boolean BOTTLE_AT_POS5 = false;

	
	
	//LID LOADER
	public static volatile boolean ARM_AT_DEST = true;
	public static volatile boolean ARM_AT_SOURCE = !ARM_AT_DEST;
	public static volatile boolean PUSHER_RETRACTED = true;
	public static volatile boolean PUSHER_EXTENDED = !PUSHER_RETRACTED;
	public static volatile boolean GRIPPED = false;
	public static volatile boolean MAG_EMPTY = false;

	public static volatile boolean CAP_READY = false;
	
	
	
}
