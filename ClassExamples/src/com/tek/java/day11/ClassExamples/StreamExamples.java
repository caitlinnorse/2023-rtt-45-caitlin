package com.tek.java.day11.ClassExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<String>();
		names.add("Larry");
		names.add("Steven");
		names.add("Eric");
		names.add("Conan");
		names.add("Ellen");
		
		// 1) sort the original names list by length of String
		Collections.sort(names, Comparator.comparingInt(String::length));
		System.out.println(String.join("\n", names));
		
		System.out.println();
		
		// 2) when the length is the same, then sort secondary alphabetically
		
		names.sort(Comparator.comparingInt(String::length).thenComparing(String::toString));

		System.out.println(String.join("\n", names));
		
		System.out.println();
		
		//forwards
		List<String> sortedList = names.stream().sorted().collect(Collectors.toList());
		
		//backwards
		List<String> sortedList2 = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		
		System.out.println(String.join("\n", sortedList));
		
		System.out.println();
		
		System.out.println(String.join("\n", sortedList2));
		
		System.out.println();

		
		// remove all names from the list that contain n
		sortedList.removeIf(name -> name.contains("n"));
		System.out.println(String.join("\n", sortedList));
		
		

		
		
		
		
	}

}
