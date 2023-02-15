package com.tek.java.day8.ClassExamples.SortingExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingExample {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(13);
		numbers.add(7);
		numbers.add(18);
		numbers.add(5);
		numbers.add(2);
		
		System.out.println("Before: " + numbers);
		
		//this is using a static utility method on the Collections object - collections is a set of tools
		//Arrays.sort()
		Collections.sort(numbers);
		System.out.println("After: " + numbers);
		
		//this is using the sort function on the array list itself
		// what we are doing is pasing in a comparator  a comparator implements a custom sort
		numbers.sort(Comparator.reverseOrder());
		System.out.println("Reverse: " + numbers);
	}
	
	class NumberComparator<Integer> implements Comparator<Integer> {
		
		// comparator returns 3 values
		// if 01 < o2 then return -1
		// if o1 == o2 then return 0
		// if o1 > o2 return 1
		@Override 
		public int compare(Integer o1, Integer o2) {
			return 0;
		}
	}

}
