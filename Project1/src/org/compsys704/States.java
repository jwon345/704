package org.compsys704;

public class States {
	
	// CONVEYOR
	public static volatile boolean MOTOR_ONOFF = false; 
	public static volatile boolean BOTTLE_AT_POS1 = false; 
	public static volatile boolean DEPLOY = false; 
		
	//TABLE
    public static volatile boolean ROTARY_TABLE_TRIGGERED = false;
	
	
	
	//LID LOADER
	public static volatile boolean ARM_AT_DEST = true;
	public static volatile boolean ARM_AT_SOURCE = !ARM_AT_DEST;
	public static volatile boolean PUSHER_RETRACTED = true;
	public static volatile boolean PUSHER_EXTENDED = !PUSHER_RETRACTED;
	public static volatile boolean GRIPPED = false;
	public static volatile boolean MAG_EMPTY = false;

	public static volatile boolean CAP_READY = false;
	
	
	
}
