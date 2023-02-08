package com.tek.java.day2.assignments;

import java.util.Scanner;

public class ConditionalFlow {
	public static void main(String args[]) {
		// First exercise

		System.out.println("First Exercise");

		int x = 15;

		if (x < 10) {
			System.out.println("\nLess than 10");

		}

		// Second exercise
		System.out.println("\nSecond Exercise");

		int y = 15;

		if (y < 10) {
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
		} else if (grade >= 0) {
			System.out.println("F");
		} else {

		}

		// Sixth exercise
		System.out.println("\nSixth Exercise");

		System.out.println("Please enter a number corresponding to a day of the week.");
		int weekday = scan.nextInt();

		switch (weekday) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Out of range");
			break;
		}

		// Seventh exercise
		System.out.println("\nSeventh Exercise");

		System.out.println("Please enter your filing status: ");
		String filingStatus = scan.nextLine();

		System.out.println("Please enter your income: ");
		int income = scan.nextInt();

		switch (filingStatus) {
		case "Single": {
			if (income >= 372951) {
				System.out.println("35%");
			} else if (income >= 171551) {
				System.out.println("33%");
			} else if (income >= 82251) {
				System.out.println("28%");
			} else if (income >= 33951) {
				System.out.println("25%");
			} else if (income >= 8351) {
				System.out.println("15%");
			} else if (income >= 0) {
				System.out.println("10%");
			} else {
				System.out.println("Not valid");
			}
		}
		case "Married Filing Jointly": {
			if(income >= 372951) {
				System.out.println("35%");
			} else if (income >= 208851) {
				System.out.println("33%");
			} else if (income >= 1370511) {
				System.out.println("28%");
			} else if (income >= 67901) {
				System.out.println("25%");
			} else if (income >= 16701) {
				System.out.println("15%");
			} else if (income >= 0) {
				System.out.println("10%");
			} else {
				System.out.println("Not valid");
			}
			break;
		}
		case "Married Filing Separately": {
			if(income >= 186276) {
				System.out.println("35%");
			} else if (income >= 104426) {
				System.out.println("33%");
			} else if (income >= 68526) {
				System.out.println("28%");
			} else if (income >= 33951) {
				System.out.println("25%");
			} else if (income >= 8351) {
				System.out.println("15%");
			} else if (income >= 0) {
				System.out.println("10%");
			} else {
				System.out.println("Not valid");
			}
			break;
		}
		case "Head of Household": {
			if(income >= 372951) {
				System.out.println("35%");
			} else if (income >= 190201) {
				System.out.println("33%");
			} else if (income >= 117451) {
				System.out.println("28%");
			} else if (income >= 45501) {
				System.out.println("25%");
			} else if (income >= 11951) {
				System.out.println("15%");
			} else if (income >= 0) {
				System.out.println("10%");
			} else {
				System.out.println("Not valid");
			}
			break;
		}
		}

	}

}
