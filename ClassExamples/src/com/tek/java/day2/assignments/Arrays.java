package com.tek.java.day2.assignments;

public class Arrays {
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
		
		
	}

}
