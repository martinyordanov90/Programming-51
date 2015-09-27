package com.hackbulgaria.programming51.week1;

import java.util.Scanner;

import org.omg.PortableInterceptor.USER_EXCEPTION;

public class Binary 
{

	private static Scanner kbd = new Scanner (System.in);
	
	public static void main(String[] args)
	{
		int numValue = 0;
		System.out.println("Please enter an integer between 255 and 0");
		numValue = kbd.nextInt();
		
		if (numValue > 255 || numValue <0)
		{
			System.out.println("Error: Integer is too high or too low");
		}
		getBinary(numValue);
	}
		public static void getBinary(int numValue)
		{
			String s = "";
			for(int j = 0; j < 8; j ++)
			{
				if(numValue % 2 == 1)
				{
					s = '1' + s;
				}
				if (numValue % 2 == 0)
				{
					s = '0' + s;
				}
				numValue = numValue / 2;
				

			}
		getInt(s);
		System.out.println("Binary equavalent is: " + s);
		}
	
		public static void getInt(String s)
		{
			int x = 128;
			int total = 0;
			for (int j = 0; j < 8; j++) 
			{
				if(s.charAt(j) == '1')
				{
					total = total + (x * 1);
				}
				x = x/2;
			}
			System.out.println("Calculated integer valus is:" + total);
		}

		public static int countBits(int n){
			String k = "";
			for(int j = 0; j < 8; j ++)
			{
				if(n % 2 == 1)
				{
					k = '1' + k;
				}
				if (n % 2 == 0)
				{
					k = '0' + k;
				}
				n = n / 2;
		 }
			System.out.println("Binary equavalent is: " + k);
		 
		 int total = 0;
		 for (int i = 0; i < k.length(); i++) {
			total = total + i;
		}
		 System.out.println(total);
		return total;
	}
}