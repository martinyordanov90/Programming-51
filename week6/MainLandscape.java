package com.hackbulgaria.programming51.week6;

public class MainLandscape {

	public static void main(String[] args) {
		Landscape l = new Landscape();
		l.addTile(new Land());
		l.addTile(new Water());
		l.addTile(new Mountain());
		l.addTile(new Forest());
		System.out.println(l.renderAll());
	}

}
