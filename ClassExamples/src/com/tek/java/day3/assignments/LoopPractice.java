package com.tek.java.day3.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoopPractice {
	public static void main(String args[]) {
		// exercise 1
		System.out.println("Exercise 1");
		for(int i = 1; i <= 12; i++) {
			//System.out.print(i + " ");
			for(int j = 1; j <= 12; j++) {
				System.out.print(j * i + " ");
			}
			System.out.println();
		}
		
		
		// exercise 2
		System.out.println();
		System.out.println("\nExercise 2");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int n1 = scan.nextInt();
		System.out.println("Enter second number" );
		int n2 = scan.nextInt();
		
		List<Integer> intList = new ArrayList<>();
		
		for(int k = 1; k <= n1 || k <= n2; k++) {
			int temp = 0;
			if (n1 % k == 0 && n2 % k == 0) {
				temp = k;
				intList.add(temp);
			}
		}
		
		int maxVal = 0;
		for (int e : intList ) {
			if (e > maxVal) {
				maxVal = e;
			}
		}
		
		System.out.println(maxVal);
		
		
		// exercise 3
		System.out.println("\nExercise 3");
		int tuition = 10000;
		int doubleTuition = tuition * 2;
		int newTuition = tuition;
		int counter = 0;
		
		//System.out.println(doubleTuition);
		//System.out.println(newTuition);
		
		while(newTuition < doubleTuition) {
			newTuition *= 1.07;
			counter++;
			//System.out.println(newTuition);
		} 
		System.out.println("Your tuition will be doubled in " + counter + " years.");
	}

}
