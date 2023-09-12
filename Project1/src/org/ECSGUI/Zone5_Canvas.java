package org.ECSGUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import org.compsys704.States;

public class Zone5_Canvas extends JPanel {

	BufferedImage aircon_off;
	BufferedImage aircon_on;
	BufferedImage light_off;
	BufferedImage light_on;
	
	public Zone5_Canvas(){
		try {
			// LIDLOADER IMAGES
			aircon_off = ImageIO.read(new File("res/aircon_off.png"));
			aircon_on = ImageIO.read(new File("res/aircon_on.png"));
			

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

		g.drawImage(aircon_off, 0, 0, null);
		g.drawImage(aircon_on, 200, -10, null);
		
		
		
		g.drawImage(light_off, 125, 0, null);
		g.drawImage(light_on, 115, 0, null);
		
		
		
		//g.setColor(Color.white);
	    //g.fillRect(0, 0, 300, 150);
		
	}
}
