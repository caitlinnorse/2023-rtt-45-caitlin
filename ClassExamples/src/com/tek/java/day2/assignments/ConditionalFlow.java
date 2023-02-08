package com.tek.java.day2.assignments;

public class ConditionalFlow {
	public static void main (String args[]) {
		// First exercise
		
		System.out.println("First Exercise");
		
		int x = 15;
		
		if ( x < 10) {
			System.out.println("\nLess than 10");
			
		}
		
		// Second exercise
		System.out.println("\nSecond Exercise");
		
		int y = 15;
		
		if ( y < 10) {
			System.out.println("Less than 10");
		} else {
			System.out.println("Greater than 10");
		}
		
		// Third exercise
		System.out.println("\nThird Exercise");
		
		int z = 50;
		
		if (z < 10) {
			System.out.println("Less than 10");
		} else if (z >= 10 && z < 20) {
			System.out.println("Between 10 and 20");
		} else {
			System.out.println("Greater than or equal to 20");
		}
	}

}
