package org.conveyor;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Canvas extends JPanel {
	
	BufferedImage conveyor;
	BufferedImage bottle;
	boolean showBottle = false; // This flag determines whether to show the bottle
	
	public Canvas() {
		try {
			conveyor = ImageIO.read(new File("res/conveyor.png"));
			bottle = ImageIO.read(new File("res/bottle.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	public void displayBottle(boolean display) {
		showBottle = display;
		repaint();  // this will call paintComponent again
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(conveyor, 0 , 50, null);
		if(showBottle) { // draw bottle if showBottle is true
			// Here, I'm drawing the bottle at (50, 50). Modify the coordinates as necessary.
			g.drawImage(bottle, 50, 50, null); 
		}
	}
}
