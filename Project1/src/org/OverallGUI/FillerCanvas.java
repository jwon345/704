package org.OverallGUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import org.compsys704.States;

public class FillerCanvas extends JPanel {

	BufferedImage filler;
	BufferedImage nocap;

	
	public FillerCanvas(){
		try {
		
			filler = ImageIO.read(new File("res/filler.png"));
			nocap = ImageIO.read(new File("res/nocap_bottle.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);;
		}
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
	        
		 	if (States.BOTTLE_AT_POS2) {
	            g.drawImage(nocap, 175, 215, null);
	        }
		 	
		
	        
	        if (States.DOS_UNIT_VALVE_RETRACT) {
	        	 g.drawImage(filler, 80, -30, null);
	        	 g.drawImage(nocap, 175, 215, null);
	        }
	        
	        if (States.VALVE_INJECTOR_ONOFF) {
	        	g.setColor(Color.CYAN);
		        g.fillRect(157, 0, 8, 90);
		 	}
	        
	        
	        else if (States.DOS_UNIT_VALVE_EXTEND) {
		        	 g.drawImage(filler, 80, 50, null);
		        	 g.drawImage(nocap, 175, 215, null);
		        	 g.setColor(Color.CYAN);
				     g.fillRect(195, 205, 7, 28);
				     
				     g.fillRect(183, 280, 30, 20);
	        }
	        
	        else {
	        	 g.drawImage(filler, 80, 50, null);
	        }

	        g.setColor(Color.gray);
	        g.fillRect(0, 300, 400, 30);

	}
}
