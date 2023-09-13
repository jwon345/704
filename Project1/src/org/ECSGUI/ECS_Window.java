package org.ECSGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.text.NumberFormatter;

import org.OverallGUI.FillerCanvas;
import org.ECS.LoaderVizWorker;
import org.ECS.Ports;
import org.ECS.SignalCheckBoxClient;
import org.ECS.SignalServer;
import org.ECS.SignalSpinnerClient;
import org.ECS.SignalSpinner_BClient;

public class ECS_Window extends JFrame {
	private JPanel zone1;
	private JPanel zone2;
	private JPanel zone3;
	private JPanel zone4;
	private JPanel zone5;
	private JPanel zone6;
	private JPanel zone7;
	
	public ECS_Window() {
	    setTitle("Environment Control System (ECS)");
	    setLayout(new GridBagLayout());
	    GridBagConstraints c = new GridBagConstraints();

	    // Current Time Panel
	    JPanel timePanel = new JPanel();
	    timePanel.setBorder(BorderFactory.createTitledBorder("Current Time (24 HR) - Set A Time First"));
	    timePanel.setPreferredSize(new Dimension(300, 50));	
	    SpinnerDateModel spinnerDateModel = new SpinnerDateModel();
	    JSpinner timeSpinner = new JSpinner(spinnerDateModel);
	    JSpinner.DateEditor timeEditor = new JSpinner.DateEditor(timeSpinner, "HH");
	    timeSpinner.setEditor(timeEditor);
	    
	    // Attach the SignalSpinnerClient to the timeSpinner
	    SignalSpinnerClient ssc = new SignalSpinnerClient(Ports.PORT_ECS_HVAC_CONTROLLER, Ports.CurrentTime);
	    timeSpinner.addChangeListener(ssc);
	    
	    SignalSpinnerClient two = new SignalSpinnerClient(Ports.PORT_ECS_LIGHTING_CONTROLLER, Ports.CurrentTime_2);
	    timeSpinner.addChangeListener(two);

	    
	    timePanel.add(new JLabel("Set Time: "));
	    timePanel.add(timeSpinner);
	    
	    c.gridx = 0;
	    c.gridy = 0;
	    c.insets = new Insets(10, 10, 10, 10);
	    add(timePanel, c);

	    
	    JCheckBox smokeAlert = new JCheckBox("Enable - Smoke");
	    smokeAlert.addItemListener(new SignalCheckBoxClient(Ports.PORT_ECS_SMOKE_CONTROLLER, Ports.detectSmoke));
	    c.gridx = 1; // Set to the next column
	    c.gridy = 0;
	    add(smokeAlert, c);
	    

	 // Zone - 1,7 Panel
	    JPanel zone1Panel = new JPanel();
	    zone1Panel.setBorder(BorderFactory.createTitledBorder("Zone - 1,7 (Office Zone)"));
	    zone1Panel.add(new JLabel("Temperature (°C): "));
	    SpinnerNumberModel temp1Model = new SpinnerNumberModel(0, 0, 100, 1);
	    JSpinner temp1Spinner = new JSpinner(temp1Model);
	    SignalSpinner_BClient temp1Client = new SignalSpinner_BClient(Ports.PORT_ECS_HVAC_CONTROLLER, Ports.zoneOneSevenTemp);
	    temp1Spinner.addChangeListener(temp1Client);
	    zone1Panel.add(temp1Spinner);

	    zone1Panel.add(new JLabel("Humidity (%): "));
	    SpinnerNumberModel humidity1Model = new SpinnerNumberModel(0, 0, 100, 1);
	    JSpinner humidity1Spinner = new JSpinner(humidity1Model);
	    SignalSpinner_BClient humidity1Client = new SignalSpinner_BClient(Ports.PORT_ECS_HVAC_CONTROLLER, Ports.zoneOneSevenHumid);
	    humidity1Spinner.addChangeListener(humidity1Client);
	    zone1Panel.add(humidity1Spinner);

	    c.gridx = 0;
	    c.gridy = 1;
	    add(zone1Panel, c);

	    // Zone - 2,3 Panel
	    JPanel zone2Panel = new JPanel();
	    zone2Panel.setBorder(BorderFactory.createTitledBorder("Zone - 2,3 (Storage Zone)"));
	    zone2Panel.add(new JLabel("Temperature (°C): "));
	    SpinnerNumberModel temp2Model = new SpinnerNumberModel(0, 0, 100, 1);
	    JSpinner temp2Spinner = new JSpinner(temp2Model);
	    SignalSpinner_BClient temp2Client = new SignalSpinner_BClient(Ports.PORT_ECS_HVAC_CONTROLLER, Ports.zoneTwoThreeTemp);
	    temp2Spinner.addChangeListener(temp2Client);	    
	    zone2Panel.add(temp2Spinner);

	    zone2Panel.add(new JLabel("Humidity (%): "));
	    SpinnerNumberModel humidity2Model = new SpinnerNumberModel(0, 0, 100, 1);
	    JSpinner humidity2Spinner = new JSpinner(humidity2Model);
	    SignalSpinner_BClient humidity2Client = new SignalSpinner_BClient(Ports.PORT_ECS_HVAC_CONTROLLER, Ports.zoneTwoThreeHumid);
	    humidity2Spinner.addChangeListener(humidity2Client);	    
	    zone2Panel.add(humidity2Spinner);

	    c.gridx = 0;
	    c.gridy = 2;
	    add(zone2Panel, c);

	    // Zone - 4,5,6 Panel
	    JPanel zone3Panel = new JPanel();
	    zone3Panel.setBorder(BorderFactory.createTitledBorder("Zone - 4,5,6 (Manufacturing Zone)"));
	    zone3Panel.add(new JLabel("Temperature (°C): "));
	    SpinnerNumberModel temp3Model = new SpinnerNumberModel(0, 0, 100, 1);
	    JSpinner temp3Spinner = new JSpinner(temp3Model);
	    SignalSpinner_BClient temp3Client = new SignalSpinner_BClient(Ports.PORT_ECS_HVAC_CONTROLLER, Ports.zoneFourFiveSixTemp);
	    temp3Spinner.addChangeListener(temp3Client);	
	    zone3Panel.add(temp3Spinner);

	    zone3Panel.add(new JLabel("Humidity (%): "));
	    SpinnerNumberModel humidity3Model = new SpinnerNumberModel(0, 0, 100, 1);
	    JSpinner humidity3Spinner = new JSpinner(humidity3Model);
	    SignalSpinner_BClient humidity3Client = new SignalSpinner_BClient(Ports.PORT_ECS_HVAC_CONTROLLER, Ports.zoneFourFiveSixHumid);
	    humidity3Spinner.addChangeListener(humidity3Client);
	    zone3Panel.add(humidity3Spinner);

	    c.gridx = 0;
	    c.gridy = 3;
	    add(zone3Panel, c);
	    
	    
	    
	    
	 // Zone 1 Occupancy Panel
	    JPanel zone1OccupancyPanel = new JPanel();
	    zone1OccupancyPanel.setPreferredSize(new Dimension(370, 50));
	    zone1OccupancyPanel.setBorder(BorderFactory.createTitledBorder("Zone - 1"));

	    
	    SpinnerNumberModel occupancy1Model = new SpinnerNumberModel(0, 0, 50, 1);
	    JSpinner occupancy1Spinner = new JSpinner(occupancy1Model);
	    SignalSpinner_BClient occupancy1Client = new SignalSpinner_BClient(Ports.PORT_ECS_LIGHTING_CONTROLLER, Ports.zoneOneOccupancy);
	    occupancy1Spinner.addChangeListener(occupancy1Client);
	    
	    SignalSpinner_BClient occupancy1bClient = new SignalSpinner_BClient(Ports.PORT_ECS_HVAC_CONTROLLER, Ports.zoneOneOccupancy_B);
	    occupancy1Spinner.addChangeListener(occupancy1bClient);
	    
	    zone1OccupancyPanel.add(new JLabel("Occupancy (People): "));
	    zone1OccupancyPanel.add(occupancy1Spinner);

	    // Light Intensity Spinner
	    SpinnerNumberModel lightIntensity1Model = new SpinnerNumberModel(50, 0, 100, 1);
	    JSpinner lightIntensity1Spinner = new JSpinner(lightIntensity1Model);
	    SignalSpinner_BClient lightIntensity1Client = new SignalSpinner_BClient(Ports.PORT_ECS_LIGHTING_CONTROLLER, Ports.zoneOneLightingI);
	    lightIntensity1Spinner.addChangeListener(lightIntensity1Client);
	    zone1OccupancyPanel.add(new JLabel("Light Intensity (%) : "));
	    zone1OccupancyPanel.add(lightIntensity1Spinner);

	    c.gridx = 1;
	    c.gridy = 1;
	    add(zone1OccupancyPanel, c);
	    
	 // Zone 2 Occupancy Panel
	    JPanel zone2OccupancyPanel = new JPanel();
	    zone2OccupancyPanel.setPreferredSize(new Dimension(370, 50));
	    zone2OccupancyPanel.setBorder(BorderFactory.createTitledBorder("Zone - 2"));
	    
	    SpinnerNumberModel occupancy2Model = new SpinnerNumberModel(0, 0, 50, 1);
	    JSpinner occupancy2Spinner = new JSpinner(occupancy2Model);
	    SignalSpinner_BClient occupancy2Client = new SignalSpinner_BClient(Ports.PORT_ECS_LIGHTING_CONTROLLER, Ports.zoneTwoOccupancy);
	    occupancy2Spinner.addChangeListener(occupancy2Client);
	    zone2OccupancyPanel.add(new JLabel("Occupancy (People): "));
	    zone2OccupancyPanel.add(occupancy2Spinner);
	    
	    
	    SpinnerNumberModel lightIntensity2Model = new SpinnerNumberModel(50, 0, 100, 1);
	    JSpinner lightIntensity2Spinner = new JSpinner(lightIntensity2Model);
	    SignalSpinner_BClient lightIntensity2Client = new SignalSpinner_BClient(Ports.PORT_ECS_LIGHTING_CONTROLLER, Ports.zoneTwoLightingI);
	    lightIntensity2Spinner.addChangeListener(lightIntensity2Client);
	    zone2OccupancyPanel.add(new JLabel("Light Intensity (%) : "));
	    zone2OccupancyPanel.add(lightIntensity2Spinner);
	    c.gridx = 1;
	    c.gridy = 2;
	    add(zone2OccupancyPanel, c);

	    // Zone 3 Occupancy Panel
	    JPanel zone3OccupancyPanel = new JPanel();
	    zone3OccupancyPanel.setPreferredSize(new Dimension(370, 50));
	    zone3OccupancyPanel.setBorder(BorderFactory.createTitledBorder("Zone - 3"));
	    
	    SpinnerNumberModel occupancy3Model = new SpinnerNumberModel(0, 0, 50, 1);
	    JSpinner occupancy3Spinner = new JSpinner(occupancy3Model);
	    SignalSpinner_BClient occupancy3Client = new SignalSpinner_BClient(Ports.PORT_ECS_LIGHTING_CONTROLLER, Ports.zoneThreeOccupancy);
	    occupancy3Spinner.addChangeListener(occupancy3Client);
	    zone3OccupancyPanel.add(new JLabel("Occupancy (People): "));
	    zone3OccupancyPanel.add(occupancy3Spinner);
	    
	    
	    SpinnerNumberModel lightIntensity3Model = new SpinnerNumberModel(50, 0, 100, 1);
	    JSpinner lightIntensity3Spinner = new JSpinner(lightIntensity3Model);
	    SignalSpinner_BClient lightIntensity3Client = new SignalSpinner_BClient(Ports.PORT_ECS_LIGHTING_CONTROLLER, Ports.zoneThreeLightingI);
	    lightIntensity3Spinner.addChangeListener(lightIntensity3Client);
	    zone3OccupancyPanel.add(new JLabel("Light Intensity (%) : "));
	    zone3OccupancyPanel.add(lightIntensity3Spinner);
	    c.gridx = 1;
	    c.gridy = 3;
	    add(zone3OccupancyPanel, c);
	    
	 // Zone 4 Occupancy Panel
	    JPanel zone4OccupancyPanel = new JPanel();
	    zone4OccupancyPanel.setPreferredSize(new Dimension(370, 50));
	    zone4OccupancyPanel.setBorder(BorderFactory.createTitledBorder("Zone - 4"));
	    
	    SpinnerNumberModel occupancy4Model = new SpinnerNumberModel(0, 0, 50, 1);
	    JSpinner occupancy4Spinner = new JSpinner(occupancy4Model);
	    SignalSpinner_BClient occupancy4Client = new SignalSpinner_BClient(Ports.PORT_ECS_LIGHTING_CONTROLLER, Ports.zoneFourOccupancy);
	    occupancy4Spinner.addChangeListener(occupancy4Client);
	    zone4OccupancyPanel.add(new JLabel("Occupancy (People): "));
	    zone4OccupancyPanel.add(occupancy4Spinner);
	    
	    SpinnerNumberModel lightIntensity4Model = new SpinnerNumberModel(50, 0, 100, 1);
	    JSpinner lightIntensity4Spinner = new JSpinner(lightIntensity4Model);
	    SignalSpinner_BClient lightIntensity4Client = new SignalSpinner_BClient(Ports.PORT_ECS_LIGHTING_CONTROLLER, Ports.zoneFourLightingI);
	    lightIntensity4Spinner.addChangeListener(lightIntensity4Client);
	    zone4OccupancyPanel.add(new JLabel("Light Intensity (%) : "));
	    zone4OccupancyPanel.add(lightIntensity4Spinner);
	    c.gridx = 2;
	    c.gridy = 0;
	    add(zone4OccupancyPanel, c);

	    // Zone 5 Occupancy Panel
	    JPanel zone5OccupancyPanel = new JPanel();
	    zone5OccupancyPanel.setPreferredSize(new Dimension(370, 50));
	    zone5OccupancyPanel.setBorder(BorderFactory.createTitledBorder("Zone - 5"));
	    SpinnerNumberModel occupancy5Model = new SpinnerNumberModel(0, 0, 50, 1);
	    
	    JSpinner occupancy5Spinner = new JSpinner(occupancy5Model);
	    zone5OccupancyPanel.add(new JLabel("Occupancy (People): "));
	    zone5OccupancyPanel.add(occupancy5Spinner);
	    SignalSpinner_BClient occupancy5Client = new SignalSpinner_BClient(Ports.PORT_ECS_LIGHTING_CONTROLLER, Ports.zoneFiveOccupancy);
	    occupancy5Spinner.addChangeListener(occupancy5Client);
	    
	    SpinnerNumberModel lightIntensity5Model = new SpinnerNumberModel(50, 0, 100, 1);
	    JSpinner lightIntensity5Spinner = new JSpinner(lightIntensity5Model);
	    SignalSpinner_BClient lightIntensity5Client = new SignalSpinner_BClient(Ports.PORT_ECS_LIGHTING_CONTROLLER, Ports.zoneFiveLightingI);
	    lightIntensity5Spinner.addChangeListener(lightIntensity5Client);
	    zone5OccupancyPanel.add(new JLabel("Light Intensity (%) : "));
	    zone5OccupancyPanel.add(lightIntensity5Spinner);
	    c.gridx = 2;
	    c.gridy = 1;
	    add(zone5OccupancyPanel, c);

	    // Zone 6 Occupancy Panel
	    JPanel zone6OccupancyPanel = new JPanel();
	    zone6OccupancyPanel.setPreferredSize(new Dimension(370, 50));
	    zone6OccupancyPanel.setBorder(BorderFactory.createTitledBorder("Zone - 6"));
	    
	    SpinnerNumberModel occupancy6Model = new SpinnerNumberModel(0, 0, 50, 1);
	    JSpinner occupancy6Spinner = new JSpinner(occupancy6Model);
	    SignalSpinner_BClient occupancy6Client = new SignalSpinner_BClient(Ports.PORT_ECS_LIGHTING_CONTROLLER, Ports.zoneSixOccupancy);
	    occupancy6Spinner.addChangeListener(occupancy6Client);
	    zone6OccupancyPanel.add(new JLabel("Occupancy (People): "));
	    zone6OccupancyPanel.add(occupancy6Spinner);
	    
	    SpinnerNumberModel lightIntensity6Model = new SpinnerNumberModel(50, 0, 100, 1);
	    JSpinner lightIntensity6Spinner = new JSpinner(lightIntensity6Model);
	    SignalSpinner_BClient lightIntensity6Client = new SignalSpinner_BClient(Ports.PORT_ECS_LIGHTING_CONTROLLER, Ports.zoneSixLightingI);
	    lightIntensity6Spinner.addChangeListener(lightIntensity6Client);
	    zone6OccupancyPanel.add(new JLabel("Light Intensity (%) : "));
	    zone6OccupancyPanel.add(lightIntensity6Spinner);
	    c.gridx = 2;
	    c.gridy = 2;
	    add(zone6OccupancyPanel, c);

	    // Zone 7 Occupancy Panel
	    JPanel zone7OccupancyPanel = new JPanel();
	    zone7OccupancyPanel.setPreferredSize(new Dimension(370, 50));
	    zone7OccupancyPanel.setBorder(BorderFactory.createTitledBorder("Zone - 7"));
	    
	    SpinnerNumberModel occupancy7Model = new SpinnerNumberModel(0, 0, 50, 1);
	    JSpinner occupancy7Spinner = new JSpinner(occupancy7Model);
	    
	    SignalSpinner_BClient occupancy7Client = new SignalSpinner_BClient(Ports.PORT_ECS_LIGHTING_CONTROLLER, Ports.zoneSevenOccupancy);
	    occupancy7Spinner.addChangeListener(occupancy7Client);
	    
	    SignalSpinner_BClient occupancy7bClient = new SignalSpinner_BClient(Ports.PORT_ECS_HVAC_CONTROLLER, Ports.zoneSevenOccupancy_B);
	    occupancy7Spinner.addChangeListener(occupancy7bClient);
	    
	    zone7OccupancyPanel.add(new JLabel("Occupancy (People): "));
	    zone7OccupancyPanel.add(occupancy7Spinner);
	    
	    SpinnerNumberModel lightIntensity7Model = new SpinnerNumberModel(50, 0, 100, 1);
	    JSpinner lightIntensity7Spinner = new JSpinner(lightIntensity7Model);
	    SignalSpinner_BClient lightIntensity7Client = new SignalSpinner_BClient(Ports.PORT_ECS_LIGHTING_CONTROLLER, Ports.zoneSevenLightingI);
	    lightIntensity7Spinner.addChangeListener(lightIntensity7Client);
	    zone7OccupancyPanel.add(new JLabel("Light Intensity (%) : "));
	    zone7OccupancyPanel.add(lightIntensity7Spinner);
	    c.gridx = 2;
	    c.gridy = 3;
	    add(zone7OccupancyPanel, c);


	    zone1 = new Zone1_Canvas();
	    zone1.setPreferredSize(new Dimension(300, 150));	
	    zone1.setBackground(Color.gray); 
	    	 
	    c.gridx = 0; 
	    c.gridy = 4; 
	    this.add(zone1, c);
	    
	    zone2 = new Zone2_Canvas();
	    zone2.setPreferredSize(new Dimension(300, 150));	
	    zone2.setBackground(Color.gray);
	    	 
	    c.gridx = 1; 
	    c.gridy = 4; 
	    this.add(zone2, c);
	    
	    zone3 = new Zone3_Canvas();
	    zone3.setPreferredSize(new Dimension(300, 150));	
	    zone3.setBackground(Color.gray); 
	    	 
	    c.gridx = 2; 
	    c.gridy = 4; 
	    this.add(zone3, c);
	    
	    zone4 = new Zone4_Canvas();
	    zone4.setPreferredSize(new Dimension(300, 150));	
	    zone4.setBackground(Color.gray); 
	    	 
	    c.gridx = 0;
	    c.gridy = 5; 
	    this.add(zone4, c);
	    
	    zone5 = new Zone5_Canvas();
	    zone5.setPreferredSize(new Dimension(300, 150));	
	    zone5.setBackground(Color.gray); 
	    	 
	    c.gridx = 1; 
	    c.gridy = 5; 
	    this.add(zone5, c);
	    
	    zone6 = new Zone6_Canvas();
	    zone6.setPreferredSize(new Dimension(300, 150));	
	    zone6.setBackground(Color.gray); 
	    	 
	    c.gridx = 2; 
	    c.gridy = 5; 
	    this.add(zone6, c);
	    
	    zone7 = new Zone7_Canvas();
	    zone7.setPreferredSize(new Dimension(300, 150));	
	    zone7.setBackground(Color.gray); 
	    	 
	    c.gridx = 0; 
	    c.gridy = 6; 
	    this.add(zone7, c);
	    
	    JPanel guidePanel = new JPanel();
	    guidePanel.setPreferredSize(new Dimension(300, 150));
	    guidePanel.setBackground(Color.white); 
	    guidePanel.setBorder(BorderFactory.createTitledBorder("HVAC Guide")); 
	    guidePanel.setLayout(new BorderLayout());  

	    JTextArea guideInfo = new JTextArea();
	    guideInfo.setText("Work hours: 9-17\nAfterhours: 17-8\n Any HVAC can be activated during work hours.\nAfter hours only Zone 1-7 can be activated if there is someone in those zones.");
	    guideInfo.setEditable(false); 
	    guideInfo.setWrapStyleWord(true); 
	    guideInfo.setLineWrap(true); 
	    guideInfo.setCaretPosition(0);
	    guideInfo.setMargin(new Insets(10,10,10,10));

	    
	    guidePanel.add(new JScrollPane(guideInfo), BorderLayout.CENTER);  

	    c.gridx = 1; 
	    c.gridy = 6; 
	    this.add(guidePanel, c);

	    

	    JPanel lightingGuidePanel = new JPanel();
	    lightingGuidePanel.setPreferredSize(new Dimension(300, 150));
	    lightingGuidePanel.setBackground(Color.white); 
	    lightingGuidePanel.setBorder(BorderFactory.createTitledBorder("Lighting Guide")); 
	    lightingGuidePanel.setLayout(new BorderLayout());

	    JTextArea lightingGuideInfo = new JTextArea();
	    lightingGuideInfo.setText("If there is more than one person in the zone and lighting intensity is under 50%, the following will occur:\n- Daytime: Blinds will open.\n- Nighttime: Lights will turn on.");
	    lightingGuideInfo.setEditable(false); 
	    lightingGuideInfo.setWrapStyleWord(true); 
	    lightingGuideInfo.setLineWrap(true); 
	    lightingGuideInfo.setCaretPosition(0);
	    lightingGuideInfo.setMargin(new Insets(10,10,10,10));

	    lightingGuidePanel.add(new JScrollPane(lightingGuideInfo), BorderLayout.CENTER);

	    c.gridx = 2;  
	    c.gridy = 6; 
	    this.add(lightingGuidePanel, c);
	    
	    
	    
	    pack();
	    setLocationRelativeTo(null);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	}


    
	public static void main(String[] args) {
		ECS_Window cl = new ECS_Window();
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