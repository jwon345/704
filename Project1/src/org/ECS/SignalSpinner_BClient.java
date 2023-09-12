package org.ECS;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SignalSpinner_BClient extends SignalClient implements ChangeListener {

    public SignalSpinner_BClient(int p, String dest) {
        super(p, dest);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        JSpinner spinner = (JSpinner) e.getSource();
        
        // Extract the integer value from the spinner
        int value = (Integer) spinner.getValue();

        try {
            if (s.isClosed()) {
                s = new Socket();
                s.connect(new InetSocketAddress(ip, port), 10);
                oos = new ObjectOutputStream(s.getOutputStream());
                oos.writeObject(dest);
                int resp = s.getInputStream().read();
                if (resp < 0)
                    throw new ConnectException("Not thru");
            }
            oos.writeObject(new Object[]{true, value}); // Send the value as an integer
        } catch (IOException ee) {
            try {
                s.close();
            } catch (IOException e1) {
                e1.printStackTrace();
                System.exit(1);
            }
        }
    }
}
