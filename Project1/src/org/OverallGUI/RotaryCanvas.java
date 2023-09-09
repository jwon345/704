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
	BufferedImage bottle;
	
	private int currentPosition = 1;
	private final int MAX_POSITIONS = 6;
	
	public RotaryCanvas(){
		try {
		
			bottle = ImageIO.read(new File("res/bottle_table.png"));
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
		
		if (States.BOTTLE_AT_POS2) {
		g.drawImage(bottle, 85, 105, null);
		}
		
		if (States.BOTTLE_AT_POS1) {
		g.drawImage(bottle, 85, 195, null);
		}
		
		if (States.BOTTLE_AT_POS4) {
		g.drawImage(bottle, 245, 105, null);
		}
		
		if (States.BOTTLE_AT_POS5) {
			g.drawImage(bottle, 245, 195, null);
		}
		
		if (States.BOTTLE_AT_POS3) {
			g.drawImage(bottle, 165, 60, null);
		}
		
		//g.drawImage(bottle, 165, 240, null);
		

	}
}
