package org.compsys704;

import java.util.Arrays;
import java.util.List;

public class LoaderVizWorker extends Worker{

	@Override
	public void setSignal(boolean status) {
//		System.out.println(signame+"  "+status);
		switch(signame){
		
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
			"bottleDeployedE", "motConveyorOnOffE", "bottleAtPos1E");
	
	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}

}
