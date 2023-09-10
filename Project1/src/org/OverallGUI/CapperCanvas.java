package org.OverallGUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import org.compsys704.States;

public class CapperCanvas extends JPanel {

	BufferedImage gripper_off;
	BufferedImage gripper_on;
	BufferedImage unclamper;
	BufferedImage clamped;
	BufferedImage bottle;

	
	public CapperCanvas(){
		try {
		
			gripper_off = ImageIO.read(new File("res/gripper.png"));
			gripper_on = ImageIO.read(new File("res/gripped.png"));
			unclamper = ImageIO.read(new File("res/clamp.png"));
			clamped = ImageIO.read(new File("res/clamped.png"));
			bottle = ImageIO.read(new File("res/nocap_bottle.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);;
		}
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		g.setColor(Color.BLACK);
		g.drawString("Capper", 10, 20);
		
		if (States.BOTTLE_AT_POS4) {
		    g.drawImage(bottle, 150, 215, null);
		    g.setColor(Color.PINK);
		    g.fillRect(157, 220, 33, 7);
		    g.setColor(Color.cyan);
		    g.fillRect(157, 290, 33, 15);
		}	 
		
		
		if (States.CYL_CLAMP_BOTTLE_EXTENDED) {
		     g.drawImage(clamped, 70, 200, null);
		     
		}
		else {
		    g.drawImage(unclamper, 130, 200, null);
		}

		if (States.GRIPPER_ZAXIS_LIFTED) {
		    g.drawImage(gripper_off, 60, -20, null);
		}  else if (States.GRIPPER_TURN_RETRACTED) {
		    g.drawImage(gripper_on, 60, -20, null);
		} 
		
		else if (States.CYL_POS5_ZAXIS_EXTENDED) {
		    g.drawImage(gripper_on, 60, 55, null);
		}  else if (States.CAP_GRIPPER_POS5_EXTENDED) {
		    g.drawImage(gripper_on, 60, 55, null);
		}
		
		else {
			  g.drawImage(gripper_off, 60, -30, null);
		}

		
	
		
		


			 
		

		
        g.setColor(Color.gray);
        g.fillRect(0, 300, 400, 30);
}
	
}
