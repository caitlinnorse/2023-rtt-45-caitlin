package com.tek.java.day8.ClassExamples;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Map<Key, Value>
		// This is a map with string as a key and string as a value
		Map<String, String> strMap = new HashMap<>();
		
		strMap.put("key", "value");
		strMap.put("concat", "To add 2 strings together");
		strMap.put("instantiate", "To create a new object");
		
		System.out.println(strMap.get("concat"));
		



		
		// This is a map with string as a key and integer as a value
		Map<String, Integer> intMap = new HashMap<>();
		
		intMap.put("key", 1);
		intMap.put("one", 1);
		intMap.put("two", 3);
		
		System.out.println(intMap.get("one"));

		
		
		// This is a map with int as a key and string as a value
		Map<Integer, String> sintMap = new HashMap<>();
		
		sintMap.put(1, "one");
		sintMap.put(2, "two");
		sintMap.put(3, "three");
		
		System.out.println(sintMap.get(3));
		sintMap.put(3, "THREE");
		System.out.println(sintMap.get(3));


		


		
	}

}
