package org.ECSGUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import org.compsys704.States;

public class Zone2_Canvas extends JPanel {

	BufferedImage fan_off;
	BufferedImage fan_on;
	BufferedImage heater_off;
	BufferedImage heater_on;
	BufferedImage light_off;
	BufferedImage light_on;
	
	public Zone2_Canvas(){
		try {
			// LIDLOADER IMAGES
			fan_off = ImageIO.read(new File("res/fan_off.png"));
			fan_on = ImageIO.read(new File("res/fan_on.png"));
			
			heater_off = ImageIO.read(new File("res/heater_off.png"));
			heater_on = ImageIO.read(new File("res/heater_on.png"));
			
			light_off = ImageIO.read(new File("res/light_off.png"));
			light_on = ImageIO.read(new File("res/light_on.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);;
		}
	}

	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);

		g.drawImage(fan_off, 0, 0, null);
		g.drawImage(fan_off, 240, 0, null);
		
		g.drawImage(fan_on, 0, 0, null);
		g.drawImage(fan_on, 240, 0, null);
		
		g.drawImage(heater_off, 0, 79, null);
		g.drawImage(heater_on, 0, 75, null);
		
		g.drawImage(heater_off, 235, 79, null);
		g.drawImage(heater_on, 235, 75, null);
		
		g.drawImage(light_off, 125, 0, null);
		g.drawImage(light_on, 115, 0, null);
		
		
		
		//g.setColor(Color.white);
	    //g.fillRect(0, 0, 300, 150);
		
	}
}
