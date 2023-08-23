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
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import org.compsys704.LoaderVizWorker;
import org.compsys704.Ports;
import org.compsys704.SignalClient;
import org.compsys704.SignalServer;

public class Conveyor extends JFrame {
	private JPanel panel;
    private JPanel panel2;
    private JPanel panel3;
    private final int deBounceTime = 200;


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
        this.add(panel,c);
        
//        panel2 = new Canvas();
//    	panel2.setPreferredSize(new Dimension(500, 300));
//        panel2.setBorder(BorderFactory.createTitledBorder("Conveyor 2"));
//        panel2.setBackground(Color.GREEN);
//        c.fill = GridBagConstraints.HORIZONTAL;
//        c.gridx = 1;
//        c.gridy = 0;
//        c.weightx = 1.0;
//        this.add(panel2,c);
        
        JPanel deployPanel = new JPanel();
        JButton deployButton = new JButton("Deploy Bottle LeftSide");
//        deployButton.addActionListener(new SignalClient2(10000, "ConveyorControllerCD.bottle"));
        deployButton.addActionListener(new ActionListener() {
            private boolean isRunning = false; // Flag to track if the action is already running

            @Override
            public void actionPerformed(ActionEvent e) {
                if (!isRunning) {
                    isRunning = true; // Set the flag to indicate that the action is running
                    new SignalClient2(10001, "ConveyorPlantCD.placedNewBottle").actionPerformed(e);

                    try {
                        Thread.sleep(deBounceTime);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }

                    isRunning = false; // Reset the flag after the action is complete
                }
            }
        });


        deployPanel.add(deployButton);
        
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1.0;
        this.add(deployPanel, c);


        JButton deployRight = new JButton("Deploy Bottle RightSide");
//        deployButton.addActionListener(new SignalClient2(10000, "ConveyorControllerCD.bottle"));
        deployRight.addActionListener(new ActionListener() {
            private boolean isRunning = false; // Flag to track if the action is already running

            @Override
            public void actionPerformed(ActionEvent e) {
                if (!isRunning) {
                    isRunning = true; // Set the flag to indicate that the action is running
                    new SignalClient2(10001, "ConveyorPlantCD.placedNewBottleRight").actionPerformed(e);

                    try {
                        Thread.sleep(deBounceTime);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }

                    isRunning = false; // Reset the flag after the action is complete
                }
            }
        });


        deployPanel.add(deployRight);
        
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1.0;
        this.add(deployPanel, c);

        //button to step through the machine logic --> to the plant?
        JButton stepButton = new JButton("Enable");
        //signal to the plant to step
        stepButton.addActionListener(new ActionListener() {
            private boolean isRunning = false; // Flag to track if the action is already running

            @Override
            public void actionPerformed(ActionEvent e) {
                if (!isRunning) {
                    isRunning = true; // Set the flag to indicate that the action is running
                    new SignalClient2(10001, "ConveyorPlantCD.step").actionPerformed(e);

                    try {
                        Thread.sleep(deBounceTime);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }

                    isRunning = false; // Reset the flag after the action is complete
                }
            }
        });
        deployPanel.add(stepButton);
        
        c.gridx = 0;
        c.gridy = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1.0;
        this.add(deployPanel, c);
        

        JButton removeBottle = new JButton("Remove Bottle");
        //signal to the plant to step
        removeBottle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: Add action for deploy button here
				new SignalClient2(10001, "ConveyorPlantCD.removeBottle").actionPerformed(e);
            	try {
					Thread.sleep(deBounceTime);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
//            	System.out.println("buttonPressed");
            }
        });
        deployPanel.add(removeBottle);
        
        c.gridx = 0;
        c.gridy = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1.0;
        this.add(deployPanel, c);

        // Radio buttons for mode selection
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
        
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 2;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1.0;
        this.add(combinedPanel, c);
    }

    public static void main(String[] args) {
        Conveyor conv = new Conveyor();
        conv.setVisible(true);

        System.out.println("try create Server");
        SignalServer2<LoaderVizWorker2> server = new SignalServer2<LoaderVizWorker2>(20000, LoaderVizWorker2.class);
        new Thread(server).start();
        while (true) {
            try {
                conv.repaint();
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
