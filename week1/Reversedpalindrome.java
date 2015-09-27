package com.hackbulgaria.programming51.week1;

import java.util.Scanner;

public class Reversedpalindrome {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int nRev = 0;
		int nTemp = 0;
		
		while(nTemp > 0){
			nRev = (nRev * 10 + nTemp % 10);
			nTemp = nTemp / 10;
		}
		
		int nSum = n + nRev;
		int nSumRev = 0;
		while(nSum > 0){
			nSumRev = (nSumRev * 10) + nSum % 10;
			nSum = nSum / 10;
		}
		
		if (nSumRev == n + nRev) {
			System.out.println("Yes");
		} else{
			System.out.println("No");
		}
	}
}
