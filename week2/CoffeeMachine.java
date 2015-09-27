package com.hackbulgaria.programming51.week2;

import java.util.Scanner;

public class CoffeeMachine {

	private Coffee[] kinds;
	private double balance;
	private int machineCapacity = 10;
	private int  currentKindsIndex = 0;
	
	public CoffeeMachine() {

		kinds = new Coffee[machineCapacity];

	}

	
	
	private boolean hasKind(Coffee kind){
		for (int i = 0; i < currentKindsIndex; i++) {
			
			if(kinds[i].brand.equals(kind.brand)){
				return true;
			}
		}
		return false;
	}
	
	public boolean addCoffee(Coffee kind){
		
		if(currentKindsIndex + 1 >= machineCapacity){
			return false;
		}
		if (hasKind(kind)){
			return false;
		}
		
		kinds[currentKindsIndex] = kind;
		currentKindsIndex += 1;
		return true;
				
	}
	public double buyCoffee(Coffee coffee, double moneyTaken){
		if(!hasKind(coffee)){
			return -1;
		}
		
		double change = moneyTaken - coffee.price;
		if(change < 0){
			return -1;
		}
		balance += coffee.price;
		return change;
	}
	
	
	public double getBalance(){
		return balance;
	}
	
	
	
	
	
	
/*	
	public boolean addCoffee(Coffee coffee) {

		return false;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		CoffeeMachine machine = new CoffeeMachine();

		for (int i = 0; i < 2; i++) {

			System.out.println("brand?");
			String coffeeBrand = scanner.next();
			System.out.println("price?");
			double coffeePrice = scanner.nextDouble();

			Coffee coffee = new Coffee(coffeeBrand, coffeePrice);

			machine.addCoffee(coffee);
		}

	}
	*/

}
