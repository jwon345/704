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
	
	public Canvas() {
		try {
			conveyor = ImageIO.read(new File("res/conveyor.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
    if (States2.MOT_CONVEYOR_ON_OFF)
    {
      g.drawImage(conveyor, 0 , 50, null);
    }
    else
    {
      g.drawImage(conveyor, 120 , 50, null);
    }

    

	}
}
