package org.OverallGUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import org.compsys704.States;

public class ConveyorCanvas extends JPanel {

	BufferedImage conveyor_off;
	BufferedImage conveyor_on;
	BufferedImage bottle;

	
	public ConveyorCanvas(){
		try {
		
			conveyor_off = ImageIO.read(new File("res/conveyor.png"));
			conveyor_on = ImageIO.read(new File("res/motorRunning.png"));
			bottle = ImageIO.read(new File("res/bottle.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);;
		}
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		if (States.MOTOR_ONOFF) {
	        g.drawImage(conveyor_on, 10, 129, null);
	    } else {
	        g.drawImage(conveyor_off, 10, 120, null);
	    }
		
		if (States.DEPLOY) {
			g.drawImage(bottle, 20, 165, null);
		}
	    // Draw the bottle at deploy position if DEPLOY state is true
	    if (States.BOTTLE_AT_POS1) {
	    	g.drawImage(bottle, 108, 165, null);
	    }
	    
	    if (States.BottleLeftAtPos5) {
	    	g.drawImage(bottle, 285, 165, null);
	    	g.drawImage(conveyor_on, 10, 129, null);
		}
	}
}
