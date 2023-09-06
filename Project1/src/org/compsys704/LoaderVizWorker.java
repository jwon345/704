package org.compsys704;

import java.util.Arrays;
import java.util.List;

public class LoaderVizWorker extends Worker{

	@Override
	public void setSignal(boolean status) {
//		System.out.println(signame+"  "+status);
		switch(signame){
		// Capper
		case "cylPos5ZaxisExtendE":
		    States.CYL_POS5_ZAXIS_EXTENDED = status;
		    break;
		case "gripperTurnRetractE":
		    States.GRIPPER_TURN_RETRACTED = status;
		    break;
		case "gripperTurnExtendE":
		    States.GRIPPER_TURN_EXTENDED = status;
		    break;
		case "capGripperPos5ExtendE":
		    States.CAP_GRIPPER_POS5_EXTENDED = status;
		    break;
		case "cylClampBottleExtendE":
		    States.CYL_CLAMP_BOTTLE_EXTENDED = status;
		    break;
		case "bottleAtPos4E":
		    States.BOTTLE_AT_POS4 = status;
		    break;
		case "gripperZAxisLoweredE":
		    States.GRIPPER_ZAXIS_LOWERED = status;
		    break;
		case "gripperZAxisLiftedE":
		    States.GRIPPER_ZAXIS_LIFTED = status;
		    break;
		case "gripperTurnHomePosE":
		    States.GRIPPER_TURN_HOME_POS = status;
		    break;
		case "gripperTurnFinalPosE":
		    States.GRIPPER_TURN_FINAL_POS = status;
		    break;
		    
		//Filler
		case "bottleAtPos2E":
	        States.BOTTLE_AT_POS2 = status;
	        break;
	    case "valveInletOnOffE":
	        States.VALVE_INLET_ONOFF = status;
	        break;
	    case "valveInjectorOnOffE":
	        States.VALVE_INJECTOR_ONOFF = status;
	        break;
	    case "dosUnitValveRetractE":
	        States.DOS_UNIT_VALVE_RETRACT = status;
	        break;
	    case "dosUnitValveExtendE":
	        States.DOS_UNIT_VALVE_EXTEND = status;
	        break;
	    case "dosUnitEvacE":
	        States.DOS_UNIT_EVAC = status;
	        break;
	    case "dosUnitFilledE":
	        States.DOS_UNIT_FILLED = status;
	        break;
			
		//Conveyor
		case "bottleDeployedE":
			States.DEPLOY = status;
			if (States.DEPLOY && !States.BOTTLE_AT_POS1)
				States.DEPLOY = true;
			break;
			
		case "motConveyorOnOffE":
			States.MOTOR_ONOFF = status;
			break;
			
		case "bottleAtPos1E":
			States.BOTTLE_AT_POS1 = status;
			break;
		
		
		//ROTARY TABLE
		case "rotaryTableTriggerE":
			States.ROTARY_TABLE_TRIGGERED = status;
			break;
		
		
		//LID LOADER
		case "pusherRetractedE":
			States.PUSHER_RETRACTED = status;
			break;
		case "pusherExtendedE":
			if(!States.MAG_EMPTY && !States.PUSHER_EXTENDED)
				States.CAP_READY = true;
			States.PUSHER_EXTENDED = status;
			break;
		case "WPgrippedE":
			if(States.GRIPPED && States.ARM_AT_SOURCE){
				if(!status)
					States.CAP_READY = true;
			}
			States.GRIPPED = status;
			if(States.GRIPPED && States.ARM_AT_SOURCE){
				States.CAP_READY = false;
			}
			break;
		case "armAtSourceE":
			States.ARM_AT_SOURCE = status;
			break;
		case "armAtDestE":
			States.ARM_AT_DEST = status;
			break;
		case "emptyE":
			States.MAG_EMPTY = status;
			break;
		default: 
			System.err.println("Wrong sig name : "+signame);
			System.exit(1);
		}
	}
	
	
	static final List<String> signames = Arrays.asList("pusherRetractedE","pusherExtendedE","WPgrippedE","armAtSourceE","armAtDestE","emptyE",
			"rotaryTableTriggerE",
			"bottleDeployedE", "motConveyorOnOffE", "bottleAtPos1E", 
			"valveInjectorOnOffE", "valveInletOnOffE" , "dosUnitValveRetractE", "dosUnitValveExtendE", "bottleAtPos2E", "dosUnitEvacE" , "dosUnitFilledE",
			"cylPos5ZaxisExtendE", "gripperTurnRetractE", "gripperTurnExtendE", "capGripperPos5ExtendE", "cylClampBottleExtendE", "bottleAtPos4E", "gripperZAxisLoweredE", "gripperZAxisLiftedE", "gripperTurnHomePosE", "gripperTurnFinalPosE");
	
	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}

}
