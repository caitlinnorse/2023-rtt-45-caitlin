package com.tek.java.day2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class ClassLearningDay2 {
	public static void main(String args[]) {
		ClassLearningDay2 day2 = new ClassLearningDay2();
		day2.autobox();
		day2.character();
		day2.escapeSequence();
		day2.stringMethods();

	}

	public static void autobox() {
		// for the most part a primitive and a wrapper class are interchangeable with no
		// worries
		// autobox into wrapper class primitive int
		int a = 50;
		Integer i = a;

		// as a primitive, a does not have any functions on it
		// but as the wrapper class it does functions

		i.doubleValue();
		i.longValue();

		// in the past before auto boxing we had to do something like this to conver
		// from into to Integer
		Integer.valueOf(a);

		// the wrapper class allows you to set it to null which means it has no value
		// this can not be done with a primitive : a = null; will not compile
		Integer n = null;

		if (n == null) {
			// do some code
		}
	}

	public void character() {
		// also a primitive that we cannot call functions on
		char d = 'D';

		// use the wrapper
		Character c = 'C';
		System.out.println(c.toLowerCase('Z'));

		System.out.println("The char C is a digit? " + Character.isDigit('C'));
		System.out.println("The char 1 is a digit? " + Character.isDigit('1'));

	}

	public void escapeSequence() {
		System.out.println("This is a string with a \" in it.");
		System.out.println("This is a string with a new line character \n in it.");
		System.out.println("This is a string with a tab \t in it.");
	}

	public void stringsEqual() {
		String a = "abcd";
		String b = "wxyz";

		// For the sake of this course and what we are doing here ALWAYS use the .equals
		// method to compare
		// if 2 strings are the same

		// WARNING doing this incorrectly will produce a bug in your code as it will be
		// correct some times but not others

		if (a == b) {
			// this will always be true because java compares the object instead of the
			// value
			// this is different than how it works with primitives which is compared by
			// value
			// is a String object == to a String object
			System.out.println("This will always be true even tho the values are different");
		}

		if (a.equals(b)) {
			// this will compare the value of a and b and only if the value are equal will
			// it enter this block
			System.out.println("This will evaluate to false because the value of a is not equal to the value of b");
			System.out.println("This block will not execute");
		}
	}

	public void stringMethods() {
		String x = "      asdf    ";
		System.out.println("Before Trim -> " + x);
		System.out.println("After Trim -> " + x.trim());
		System.out.println("Substring -> " + x.substring(6, 10) + " <-");
	}

	public void numberToStringConversion() {
		String str = "123";
		int b = Integer.parseInt(str);

		// this can work because we converted the String to a number and then can do
		// mathematical operations
		int c = b + 5;

		// this cannot work bc str is a String
		// int c = str + 5;

		// this is not bulletproof as this code will cause an exception to be thrown
		Integer.parseInt("abc");
	}

	public void stringBufferExample() {
		// StringBuffer is mutible
		StringBuffer str = new StringBuffer();

		str.append("abc");
		str.append("xyz");
		System.out.println(str);

		// java is not creating a ew string each time
		// this will actually create 3 strings in memory
		// 1 "abc"
		// 2 "xyz"
		// 3 "abcxyz"

		// has to garbage collect 2 items (abx & xyz)
		String x = "abc" + "xyz";
	}
	
	public void formatting () {
		int i = 1024;
		byte b = 127;
		double d = 1.232;
		double tiny = d / 1000000.0;
		boolean bool = true;
		System.out.format(" This is an integer: %d and this is a byte: %d.\r\n", i, b);
		System.out.format(" This is a double: %.4f and this is tiny: %.4e.\r\n", d, tiny);
		System.out.format(" And this is a String: %s", "This is a string.\r\n");
		
		// on the job, using system.prinln is frbidden
		// you will be using a logging framework to write out a specific place
		
		// this notation is on the SBA I think
		// KNOW THIS NOTATION
		// note that when you format to 2  deimal places it rounds as necessary
		// FOR THE KBA YOU WILL NEED TO FORMAT A DECIMAL NUMBER TO 2 PLACES
		System.out.format("This is a double: %.4f and this is tiny %.4e", d, tiny);
		// the difference here is that %/4f which is 4 decimal places and %.2f is 2 decimal places
		System.out.format("This is a double: %.2f and this is tiny %.4e", d, tiny);
		
		double number = 1234567.123;
		String pattern = "###,###,###,###";
		DecimalFormat numberFormat = new DecimalFormat(pattern);
		System.out.println("Using decimal format " + numberFormat.format(number));

	}
	
	// TODO: run this code and try to understand what it is doing
	public void stringJoinerExample() {
		StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter
		// ----Adding values to StringJoiner ----
		joinNames.add("Java");
		joinNames.add("Python");
		joinNames.add("C Sharp");
		joinNames.add("Javascript");

		System.out.println(joinNames);
		
		List<String> lng = new ArrayList<>();
		lng.add("Java");
		lng.add("Python");
		lng.add("C Sharp");
		lng.add("JavaScript");
		
		for(int i = 0; i < lng.size(); i++) {
			System.out.println(lng.get(i));
			if (i < lng.size()- 1) {
				System.out.println(",");
			}
		}
		
		

	}
}
