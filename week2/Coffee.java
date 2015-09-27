package com.hackbulgaria.programming51.week2;

public class Coffee {

	public String toString() {
		return brand + " : " + price;
	}

	public String brand;
	public double price;

	public Coffee(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}

	  public Coffee() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	  
	  Coffee Java = new Coffee(); Java.brand = "Java"; Java.price = 2.5f;
	  
	  Coffee Jacobs = new Coffee(); Jacobs.brand = "Jacobs"; Jacobs.price = 4.2f;
	  
	  Coffee Brazilia = new Coffee(); Brazilia.brand = "Brazilia";
	  Brazilia.price = 3.8f;
	  
	  System.out.println(Java); System.out.println(Jacobs);
	  System.out.println(Brazilia);
	  }	

}
