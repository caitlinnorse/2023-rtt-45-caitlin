package com.tek.java.day8.ClassExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		// List - ArrayList, LinkedList
		// Set - HashSet
		// Map - HashMap, TreeMap
		
		// Map<Key, Value>
		// This is a map with string as a key and string as a value
		Map<String, String> dictionary = new HashMap<>();
		
		dictionary.put("key", "value");
		dictionary.put("concat", "To add 2 strings together");
		dictionary.put("instantiate", "To create a new object");
		
		
		dictionary.remove("key");
		
		System.out.println(dictionary.get("concat"));
		



		
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
		sintMap.put(4, "four");
		sintMap.put(5, "five");
		sintMap.put(6, "six");



		
		System.out.println(sintMap.get(3));
		sintMap.put(3, "THREE");
		System.out.println(sintMap.get(3));
		
		System.out.println("===================================");

		Set<String> keySet = dictionary.keySet(); //this gives us the keys without the values
		for(String key : keySet) { // then we are looping over the keys
			// printing the key and the value
			//however we have to fetch the value from the map using the key
			System.out.println(key + " = "+ dictionary.get(key)); 
			
		}
		System.out.println("===================================");
		
		
	}

}
