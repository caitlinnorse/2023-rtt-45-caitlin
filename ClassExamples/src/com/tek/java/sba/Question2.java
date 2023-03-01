package com.tek.java.sba;

import java.util.Arrays;

public class Question2 {

	// position : 0 1 2 3 4 5
	// values : a b c d e f

	// they are going to give you the size
	private static final int ARRAY_SIZE = 5;
	private int[] array;

	public static void main(String[] args) {
		
		Question2 q2 = new Question2();

		// we need to make a 1 based data structure for an array of size 5
		// an array is 0 based so when we need 5 elements they go from 0 to 4
		// however since we are 1 based .. how many elements do we need

		// the key to this is to ignore the 0th element of the array
		int[] avg = { 1, 2, 3, 4, 5, 6, 7 };
		q2.calculateAverage(avg);
		
		q2.setValue(4);
		// print first message setting value
		
		q2.setValue(5);
		//print first message setting value
		
		q2.setValue(4);
		// print 2nd message because its already been changed
		
		q2.move(50, 3);
		// print 2nd message
		
		q2.move(30, 4);
		// print 2nd message

	}

	// initialize this entire array to a value... -1


	Question2() {
		array = new int[ARRAY_SIZE + 1];
		Arrays.fill(array, -1);
		System.out.println(Arrays.toString(array));
		

	}
	
	// this will be in an interface
	// and will be the exact same implementation in both classes
	void calculateAverage(int[] arr) {
		float sum = 0;

		// calculate the average
		// print out a message usig System.out.fomat using the average with
		// decimal format this to show 2 places right of the decimal using %.2f
		// include a new line character at the end of the message
		
		for(float i : arr) {
			sum += i;
		}
		
		float average = sum / ARRAY_SIZE;
		
//		System.out.println(sum);
//		System.out.println(average);

		
		//System.out.print("The average is " );
		System.out.format("The average is %.2f%n", average);

	}

	void setValue(int index) {
		// this will be using the class level variable
		// if the value at arr[index] == 1, then print a message saying that you set the
		// value to 1
		// otherwise, print a message saying that it was already changed
		
		if(array[index] != -1) {
			array[index] = 1;
			System.out.println("Set array at index " + index + " equal to 1");
		} else {
			System.out.println("Element at " + index + " already changed");
		}
	}
	
	// this will be an extra function in one of the 2 classes
	void move(int value, int id) {
		// if the value at array[id] == -1 then print a message saying "Value with id : {id} is moved to {value}" and set the value to -1
		// otherwise print a message saying "Value is already 1

		if(array[id] == -1 ) {
			System.out.println("Value with id: " + id + " is moved to " + value);
			value = 1;
			
		} else {
			System.out.println("Value is already 1");
		}
		
	}

}
