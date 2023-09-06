package org.OverallGUI;

import java.awt.Color;
import java.awt.Insets;
import java.awt.Component;
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

import org.compsys704.LoaderVizWorker;
import org.compsys704.Ports;
import org.compsys704.SignalCheckBoxClient;
import org.compsys704.SignalClient;
import org.compsys704.SignalRadioClient;
import org.compsys704.SignalServer;

public class OverallGUI extends JFrame {
	private JPanel panel;
	private JPanel rotaryPanel;
	private JPanel conveyorPanel;
	private JPanel fillerPanel;
	private JPanel capperPanel;
	
	public OverallGUI() {
		// LIDLOADER SECTION //
		panel = new Canvas();
		panel.setPreferredSize(new Dimension(360, 320));
		panel.setBackground(Color.WHITE);
		JButton enable = new JButton("enable");
		enable.addActionListener(new SignalClient(Ports.PORT_LOADER_PLANT, Ports.ENABLE_SIGNAL));
		JButton request = new JButton("request");
		request.addActionListener(new SignalClient(Ports.PORT_LOADER_CONTROLLER, Ports.REQUEST_SIGNAL));
		JButton refill = new JButton("refill");
		refill.addActionListener(new SignalClient(Ports.PORT_LOADER_PLANT, Ports.REFILL_SIGNAL));
		JPanel ss = new JPanel();
		ss.add(enable);
		ss.add(request);
		ss.add(refill);
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(20, 0, 0, 0); 
		this.add(panel,c);
		c.gridx = 0;
		c.gridy = 1;
		this.add(ss,c);
		
		// Radio buttons
		SignalRadioClient src = new SignalRadioClient(Ports.PORT_LOADER_CONTROLLER, Ports.SIGNAL_Mode);
		JRadioButton mmode = new JRadioButton("Manual");
		mmode.setActionCommand("1");
		mmode.addActionListener(src);
		JRadioButton amode = new JRadioButton("Auto");
		amode.setActionCommand("0");
		amode.addActionListener(src);
		amode.setSelected(true);
		ButtonGroup bg = new ButtonGroup();
		bg.add(mmode);
		bg.add(amode);
		
		JPanel pan = new JPanel(new GridLayout(1, 0));
		pan.add(amode);
		pan.add(mmode);
		c.gridx = 0;
		c.gridy = 2;
		pan.setBorder(BorderFactory.createTitledBorder("Mode selector"));

		// Checkboxes
		JCheckBox pe = new JCheckBox("pusherExtend");
		pe.setEnabled(false);
		pe.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_CONTROLLER, Ports.SIGNAL_PUSHER_EXTEND));
		JCheckBox vo = new JCheckBox("vacOn");
		vo.setEnabled(false);
		vo.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_CONTROLLER, Ports.SIGNAL_VACON));
		JCheckBox as = new JCheckBox("armSource");
		as.setEnabled(false);
		as.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_CONTROLLER, Ports.SIGNAL_ARM_SOURCE));
		JCheckBox ad = new JCheckBox("armDest");
		ad.setEnabled(false);
		ad.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_CONTROLLER, Ports.SIGNAL_ARM_DEST));

		JPanel pan2 = new JPanel(new GridLayout(2, 2));
		pan2.add(pe);
		pan2.add(vo);
		pan2.add(as);
		pan2.add(ad);
		pan2.setBorder(BorderFactory.createTitledBorder("Manual control"));
		src.setCheckBoxComponent(pan2);

		JPanel pan3 = new JPanel(new GridLayout(0, 2));
		pan3.add(pan);
		pan3.add(pan2);
		c.gridx = 0;
		c.gridy = 2;
		this.add(pan3,c);
		
		rotaryPanel = new RotaryCanvas();
	    rotaryPanel.setPreferredSize(new Dimension(360, 320));
	    rotaryPanel.setBackground(Color.WHITE); // Set to any color you want


	    c.gridx = 2; // New panel's x position (next to the existing one)
	    c.gridy = 0; // New panel's y position (same row as the existing one)
	    c.insets = new Insets(20, 0, 0, 30); 
	    this.add(rotaryPanel, c);
	    
	    conveyorPanel = new ConveyorCanvas();
	    conveyorPanel.setPreferredSize(new Dimension(400, 320));	
	    conveyorPanel.setBackground(Color.WHITE); // Set to any color you want

	    JButton deploy = new JButton("Deploy");
	    deploy.addActionListener(new SignalClient(Ports.PORT_CONVEYOR_CONTROLLER, Ports.DEPLOY_SIGNAL));
		JPanel conveyorbax = new JPanel();
		conveyorbax.add(deploy);
		
	    c.gridx = 1; // New panel's x position (next to the existing one)
	    c.gridy = 0; // New panel's y position (same row as the existing one)
	    c.insets = new Insets(20, 0, 0, 30); 
	    this.add(conveyorPanel, c);
	    
	    c.gridx = 1; // New panel's x position (next to the existing one)
	    c.gridy = 1; // New panel's y position (same row as the existing one)
	    this.add(conveyorbax, c);
	    
	    
	    fillerPanel = new FillerCanvas();
	    fillerPanel.setPreferredSize(new Dimension(400, 320));	
	    fillerPanel.setBackground(Color.WHITE); // Set to any color you want
	    
	    c.gridx = 1; // New panel's x position (next to the existing one)
	    c.gridy = 3; // New panel's y position (same row as the existing one)
	    c.insets = new Insets(20, 0, 20, 30); 
	    this.add(fillerPanel, c);
	    
	    capperPanel = new CapperCanvas();
	    capperPanel.setPreferredSize(new Dimension(360, 320));	
	    capperPanel.setBackground(Color.WHITE); // Set to any color you want
	    
	    c.gridx = 2; // New panel's x position (next to the existing one)
	    c.gridy = 3; // New panel's y position (same row as the existing one)
	    c.insets = new Insets(20, 0, 20, 30); 
	    this.add(capperPanel, c);
	    
		this.setTitle("ABS SYSTEM");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	}

	public static void main(String[] args) {
		OverallGUI cl = new OverallGUI();
		cl.pack();
		cl.setVisible(true);
		
		SignalServer<LoaderVizWorker> server = new SignalServer<LoaderVizWorker>(Ports.PORT_LOADER_VIZ, LoaderVizWorker.class);
		new Thread(server).start();
		while(true){
			try {
				cl.repaint();
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
