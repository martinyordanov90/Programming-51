package com.hackbulgaria.programming51.week2;

public class Person {
	
	public String firstName = "";
	public String lastName = "";
	public int age = 0;
	
	
	
	public String toString(){
		
		Person Ivan = new Person();
		Ivan.firstName = "Ivan";
		Ivan.age = 25;
		
		Auto audi = new Auto();
		
		audi.owner = Ivan;
		audi.maxSpeed = 200;
		audi.brand = "Audi";
		audi.name = "Begachka";
		audi.price = 5000;
		
		return audi.brand + " " + audi.name + " " + "Max speed: " +audi.maxSpeed + " " + "Price:" + audi.price + " " + "Owner:" + audi.owner;
	
	
	
	
	}
}
