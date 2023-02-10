package com.tek.java.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ArraysLearning {
	public static void main (String args[]) {
		ArraysLearning ae = new ArraysLearning();
		//ae.createArray();
		//ae.randomValues(1, 10, 10);
		ae.deleteElement();
		
	}
	
	public void createArray() {
		// notice that we are using a new keyword with the array even tho its primatve
		int[] values = new int[10];
		
		// here we use () to create a new object which is essentially call the constructor of the object
		String str = new String();
		
		// not here when we are creating an array we are not using () because we need to specify the
		// array size using []
		String[] strings = new String[10];
		
		
		strings[0] = "a"; // pos 0
		strings[1] = "b"; // pos 1
		strings[2] = "c"; // pos 2
		strings[9] = "z";
		
		
		System.out.println(strings[2]);
		
		
		// if we do this with a list
		List<String> list = new ArrayList<>();
		
		list.add("a"); // pos 0
		list.add("b"); // pos 1
		list.add("c"); // pos 2
		
		System.out.println(list.get(2));
		
		// creating an array with constants
		int[] constants = {1, 5, 7, 9, 10};
		String[] fileExtensions = {".jpg", ".txt", ".exe"};
		
		// first we look at old for loopon array
		for (int i = 0; i < strings.length; i++) {
			System.out.println("Position " + i + " = " + strings[i]);
		}
		System.out.println("====================================================================");
		
		// we can also do a new for loop on an array
		for(String s : strings) {
			System.out.println(s);
		}
		
		// the length of the array can be defined as a varibale
		int len = 10;
		int[] lenArray = new int[len];
		
	}
	// exercise make this take a 3 parameter input
	// the min random value, the max random value, and the number of elements in the list
	
	public void randomValues(int minVal, int maxVal, int listSize) {
		int[] listArray = new int[listSize];
		
		for (int i = 0; i < listSize; i++) {
			Random random = new Random();
			int randomNum = random.nextInt((maxVal + minVal) + 1) + minVal;
			
			System.out.println(randomNum);
			listArray[i] = randomNum;
		}
			
			
		int maxValue = 0;
		
		for(Integer r : listArray) {
			if(r > maxValue) {
				maxValue = r;
			}
		}
		
		int minValue = listArray[0];
		for(Integer k : listArray) {
			if (k < minValue) {
				minValue = k;
			}
		}
		System.out.println("Max value: " + maxValue);
		System.out.println("Min value: " + minValue);
		System.out.println("List Length: " + listArray.length);
		
	}
	// first we fill our array
	public void deleteElement() {
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		
		System.out.println(Arrays.toString(arr));
		//delete Element2
		arr[2] = 0;
		System.out.println(Arrays.toString(arr));
		for(int i = 3; i < arr.length; i++) {
			arr[i-1] = arr[i];
		}
		
		arr[arr.length - 1] = 0;
		System.out.println(Arrays.toString(arr));
	}
}
