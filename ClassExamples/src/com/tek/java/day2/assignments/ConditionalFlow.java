package com.tek.java.day2.assignments;

import java.util.Scanner;

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
		
		// Fourth exercise
		System.out.println("\nFourth Exercise");
		
		int a = 5;
		
		if (a >= 10 && a <= 20) {
			System.out.println("In range");
		} else {
			System.out.println("Out of range");
		}
		
		// Fifth exercise
		System.out.println("\nFifth Exercise");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your grade: ");
		int grade = scan.nextInt();
		
		
		if (grade > 100 || grade < 0) {
			System.out.println("Score out of range");
		} else if (grade >= 90) {
			System.out.println("A");
		} else if (grade >= 80) {
			System.out.println("B");
		} else if (grade >= 70) {
			System.out.println("C");
		} else if (grade >= 60) {
			System.out.println("D");
		} else if (grade >= 0){
			System.out.println("F");
		} else {
			
		}
	}

}
