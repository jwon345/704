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
        
        panel2 = new Canvas();
    	panel2.setPreferredSize(new Dimension(500, 300));
        panel2.setBorder(BorderFactory.createTitledBorder("Conveyor 2"));
        panel2.setBackground(Color.GREEN);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 0;
        c.weightx = 1.0;
        this.add(panel2,c);
        
        JPanel deployPanel = new JPanel();
        JButton deployButton = new JButton("Deploy Bottle");
//        deployButton.addActionListener(new SignalClient2(10000, "ConveyorControllerCD.bottle"));
        deployButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: Add action for deploy button here
            	new SignalClient2(10001, "ConveyorControllerCD.newBottle").actionPerformed(e);;
            	System.out.println("buttonPressed");
            }
        });


        deployPanel.add(deployButton);
        
        c.gridwidth = 2;
        c.gridx = 0;
        c.gridy = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1.0;
        this.add(deployPanel, c);


        //button to step through the machine logic --> to the plant?
        JButton stepButton = new JButton("step");
        //signal to the plant to step
//        deployButton.addActionListener(new SignalClient2(10000, "ConveyorControllerCD.bottle"));
        deployPanel.add(stepButton);
        
        c.gridx = 1;
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

        System.out.println("try create Server");
        SignalServer2<LoaderVizWorker2> server = new SignalServer2<LoaderVizWorker2>(Ports.PORT_LOADER_VIZ, LoaderVizWorker2.class);
        new Thread(server).start();
        while (true) {
            try {
                conv.repaint();
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
