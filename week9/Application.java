package com.hackbulgaria.programming51.week9;

import javax.swing.JFrame;


public class Application extends JFrame {
	
		public Application(){
			super.add(new Canvas());
			super.setResizable(false);
			super.pack();
		}
}
	
