package com.hackbulgaria.programming51.week8;

import java.awt.Dimension;

import javax.swing.JFrame;
public class Application  extends JFrame{
	
	public Application(){
		add(new Canavas());
		
		setResizable(false);
		pack();
		setTitle("Hello!");
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	
	public static void main(String[] args){
		Application app = new Application();
		app.setVisible(true);
		
	}

}
