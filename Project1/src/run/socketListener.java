package run;
import java.net.*;
import java.io.*;
import org.compsys704.SignalClient;
import org.compsys704.States;
import org.compsys704.Ports;

public class socketListener implements java.lang.Runnable{
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
	private final int socketPort = 1234; 

	private int queTracking = 0;
	private boolean readyNewBottle = true;


	public void run()
	{
        try {
			System.out.println("started socket server");
			this.Go(socketPort); // starting server on port 1234 
		} catch (IOException e) {
			System.out.println("failed to start server");
			e.printStackTrace();
		}
	}
    public void Go(int port) throws IOException {

        serverSocket = new ServerSocket(port);
        while(true) {
			clientSocket = serverSocket.accept();
			out = new PrintWriter(clientSocket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

//			out.println(readyNewBottle?"1":"0"); // response to API
			
			if ((readyNewBottle && !States.BOTTLE_AT_POS1))
			{
				out.println("1");
			}
			else
			{
				out.println("0");
			}
			
			String message = in.readLine() + ":"; //append random chr to avoid ""
			
			if (message.contains("newBottle"))
			{
				// System.out.println("newBottle is here");
	    		new SignalClient(Ports.PORT_CONVEYOR_CONTROLLER, Ports.DEPLOY_SIGNAL).actionPerformed(null);
				readyNewBottle = false;
				// queTracking = 1;
			}
//			else
//			{
//				// System.out.println("OtherReq");
//                // new SignalClient2(10001, "ConveyorPlantCD.placedNewBottle").actionPerformed(null);
//				continue;
//			}

			if (!readyNewBottle)
			{
				if ((!States.DEPLOY && !States.BOTTLE_AT_POS1)) 
				{
					readyNewBottle = true;
			 		// System.out.println("new bottle ready");
				}
			}
				
        }
    }

    public void stop() throws IOException {
        in.close();
        out.close();
        clientSocket.close();
        serverSocket.close();
    }


}
