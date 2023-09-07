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
	        g.drawImage(filler, 80, -30, null);
	        g.drawImage(nocap, 175, 215, null);
	        g.setColor(Color.gray);
	        g.fillRect(0, 300, 400, 30);

	}
}
