package com.tek.java.sba;

import java.util.ArrayList;
import java.util.List;

public class Question1 {
	
	// ********************** WHEN MAKING A NEW CLASS IN HACKER RANK DO NOT USE ANY ACCESS MODIFIER **************
	// **************** MAKE SURE YOUR OUTPUT IS EXACT *********************

	// (x == null) is true
	// (x.equals("") ) will throw a NullPointerExcetion
	// (y.equals("") ) is true
	// (y == null) is false
	
	// has an interface
	public static void main(String[] args) {
		String[] arr = {"zero", "one", "two", "three", "four", "five"};
		Question1 q1 = new Question1();
		q1.convert(arr);

		q1.replace(2);
		// I have replaced two with the empty string
		q1.replace(4);
		// i have replaced 4 with the empty string4

		List<String> compacted = q1.compact();
		
		System.out.println(compacted);
		// print compacted and should produce
		// zero , one, three, five

	}

	private ArrayList<String> list;

	public Question1() {
		// in the constructor create a new arraylist
	}

	// Know how to convert an array of strings to a list of strings
	public void convert(String[] a) {
		// add the elements in the string array to the list of strings
		list = new ArrayList<>();
		
		for (String s : a) {
			list.add(s);
		}
	}

	public void replace(int idx) {
		// in an ArrayList write the value at idx to be an empty string
		// print a message saying what the value of the position in the list is and the
		// value you are overriding it with
		String temp = list.get(idx);
		 list.set(idx, "");
		 System.out.println("The value " + temp + " is being replaced with " + list.get(idx));

	}

	public ArrayList<String> compact() {
		// remove all values in the arrayList that are empty
		for(int i = list.size() - 1; i >= 0; i--) {
			if(list.get(i).isEmpty()) {
				list.remove(i);
			}
		}
		return list;
	}

}
