package com.tek.java.day7.ClassExamples;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// the primary use of a string joiner is to create a CAV file
		// a CSV file in which the data is separated by commas or some other delimiter
		
		// first arg is delimiter which will go between each element and separates each element
		// second argument is the starting character
		// the third arg is the end character
		StringJoiner sj1 = new StringJoiner(":", "{", "}");
		StringJoiner sj2 = new StringJoiner(",", "[", "]");

		sj1.add("element1");
		sj1.add("element2");
		sj1.add("element3");
		sj1.add("element4");
		
		System.out.println(sj1.toString());

		
		sj2.add("list1");
		sj2.add("list2");
		sj2.add("list3");
		sj2.add("list4");
		
		System.out.println(sj2.toString());
		
		// by using the merge function it used the delimiter from sj1 for the elements from sj1 and the delimiter from sj2
		// on the elements from sj2 then used the start and end characters from sj1
		System.out.println(sj2.merge(sj1).toString());
		
		System.out.println(sj2.toString());
		System.out.println(sj1.toString());

	}

}
