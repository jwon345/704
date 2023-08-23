package org.conveyor;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import org.conveyor.Ports;
import org.compsys704.LoaderVizWorker;
import org.compsys704.SignalClient;
import org.compsys704.SignalServer;

public class Conveyor extends JFrame {
    private JPanel panel;

    public Conveyor() {
        setSize(1000, 600);
        setTitle("Conveyor System1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        // Panel representing the conveyor
        panel = new Canvas();
        panel.setPreferredSize(new Dimension(500, 300));
        panel.setBorder(BorderFactory.createTitledBorder("Conveyor Belt"));
        panel.setBackground(Color.LIGHT_GRAY);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 1;
        this.add(panel, c);
        

        // Deploy Bottle Panel
        JPanel deployPanel = new JPanel();
        JButton deployStartButton = new JButton("Deploy Bottle at Start");
	        deployStartButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                System.out.println("Deploy Bottle at Start pressed!");
	                new SignalClient(Ports.PORT_CONVEYOR_PLANT, Ports.BOTTLE_DEPLOYED).actionPerformed(e);
	            }
	        });

        JButton deployPos5Button = new JButton("Deploy Bottle at Pos 5");
        deployPos5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Deploy Bottle at Pos 5 pressed!");
                new SignalClient(Ports.PORT_CONVEYOR_PLANT, "ConveyorControllerCD.bottlePos5").actionPerformed(e);
            }
        });

        deployPanel.add(deployStartButton);
        deployPanel.add(deployPos5Button);
        c.gridwidth = 2;
        c.gridx = 0;
        c.gridy = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1.0;
        this.add(deployPanel, c);

        // Mode Selection and Manual Control
        JRadioButton mmode = new JRadioButton("Manual");
        JRadioButton amode = new JRadioButton("Auto", true);
        ButtonGroup bg = new ButtonGroup();
        bg.add(mmode);
        bg.add(amode);

        JPanel modeSelectPanel = new JPanel(new GridLayout(1, 0));
        modeSelectPanel.add(amode);
        modeSelectPanel.add(mmode);
        modeSelectPanel.setBorder(BorderFactory.createTitledBorder("Mode Selector"));

        // Manual Mode controls
        JButton startConveyor = new JButton("Start Conveyor");
        startConveyor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.GREEN);
            }
        });

        JButton stopConveyor = new JButton("Stop Conveyor");
        stopConveyor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.LIGHT_GRAY);
            }
        });

        JPanel manualControlPanel = new JPanel(new GridLayout(2, 0));
        manualControlPanel.add(startConveyor);
        manualControlPanel.add(stopConveyor);
        manualControlPanel.setBorder(BorderFactory.createTitledBorder("Manual Control"));

        // Combine Mode Selector and Manual Mode controls
        JPanel combinedPanel = new JPanel(new GridLayout(0, 2));
        combinedPanel.add(modeSelectPanel);
        combinedPanel.add(manualControlPanel);
        c.gridwidth = 2;
        c.gridx = 0;
        c.gridy = 2;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1.0;
        this.add(combinedPanel, c);
    }

    public static void main(String[] args) {
        Conveyor conv = new Conveyor();
        conv.setVisible(true);
        conv.setVisible(true);
		
		SignalServer<LoaderVizWorker> server = new SignalServer<LoaderVizWorker>(20000, LoaderVizWorker.class);
		new Thread(server).start();
		while(true){
			try {
				conv.repaint();
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}