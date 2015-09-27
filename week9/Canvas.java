package com.hackbulgaria.programming51.week9;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
public class Canvas extends JPanel{	
	private final int WIDTH = 800;
	private final int HEIGHT = 800;

	public Canvas(){
		
		super.setPreferredSize(new Dimension(WIDTH,HEIGHT));
	}
	
	public void paintRect(Graphics g1){
		super.paintComponents(g1);
		Graphics2D g = (Graphics2D)g1;
		Rectangle2D.Double rect = new Rectangle2D.Double(10,10,50,50);
		g.setColor(Color.GRAY);
		
	}
}
