package run;
import java.net.*;
import java.io.*;
import org.conveyor.SignalClient2;
import org.conveyor.States2;

public class socketListener implements java.lang.Runnable{
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

	public void run()
	{
        try {
			System.out.println("started socket server");
			this.Go(1234);
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

			out.println(States2.bottlePos);
			String message = in.readLine() + ":";
			
			if (message.contains("newBottle"))
			{
				System.out.println("newBottle is here");
                new SignalClient2(10001, "ConveyorPlantCD.placedNewBottle").actionPerformed(null);
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
