package com.tek.java.day2.assignments;


import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice {
	public static void main(String args[]) {
		// exercise 1
		System.out.println("Exercise 1");
		
		int[] ints = new int[3];
		ints[0] = 1;
		ints[1] = 2;
		ints[2] = 3;
		
		System.out.println(ints[0]);
		System.out.println(ints[1]);
		System.out.println(ints[2]);
		
		// exercise 2
		System.out.println("\nExercise 2");
		int[] nums = {13, 5, 7, 68, 2};
		int middle = nums.length/2;
		
		System.out.println(nums[middle]);
		
		// exercise 3
		System.out.println("\nExercise 3");
		String[] strings = {"red", "green", "blue", "yellow"};
		
		System.out.println(strings.length);
		
		String[] strings1 = strings.clone();
		
		//System.out.println(Arrays.toString(strings1));
		for(String s : strings1) {
			System.out.println(s);
		}
		
		// exercise 4
		System.out.println("\nExercise 4");
		
		int[] elements = {2, 14, 78, 47, 12};
		
		int length = elements.length;
		
		int first = elements[0];
		int last = elements[length - 1];
		
		System.out.println("First: " + first + "\nLast: " + last);
		
		// System.out.println(elements[5]);
		// elements[5] = 22;
		
		// exercise 5
		System.out.println("\nExercise 5");
		
		int[] arrayInt = new int[5];
		
		for(int i = 0; i < 5; i++) {
			arrayInt[i] = i;
		}
		
		for(int i : arrayInt) {
			System.out.println(i);
		}
		
		// exercise 6
		System.out.println("\nExercise 6");
		int[] doubleArray = new int[5];
		
		for(int i = 0; i < doubleArray.length; i++) {
			doubleArray[i] = i * 2;
		}
		
		for(int i : doubleArray) {
			System.out.println(i);
		}
		
		// exercise 7
		System.out.println("\nExercise 7");
		
		int[] intArray = {2, 43, 64, 86, 108};
		int halfArray = intArray.length / 2;
		
		for(int i = 0; i < intArray.length; i++) {
			if(i == halfArray) {
				continue;
			}
			System.out.println(intArray[i]);
		}
		
		// exercise 8
		System.out.println("\nExercise 8");
		String[] swapArray = {"bird", "bee", "flower", "sun", "grass"};
		int middleElement = swapArray.length / 2;
		
		String temp = swapArray[0];
		swapArray[0] = swapArray[middleElement];
		swapArray[middleElement] = temp;
		
		for(String s : swapArray) {
			System.out.println(s);
		}
		
		// exercise 9
		System.out.println("\nExercise 9");
		Integer[] ascendingArray = {4, 2, 9, 13, 1, 0};
		
		int smallestInt = ascendingArray[0];
		int largestInt = 0;
		
		Arrays.sort(ascendingArray);
		
		for(int i : ascendingArray) {
			if(smallestInt > i) {
				smallestInt = i;
			}
		}
		
		for(int i : ascendingArray) {
			if(i > largestInt) {
				largestInt = i;
			}
		}
		System.out.print("Array in ascending order: ");
		for(int i : ascendingArray) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Largest Int: " + largestInt);
		System.out.println("Smallest Int: " + smallestInt);
		
		// exercise 10
		System.out.println("\nExercise 10");
		
		Object[] o = new Object[5];
		
		o[0] = 3;
		o[1] = "angel";
		o[2] = "sword";
		o[3] = "thistle";
		o[4] = 44.4;
		
		for(Object obj : o) {
			System.out.println(obj);
		}
		
		// exercise 11
		System.out.println("\nExercise 11");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many favorite things do you have?");
		int favorites = scan.nextInt();
		
		
		String[] favsList = new String[favorites];
		Scanner scan2 = new Scanner(System.in);
		
		for(int i = 0; i < favorites; i++) {
			System.out.println("Enter your thing: ");
			String thing = scan2.nextLine();
			favsList[i] = thing;
		}
		
		System.out.println("Your favorite things are: ");
		for(String s : favsList) {
			System.out.print(s + " ");
		}

		
	}


}
