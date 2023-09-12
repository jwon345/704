package org.compsys704;

public class Ports {
	//ECS
	public static final int PORT_ECS_HVAC_PLANT = 10001;
	public static final int PORT_ECS_HVAC_CONTROLLER= 10000;
	public static final String CurrentTime = "ECS_HVACCD.currentTime";
	public static final String zoneOneSevenTemp = "ECS_HVACCD.zoneOneSevenTemp";
	public static final String zoneOneSevenHumid = "ECS_HVACCD.zoneOneSevenHumid";
	
	public static final String zoneTwoThreeTemp = "ECS_HVACCD.zoneTwoThreeTemp";
	public static final String zoneTwoThreeHumid = "ECS_HVACCD.zoneTwoThreeHumid";
	
	public static final String zoneFourFiveSixTemp = "ECS_HVACCD.zoneFourFiveSixTemp";
	public static final String zoneFourFiveSixHumid = "ECS_HVACCD.zoneFourFiveSixHumid";
	
	public static final String zoneOneOccupancy_B = "ECS_HVACCD.zoneOneOccupancy_B";
	public static final String zoneSevenOccupancy_B = "ECS_HVACCD.zoneSevenOccupancy_B";
	
	
	public static final int PORT_ECS_LIGHTING_CONTROLLER = 10002;
	public static final String CurrentTime_2 = "ECS_LightingCD.currentTime_2";
	public static final String zoneOneOccupancy = "ECS_LightingCD.zoneOneOccupancy";
	public static final String zoneTwoOccupancy = "ECS_LightingCD.zoneTwoOccupancy";
	public static final String zoneThreeOccupancy = "ECS_LightingCD.zoneThreeOccupancy";
	public static final String zoneFourOccupancy = "ECS_LightingCD.zoneFourOccupancy";
	public static final String zoneFiveOccupancy = "ECS_LightingCD.zoneFiveOccupancy";
	public static final String zoneSixOccupancy = "ECS_LightingCD.zoneSixOccupancy";
	public static final String zoneSevenOccupancy = "ECS_LightingCD.zoneSevenOccupancy";

	public static final String zoneOneLightingI = "ECS_LightingCD.zoneOneLightingI";
	public static final String zoneTwoLightingI = "ECS_LightingCD.zoneTwoLightingI";
	public static final String zoneThreeLightingI = "ECS_LightingCD.zoneThreeLightingI";
	public static final String zoneFourLightingI = "ECS_LightingCD.zoneFourLightingI";
	public static final String zoneFiveLightingI = "ECS_LightingCD.zoneFiveLightingI";
	public static final String zoneSixLightingI = "ECS_LightingCD.zoneSixLightingI";
	public static final String zoneSevenLightingI = "ECS_LightingCD.zoneSevenLightingI";
	
	public static final int PORT_ECS_SMOKE_CONTROLLER = 10004;
	public static final String detectSmoke = "ECS_SmokeCD.detectSmoke";
	
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
