package com.hackbulgaria.programming51.week1;

import java.util.Scanner;

public class calculator {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		char oper = scanner.next().charAt(0);
		int b = scanner.nextInt();

		
		if (oper == '+') {
			System.out.println(a + b);
		}
		if (oper == '-') {
			System.out.println(a - b);
		}
		if (oper == '*') {
			System.out.println(a * b);
		}
		if (oper == '/') {
			System.out.println(a / b);
		}
		
		if (oper == '^') {
			int result = 1;
			for (int i = 0; i < b; i++) {
				result = result * a;
			}
			System.out.println(result);
		}
		
		if (oper == '?'){
			int fact1 = 1; // this  will be the result
	        for (int i = 1; i <= a; i++) {
	            fact1 *= i;
			}
	        int fact2 = 1; // this  will be the result
	        for (int i = 1; i <= b; i++) {
	            fact2 *= i;
				}
		System.out.println("result = " + (fact1 + fact2) );
		}
	}

	
	public static boolean isEven(int num){
		
		/*boolean iseven = num % 2 == 0;*/
		if (num % 2 == 0){
		return true;
		}else{
			return false;
			/*return num % 2 == 0;*/
		}	
	}
	
	public static int sum(int x,int y){
		return x + y;
	}
	
	Scanner input = new Scanner(System.in);
	String str = input.next();
	
	
	public static String reverse (String name) {
		String tempName = "";
		for (int i = 0; i < name.length(); i ++){
			tempName = name.charAt(i) + tempName;
		}
		return tempName;
	}
	double a = 5; //int
	double b = 3; // int
	public static double devider(double a, double b){
		double c = a/b;
	return c;
	}
}

