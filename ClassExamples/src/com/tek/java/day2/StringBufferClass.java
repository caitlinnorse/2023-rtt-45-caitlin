package com.tek.java.day2;

public class StringBufferClass {
	public static void main(String[] args) {
	    StringBuffer str = new StringBuffer("Java Full Stack Developer");
	    int len = str.length();
	    System.out.println("Length : " + len);
	    int cap = str.capacity();
	    System.out.println("Capacity : " + cap);
// ----- append()--------------------
	    str.append("and Software Eng "); // appends a string in the previously defined string.
	    System.out.println(str);
	    str.append("Java is my favourite language ");
	    str.append("but i love python");
	    System.out.println(str);
// ----------- reverse()----------------------
       StringBuffer stringName = new StringBuffer("Welcome to Per Scholas");
	   System.out.println("Original String: " + stringName);
	   stringName.reverse();
	   System.out.println("Reversed String: " + stringName);
  	}

}
