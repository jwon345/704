package org.ECSGUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import org.ECS.States;

public class Zone6_Canvas extends JPanel {

	BufferedImage aircon_off;
	BufferedImage aircon_on;
	BufferedImage light_off;
	BufferedImage light_on;
	BufferedImage window_off;
	BufferedImage window_on;
	
	public Zone6_Canvas(){
		try {
			// LIDLOADER IMAGES
			aircon_off = ImageIO.read(new File("res/aircon_off.png"));
			aircon_on = ImageIO.read(new File("res/aircon_on.png"));
			

			light_off = ImageIO.read(new File("res/light_off.png"));
			light_on = ImageIO.read(new File("res/light_on.png"));
			
			window_off = ImageIO.read(new File("res/window_off.png"));
			window_on = ImageIO.read(new File("res/window_on.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);;
		}
	}

	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		if (States.sirenONOFF_E) {
			g.setColor(Color.red);
		    g.fillRect(0, 0, 300, 150);
		}
		
		if (States.zoneSixLightONOFF_E) {
			g.drawImage(light_on, 115, 0, null);
		}
		
		else {
			g.drawImage(light_off, 125, 0, null);
		}
		
		if (States.zoneSixWindowONOFF_E) {
			g.drawImage(window_on, 120, 83, null);
		}
		
		else {
			g.drawImage(window_off, 115, 80, null);
		}
		if (States.zoneFourFiveSixACONOFF_E) {
			g.drawImage(aircon_on, -5, -10, null);
			g.drawImage(aircon_on, 200, -10, null);
			}
			
		else {
			g.drawImage(aircon_off, 0, 0, null);
			g.drawImage(aircon_off, 220, 0, null);
		}
		
		//g.setColor(Color.white);
	    //g.fillRect(0, 0, 300, 150);
		
	}
}
