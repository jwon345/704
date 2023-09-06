package org.OverallGUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import org.compsys704.States;

public class RotaryCanvas extends JPanel {

	BufferedImage table;
	BufferedImage arrow_1;
	BufferedImage arrow_2;
	BufferedImage arrow_3;
	BufferedImage arrow_4;
	BufferedImage arrow_5;
	BufferedImage arrow_6;
	
	
	public RotaryCanvas(){
		try {
		
			table = ImageIO.read(new File("res/rotary.png"));
			arrow_1 = ImageIO.read(new File("res/arrow_1.png"));
			arrow_2 = ImageIO.read(new File("res/arrow_2.png"));
			arrow_3 = ImageIO.read(new File("res/arrow_3.png"));
			arrow_4 = ImageIO.read(new File("res/arrow_4.png"));
			arrow_5 = ImageIO.read(new File("res/arrow_5.png"));
			arrow_6 = ImageIO.read(new File("res/arrow_6.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);;
		}
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(table, -90, 50, null);	
		g.drawImage(arrow_1, 120, 175, null);	
		
		if(States.ROTARY_TABLE_TRIGGERED)
			g.drawImage(arrow_1, 100, 100, null);
	}
}
