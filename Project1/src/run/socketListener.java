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

			out.println(States.BOTTLE_AT_POS1?"0":"1");
			String message = in.readLine() + ":"; //append random chr to avoid ""
			
			if (message.contains("newBottle"))
			{
				// System.out.println("newBottle is here");
	    		new SignalClient(Ports.PORT_CONVEYOR_CONTROLLER, Ports.DEPLOY_SIGNAL).actionPerformed(null);
			}
			else
			{
				// System.out.println("OtherReq");
                // new SignalClient2(10001, "ConveyorPlantCD.placedNewBottle").actionPerformed(null);
				continue;
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
