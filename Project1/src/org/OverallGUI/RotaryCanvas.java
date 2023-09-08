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
	
	private int currentPosition = 1;
	private final int MAX_POSITIONS = 6;
	
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
		if (States.ROTARY_TABLE_TRIGGERED) {
            currentPosition++;
            if (currentPosition > MAX_POSITIONS) {
                currentPosition = 1;
            }
		}
		
		super.paintComponent(g);
		g.drawImage(table, -90, 50, null);	
		
		 switch (currentPosition) {
         case 1:
        	g.drawImage(arrow_1, 120, 180, null);	
             break;
         case 2:
        	 g.drawImage(arrow_2, 128, 135, null);
             break;
         case 3:
        	 g.drawImage(arrow_3, 177, 105, null);
             break;
         case 4:
        	 g.drawImage(arrow_4, 210, 135, null);
             break;
         case 5:
        	 g.drawImage(arrow_5, 205, 170, null);
             break;
         case 6:
        	 g.drawImage(arrow_6, 175, 195, null);
             break;
		 }
	}
}
