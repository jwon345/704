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
	BufferedImage bottle;
	BufferedImage bottle_Filled;
	BufferedImage bottle_Capped;
	BufferedImage filler;
	BufferedImage capper;
	BufferedImage lidloader;
	BufferedImage lid_table;
	
	public RotaryCanvas(){
		try {
			filler = ImageIO.read(new File("res/filler_table.png"));
			capper = ImageIO.read(new File("res/capper_table.png"));
			bottle_Filled = ImageIO.read(new File("res/bottle_table_filled.png"));
			bottle_Capped = ImageIO.read(new File("res/bottle_table_lid.png"));
			bottle = ImageIO.read(new File("res/bottle_table.png"));
			table = ImageIO.read(new File("res/rotary.png"));
			lidloader = ImageIO.read(new File("res/lidloader.png"));
			lid_table = ImageIO.read(new File("res/lid_table.png"));
			
		
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);;
		}
	}
	
	@Override
	protected void paintComponent(Graphics g){
		
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.drawString("Rotary Table", 10, 20);
		
		g.drawImage(table, -90, 50, null);	
		g.drawImage(filler, 30, 55, null);	
		g.drawImage(capper, 243, 68, null);	
		g.drawImage(lid_table, 149, -10, null);	
		g.drawImage(lidloader, 200, 20, null);	
		
		if (States.BOTTLE_AT_POS2) {
		g.drawImage(bottle, 85, 105, null);
		}
		
		if (States.BOTTLE_AT_POS1) {
		g.drawImage(bottle, 85, 195, null);
		}
		
		if (States.BOTTLE_AT_POS4) {
		g.drawImage(bottle_Capped, 238, 100, null);
		}
		
		if (States.BOTTLE_AT_POS5) {
			g.drawImage(bottle_Capped, 238, 190, null);
		}
		
		if (States.BOTTLE_AT_POS3) {
			g.drawImage(bottle_Filled, 167, 58, null);
		}
		
		//g.drawImage(bottle, 165, 240, null);
		

	}
}
