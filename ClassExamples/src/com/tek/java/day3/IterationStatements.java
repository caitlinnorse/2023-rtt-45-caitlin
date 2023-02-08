package com.tek.java.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IterationStatements {
	public static void main (String args[]) {
		IterationStatements li = new IterationStatements();
		//li.forLoop();
		//li.forLoopList();
		//li.forListExercise(5, 8);
		//System.out.println();
		//li.forListExercise(3, 10);
		//li.whileLoop(3, 5);
		li.randomValues(1, 19, 8);
		
		
	}
	// loop 10 to 50 ( even numbers printed)
	public void forLoop() {
		for (int count = 10; count <= 30; count += 2) {
			System.out.println("Value of count : " + count);
		}
		System.out.println();
		
		// decrement by 1 from 10 to 1
		for (int count = 10; count >= 1; count--) {
			System.out.println("Value at count : " + count);
		}
		System.out.println();
		
		// loop only iterates once because count is set to 10 and exits loop
		// will not be used often. maybe once every fre years - just an example that you can modify the count
		for (int count = 1; count <= 10; count++) {
			System.out.println("Value at count : " + count);
			count = 10;
		}
		
		System.out.println();
		
		// only iterates once because break statement causes you to exit loop
		for (int count = 1; count <= 10; count++) {
			System.out.println("Value at count : " + count);
			break;			
		}
		
		System.out.println();
		
		for (int count = 1; count <= 10; count++) {
			if (count % 2 == 1) { // this gets us odd numbers
				continue;
			}
			System.out.println("Value at count : " + count);
		}
		// -----------------------------------------------------------------------------------------
		
		// EXAMPLES - Loop from 10 to 30 showing even numbers only and using continue
		// Loop from 10 to 1 showing all numbers
		// Loop from 10 to 30 and break when you find the first number divisable by 3
		
		// only even numbers
		System.out.println();
		System.out.println();
		for (int i = 10; i <= 30; i++) {
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
		
		// 10 to 1
		System.out.println();
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		
		// first divisible by 3
		System.out.println();
		for (int i = 10; i <= 30; i++) {
			if(i % 3 == 0){
				break;
			}
			System.out.println(i)
			;
		}
		
		
	}
	// position : 0 contains "String 1"
	// position : 1 contains "String 2"
	// position : 2 contains "String 3"
	public void forLoopList() {
		// specify that the list can only contain strings
		List<String> list = new ArrayList<>();
		
		list.add("String 1");
		list.add("String 2");
		list.add("String 3");
		
		// loop over and print element
		// this list is used when you have a specific requirement to know the position of each element
		// for dome sort of business logic ... this does happen from time to time
		for(int position = 0; position < list.size(); position++) {
			System.out.println(list.get(position));
		}
		
		// for each element in the list, do something
		for (String element : list) {
			System.out.println(element);
		}
		
		// TODO - create a List of INtegers and use a loop to add the numbers 1 to 10 to the list
		// The use the new style for loop to print the elements in the list
		
		List<Integer> intList = new ArrayList<>();
		
		for (int i = 1; i <= 10; i++) {
			intList.add(i);
		}
		
		for(int j : intList) {
			System.out.println(j);
		}
		
	}
	
	public void forListExercise(int start, int end) {
		// TODO - create a List of INtegers and use a loop to add the numbers 1 to 10 to the list
		// The use the new style for loop to print the elements in the list
		
		List<Integer> intList = new ArrayList<>();
		
		for (int i = start; i <= end; i++) {
			intList.add(i);
		}
		
		for(int j : intList) {
			System.out.println(j);
		}
		
	}
	
	public void whileLoop(int start, int end) {
		List<Integer> list = new ArrayList<>();
		
		int i = start;
		while(i <= end) {
			list.add(i);
			i = i + 1;
		}
		
		for(int e : list) {
			System.out.println(e);
		}
	}
	
	public void maxRandomValue() {
		int max = 10;
		int min = 1;
		

		
		List<Integer> list = new ArrayList<>();
		for(int i = 1; i <=10; i++) {
			Random random = new Random();
			int randomNum = random.nextInt(max - min + 1) + min;
			
			list.add(randomNum);
		}
		
		for(Integer e : list) {
			System.out.println(e);
		}
		int maxValue = 0;
		
		for(Integer r : list) {
			if(r > maxValue) {
				maxValue = r;
			}
		}
		
		int minValue = list.get(0);
		for(Integer k : list) {
			if (k < minValue) {
				minValue = k;
			}
		}
		System.out.println("Max value: " + maxValue);
		System.out.println("Min value: " + minValue);

	}
	
	// exercise make this take a 3 parameter input
	// the min random value, the max random value, and the number of elements in the list
	
	public void randomValues(int minVal, int maxVal, int listSize) {

		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 1; i <= listSize; i++) {
			Random random = new Random();
			int randomNum = random.nextInt((maxVal + minVal) + 1) + minVal;
			
			System.out.println(randomNum);
			list.add(randomNum);
			
		int maxValue = 0;
		
		for(Integer r : list) {
			if(r > maxValue) {
				maxValue = r;
			}
		}
		
		int minValue = list.get(0);
		for(Integer k : list) {
			if (k < minValue) {
				minValue = k;
			}
		}
		System.out.println("Max value: " + maxValue);
		System.out.println("Min value: " + minValue);
		System.out.println("List Length: " + list.size());
		
		
	}

}
}
