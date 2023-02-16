package com.tek.java.feb16;

import java.util.Arrays;

public class ArrayLibrary {

	public int[] append(int[] arr, int value) {
		int[] copy = new int[arr.length + 1];
		copy[copy.length - 1] = value;
		
		for(int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];
		}
		
			return copy;
		}
	
	public int[] delete(int[] arr, int position) {
//		int[] copy = new int[arr.length - 1];
//		
//		for(int i = 0; i < index; i++) {
//			copy[i] = arr[i];
//		}
//		
//		for(int i = index + 1; i < copy.length; i ++) {
//			copy[i - 1] = arr[i];
//		}
//		return copy;
		
		for(int i = position + 1; i < arr.length; i++) {
			arr[i-1] = arr[i];
		}
		//printArray(arr, "Array shifted left");
		
		int[] copy = new int[arr.length - 1];
		
		for(int i = 0; i < copy.length; i++) {
			copy[i] = arr[i];
		}
		
		return copy;
	}
	
	public int[] insertElement(int[] arr, int position, int value) {
//		// 1- create a new array that is 1 larger than the size of arr <- array library for this?
//		int[] copy = new int[arr.length + 1];
//
//		// 2 - copy all elements from arr into the new copy using a for loop
//		for(int i = 0; i < arr.length; i++) {
//			copy[i] = arr[i];
//		}
//		
		
		// this will
		int[] copy = append(arr, 0);
		
		printArray(copy, "Copy initialized to");

		
		
		// 3 - move all elements in the array starting at position to the end 1 space to the right
		
		for(int i = position; i < arr.length; i++) {
			copy[i + 1] = arr[i];
		}
		
		//printArray(copy, "Copy shifted right");

		//  arr[i + 1] = arr[i]
		// 4 - set arr[position] = number
		
		copy[position] = value;
		//printArray(copy, "New value set");
		
		//System.out.println(Arrays.toString(arr));	
		
		return copy;
	}
	
	public void printArray(int[] arr, String message) {
		System.out.println(message + "\t= " + Arrays.toString(arr));
	}
	
	public int findPositionOfValue(int[] arr, int value) {
		// find the positin of the incoming value
		// if the value is not found, then return -1;
		// return the first element found
		
		int position = -1;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == value) {
				position = i;
				break;
			}
		}
		
		
		return position;
	}
	
	public int[] bubbleSort(int arr[]) {
		// outer loop that will move across the entire array
		// inner loop that will move across the entire array
		// compare element at arr[inner] with arr[inner + 1]
		// if arr[inner] < arr[inner+1] then swap the elements
		// use a temp variable to store one value
		// move the other value 
		// put the temp value into the one you just moved
		// return the array
		
		
		for(int outer = 0; outer < arr.length; outer++) {
			for(int inner = 0; inner < arr.length - 1; inner++) {
				if(arr[inner] < arr[inner + 1]) {
					int temp = arr[inner];
					arr[inner] = arr[inner + 1];
					arr[inner + 1] = temp;
				}
			}
		}
		
		return arr;
	}

}
