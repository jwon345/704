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
		case "pusherRetractedE":
			System.out.println("pusherRetracedE");
//			States.PUSHER_RETRACTED = status;
			break;
		case "testSignal":
			System.out.println("testSignalHere");
//			States.PUSHER_RETRACTED = status;
			break;
		case "motorSwitch":
			System.out.println("motor Turn On");
			States2.MOT_CONVEYOR_ON_OFF = !States2.MOT_CONVEYOR_ON_OFF;
//			States.PUSHER_RETRACTED = status;
			break;
		case "atPos1":
			System.out.println("atPos1");
			States2.bottlePos = 1;
			break;
		case "atPos2":
			System.out.println("atPos2");
			States2.bottlePos = 2;
			break;
		default: 
			System.err.println("Wrong sig name : "+signame);
			System.exit(1);
		}
	}
	
	//this might not be necessary....
	static final List<String> signames = Arrays.asList("atPos1", "atPos2");
	
	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}

}
