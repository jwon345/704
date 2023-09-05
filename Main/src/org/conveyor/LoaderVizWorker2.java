package org.conveyor;

import java.util.Arrays;
import java.util.List;

public class LoaderVizWorker2 extends Worker2{


	@Override
	public void setSignal(boolean status) {
		// does this listen to every signal passed in?
		System.out.println(signame+"  "+status);

		//switch case changes stateVariable class variables to update changes in to the gui
		switch(signame){
		case "motorSwitch":
//			System.out.println("motor Turn On");
			States2.MOT_CONVEYOR_ON_OFF = !States2.MOT_CONVEYOR_ON_OFF;
//			States.PUSHER_RETRACTED = status;
			break;
		case "atPos0":
//			System.out.println("atPos0");
			if (status == true)
			{
				States2.bottlePos = 0;
			}
			break;
		case "atPos1":
//			System.out.println("atPos1");
			if (status == true)
			{
				States2.bottlePos = 1;
			}
			break;
		case "atPos2":
//			System.out.println("atPos2");
			if (status == true)
			{
				States2.bottlePos = 2;
			}
			break;
		case "atPos4":
//			System.out.println("atPos4");
			if (status == true)
			{
				States2.bottlePos = 4;
			}
			break;
		case "atPos5":
//			System.out.println("atPos5");
			if (status == true)
			{
				States2.bottlePos = 5;
			}
			break;
		case "conveyorRunning":
			System.out.println("conveyorRunning");
			if (status == true)
			{
			States2.drawConveyorRunning = true;
			}
			break;
		case "conveyorNotRunning":
			System.out.println("conveyorOff");
			if (status == true)
			{
			States2.drawConveyorRunning = false;
			}
			break;
		default: 
			System.err.println("Wrong sig name : "+signame);
			System.exit(1);
		}
	}
	
	//this IS necessary....
	static final List<String> signames = Arrays.asList("atPos0","atPos1", "atPos2",  "atPos4", "atPos5", "conveyorRunning", "conveyorNotRunning" );
	
	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}

}