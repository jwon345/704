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
		case "motorOn":
			System.out.println("motorOn");
//			States.PUSHER_RETRACTED = status;
			break;
		default: 
			System.err.println("Wrong sig name : "+signame);
			System.exit(1);
		}
	}
	
	
	static final List<String> signames = Arrays.asList("pusherRetractedE","pusherExtendedE","WPgrippedE","armAtSourceE","armAtDestE","emptyE", "testSignal");
	
	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}

}
