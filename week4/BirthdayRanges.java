package com.hackbulgaria.programming51.week4;
import java.util.Scanner;
import java.util.Vector;

import org.w3c.dom.ranges.Range;
public class BirthdayRanges {

	  public static Vector<Integer> birthdaysCount(Vector<Integer> birthdays, Vector<IntPair> ranges) {
		  Vector<Integer> result = new Vector<Integer>();
		  int counter = 0;
		  for (int i = 0; i < ranges.size(); i++) {
			for (int j = 0; j < birthdays.size(); j++) {
//				if(ranges.elemntAt[j].contains(birthdays[i]){
				if (birthdays.elementAt(j) >= ranges.get(i).start && birthdays.elementAt(j) <= ranges.get(i).end) {
					counter += 1;
					
				}
			}
			result.add(counter);
			counter = 0;
		}
		return result;
		  
	  }

	  public static void main(String[] args) {
	   Vector<Integer> birthdays = new Vector<Integer>();
	     Vector<IntPair> ranges = new Vector<IntPair>();

	     Scanner scanner = new Scanner(System.in);

	     int bdaysCount = scanner.nextInt();

	     for(int i = 0; i < bdaysCount; i++) {
	       birthdays.add(scanner.nextInt());
	     }

	     int rangesCount = scanner.nextInt();

	     for(int i = 0; i < rangesCount; i ++) {
	       IntPair pair = new IntPair();

	       pair.start = scanner.nextInt();
	       pair.end = scanner.nextInt();

	       ranges.add(pair);
	     }

	     System.out.println("Result is:");
	     Vector<Integer> result = birthdaysCount(birthdays, ranges);

	     for(int count: result) {
	       System.out.print(count);
	       System.out.print(", ");
	     }   
	  }
	}
