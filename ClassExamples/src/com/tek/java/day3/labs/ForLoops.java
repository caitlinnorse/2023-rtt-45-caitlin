package com.tek.java.day3.labs;

import java.util.Scanner;

public class ForLoops {
	public static void main(String args[]) {

	}

	// Program to print a text 5 times
	public class loopdemoone {
		public static void main(String[] args) {
			int n = 5;
			// for loop
			for (int i = 1; i <= n; ++i) {
				System.out.println("Java is fun");
			}
		}
	}

	// Program to find the sum of natural numbers from 1 to 1000.
	public class Main {
		public static void main(String[] args) {
			int sum = 0;
			int n = 1000;
			// for loop
			for (int i = 1; i <= n; ++i) {
				// body inside for loop
				sum += i; // sum = sum + i
			}
			System.out.println("Sum = " + sum);
		}
	}

	public class palindromeexmaple {
		public static void main(String[] args) {
			String original, reverse = ""; // Objects of String class
			Scanner in = new Scanner(System.in);
			System.out.println("Enter a string/number to check if it is a palindrome");
			original = in.nextLine();
			int length = original.length();
			for (int i = length - 1; i >= 0; i--)
				reverse = reverse + original.charAt(i);
			if (original.equals(reverse)) {
				System.out.println("Entered string/number is a palindrome.");
			} else {
				System.out.println("Entered string/number isn't a palindrome.");
			}
		}
	}
	
	public class PyramidExample {
		   public static void main(String[] args) {
		for(int i=1;i<=5;i++){
		   for(int j=1;j<=i;j++){
		       System.out.print("* ");
		   }
		   System.out.println();//new line
		  }
		 }
		}

}
