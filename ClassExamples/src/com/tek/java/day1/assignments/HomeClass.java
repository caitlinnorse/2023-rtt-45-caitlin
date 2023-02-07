package com.tek.java.day1.assignments;


public class HomeClass {
	public static void main(String args[]) {
		
		// first activity
		int var1;
		int var2;
		
		var1 = 3;
		var2 = 9;
		
		int varSum = var1 + var2;
		
		System.out.println("The sum of the variables " + var1 + " and " + var2);
		System.out.println(varSum);
		
		// second activity
		double doub1;
		double doub2;
		
		doub1 = 4.9;
		doub2 = 5.7;
		
		double doubSum = doub1 + doub2;
		
		System.out.println("\nThe sum of the variables " + doub1 + " and " + doub2);
		System.out.println(doubSum);
		
		// third activity
		int var3;
		double doub3;
		
		var3 = 5;
		doub3 = 6.2;
		
		double mixedSum = var3 + doub3;
		
		System.out.println("\nThe sum of the variables " + var3 + " and " + doub3);
		System.out.println(mixedSum);
		
		// fourth activity
		int largeNum;
		int smallNum;
		
		largeNum = 15;
		smallNum = 4;
		
		double quotient = largeNum/smallNum;
		
		System.out.println("\nThe quotient of the integer variables " + largeNum + " and " + smallNum);
		System.out.println(quotient);
		
		// changing the larger number to a decimal
		quotient = (double)largeNum/(double)smallNum;
		
		System.out.println("\nThe quotient of the double variables " + largeNum + " and " + smallNum);
		System.out.println(quotient);
	}

}
