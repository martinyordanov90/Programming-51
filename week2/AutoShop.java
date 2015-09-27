package com.hackbulgaria.programming51.week2;

import java.lang.reflect.Array;

public class AutoShop {
	
	public Auto[] listOfCars = new Auto[20];
	public int sportsTaken = 0;
	
	public boolean addCar(Auto car){
		if (sportsTaken >= 20) {
			return false;
		} else{
			listOfCars[sportsTaken] = car;
			sportsTaken ++;
			return true;
		}
	}
	
	public Auto getTopSpeed(){
		Auto topSpeedCar = listOfCars[0];
		for (int i = 0; i < sportsTaken; i++) {
			if (topSpeedCar.maxSpeed <= listOfCars[i].maxSpeed) {
				topSpeedCar = listOfCars[i];
			}
		}
		return topSpeedCar;
	}
	
	public String toString(){
		String result = "";
		
		for (int j = 0; j < sportsTaken; j++) {
			result = result + listOfCars[j].toString();
		}
		return result;
	}
	
	public static void main(String[] args){
		
		Person ivan = new Person();
				ivan.firstName = "Ivan";
				ivan.age = 25; 
		
				Auto audi = new Auto();
		
				audi.owner = ivan;
				audi.maxSpeed = 200;
				audi.brand = "Audi";
				audi.name = "Begachka";
				audi.price = 5000;
		
				
				Person gosho = new Person();
				gosho.firstName = "Gosho";
				gosho.age = 25;
		
				Auto peugeot = new Auto();
		
				peugeot.owner = gosho;
				peugeot.maxSpeed = 220;
				peugeot.brand = "Peugeot";
				peugeot.name = "Dragster";
				peugeot.price = 10000;
				
				
				Person pe6o = new Person();
				pe6o.firstName = "Pe6o";
				pe6o.lastName = "Pe6ev";
				pe6o.age = 27;
				
				Auto mazda = new Auto();
		
				mazda.owner = pe6o;
				mazda.maxSpeed = 260;
				mazda.brand = "Mazda";
				mazda.name = "Mazdi4ka";
				mazda.price = 7000;
		
				
				AutoShop as = new AutoShop();
				as.addCar(audi);
				as.addCar(peugeot);
				as.addCar(mazda);
		
				System.out.println(as.getTopSpeed());
		
			}
		
		}