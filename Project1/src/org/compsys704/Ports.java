package org.compsys704;

public class Ports {
	
	//Capper TABLE
	public static final int PORT_Capper_PLANT = 10009;
	public static final int PORT_Capper_CONTROLLER= 10008;
	
	//Filler TABLE
	public static final int PORT_FILLER_PLANT = 10007;
	public static final int PORT_FILLER_CONTROLLER= 10006;
	
	//CONVEYOR TABLE
	public static final int PORT_CONVEYOR_PLANT = 10005;
	public static final int PORT_CONVEYOR_CONTROLLER = 10004;
	public static final String DEPLOY_SIGNAL = "ConveyorCD.bottleDeployed";
	
	//ROTARY TABLE
	public static final int PORT_TABLE_PLANT = 10003;
	public static final int PORT_TABLE_CONTROLLER = 10002;
	
	//LIDLOADER
	public static final String REQUEST_SIGNAL = "ControllerCD.request";
	public static final String REFILL_SIGNAL = "PlantCD.refill";
	public static final String ENABLE_SIGNAL = "PlantCD.enable";
	public static final int PORT_LOADER_PLANT = 10001;
	public static final int PORT_LOADER_CONTROLLER = 10000;
	public static final int PORT_LOADER_VIZ = 20000;
	
	// Manual 
	public static final String SIGNAL_PUSHER_EXTEND   = "ControllerCD.pusherExtendM";
//	public static final String SIGNAL_VACOFF          = "ControllerCD.vacOffM";
	public static final String SIGNAL_VACON           = "ControllerCD.vacOnM";
	public static final String SIGNAL_ARM_SOURCE      = "ControllerCD.armSourceM";
	public static final String SIGNAL_ARM_DEST        = "ControllerCD.armDestM";
	public static final String SIGNAL_Mode            = "ControllerCD.mode";
}
