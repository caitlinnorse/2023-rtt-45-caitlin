package com.tek.java.feb16;

public class ArrayLibraryMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayLibrary al = new ArrayLibrary();
		int[] numbers = new int[10];
		
		// 1 - initialize the array with numbers from 1 - 10
		
		// 2 - create a function that will insert a number into the array at a position
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
			//System.out.println(numbers[i]);
		}
		al.printArray(numbers, "Default initialization");
		
		
		numbers = al.insertElement(numbers, 5, 11);	
		
		al.printArray(numbers, "After Element insert");
		
		numbers = al.append(numbers, 12);
		
		al.printArray(numbers, "After append");
		
		numbers = al.delete(numbers, 5);
		al.printArray(numbers, "After Delete");
		
		int position = al.findPositionOfValue(numbers, 11);
		System.out.println("The position at value 11 is: " + position);
		
		numbers = al.bubbleSort(numbers);
		al.printArray(numbers, "After sorting array:");
	}
	
}
