package com.hackbulgaria.programming51.week6;

import com.hackbulgaria.programming51.week4.Vector;

public class Landscape {
	Vector<Tile> landscape = new Vector<>();
	
	public void addTile(Tile t) {
		landscape.add(t);
	}
	
	public String renderAll() {
		String str = "";
		for (int i = 0; i < landscape.size(); i++) {
			str += landscape.get(i).render();
		}
		return str;
	}
}
