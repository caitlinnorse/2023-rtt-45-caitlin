package com.tek.java.day3;

import java.util.ArrayList;
import java.util.List;

public class IterationStatements {
	public static void main (String args[]) {
		IterationStatements li = new IterationStatements();
		//li.forLoop();
		li.forLoopList();
		
		
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

}
