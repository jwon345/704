package org.conveyor;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Canvas extends JPanel {
	
	BufferedImage conveyor, conveyorRun;
	BufferedImage bottle;
	
	public Canvas() {
		try {
			conveyor = ImageIO.read(new File("res/conveyor.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		try {
			conveyorRun = ImageIO.read(new File("res/motorRunning.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		try {
			bottle = ImageIO.read(new File("res/bottle.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		if (States2.drawConveyorRunning)
		{
			g.drawImage(conveyorRun, 0 , 70, null);
		}
		else
		{
			g.drawImage(conveyor, 0 , 50, null);
		}
	
		//magic numbers BBY
		switch (States2.bottlePos) {
		case 0:
		  g.drawImage(bottle, 1000 , 130, null);
//		  System.out.println("draw1");
		  break;
		case 1:
		  g.drawImage(bottle, 0 , 130, null);
		  break;
//		  System.out.println("draw2");
		case 2:
		  g.drawImage(bottle, 160 , 130, null);
		  break;
		case 4:
		  g.drawImage(bottle, 460 , 130, null);
		  break;
//		  System.out.println("draw2");
		case 5:
		  g.drawImage(bottle, 600 , 130, null);
		  break;
		}

    

	}
}
