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

	BufferedImage gripper_home;
	BufferedImage gripper_on;
	BufferedImage clamper;
	BufferedImage clamped;
	BufferedImage bottle;

	
	public CapperCanvas(){
		try {
		
			gripper_home = ImageIO.read(new File("res/gripper.png"));
			gripper_on = ImageIO.read(new File("res/gripped.png"));
			clamper = ImageIO.read(new File("res/clamp.png"));
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
        g.drawImage(gripper_home, 60, -20, null);
        g.drawImage(clamper, 100, 200, null);
        g.drawImage(clamped, 70, 200, null);
        g.drawImage(bottle, 150, 215, null);
        g.setColor(Color.gray);
        g.fillRect(0, 300, 400, 30);
}
	
}
