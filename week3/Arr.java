package com.hackbulgaria.programming51.week3;

public class Arr {

	public static void printArr(int [] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}
	
	public static void sumArr(int [] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			
			sum += a[i];
			System.out.println(sum);
		}
	}
	public static int [] messUp(int [] a) {
		
		int [] temp = Arr.copy(a);
		for (int i = 0; i < a.length; i++) {
			if (i%2 == 0) {
				temp[i] = 0;
			}
		}
		return temp;
	}
	public static int [] copy(int [] a){
		int [] temp = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			temp[i] = 0;
		}
		return temp;
	}
	public static int [] sort(int [] a){
		int [] result = copy(a);
		for (int i = 0; i < result.length; i++) {
			
			
			//int min = result[0];
			int index = i;
			for (int j = i; j < result.length; j++) {
				if (result[j]< result[index]){
					//min = result[j];
					index = j;
				}
			}
			int temp = result[i];
			result[i] = result[index];
			result[index] = temp;
			
		}
	
	return result;
	}
	public static void selectionSort(int [] a){
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length; j++) {
				if (a[j] < a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
}
