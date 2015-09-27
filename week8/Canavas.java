package com.hackbulgaria.programming51.week8;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Canavas extends JPanel {
	
	private final int WIDTH = 400;
	private final int HEIGHT = 400;
	
	public void paintComponent(Graphics g){
		super.paintComponents(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setPaint(Color.BLUE);
		g2.fillRect(0, 0, WIDTH, HEIGHT);
		
		g2.setPaint(Color.GREEN);
		g2.fillRect(10, 10, WIDTH - 20, HEIGHT - 20);
		
		double centerX = WIDTH /2;
		double centerY = HEIGHT /2;
		Rectangle2D.Double r = new Rectangle2D.Double(centerX - 25, centerY - 25, centerY, centerX);
		g2.setPaint(Color.yellow);
		g2.fill(r);
		
	}
	
	public Canavas() {
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
	}
}
