package com.tek.example1;

// camel case with first letter uppercase
// interfaces follow the same naming convention as a class
public class ClassNameFormatting {
	/*
	 * Eclipse has a built in formatting tool All members of the team must have the
	 * tool configured in the same way, otherwise you have a high probability of
	 * merge conflicts, not because the code has changed but because the formatting
	 * has changed.
	 * 
	 * To use the built in formatting tool 
	 * 1) ctrl + ato select the entire file 
	 * 2) ctrl + shift + f to format the file
	 */

	// can never be reassigned
	// constant is all letters uppercase with underscore separating words
	public static final String CONSTANT_VARIABLE_NAME = "Some String constant";

	// all variables are camel case with first letter lowercase
	public String someVariableName;

	// never use _ in a variable name
	public String this_is_not_okay;

	// variable names can never start with a number
	// public String 1string;

	// variables can contain numbers, they cannot start with one
	public String oneString23;

	// function names are same as variable names, however they are functions
	// the curly braces up or down is also determined by the team
	public void functionName() {

	}

	// example of a function with the braces down
	public void functionWithBracesDown() {

	}

	// the difference between a tab and a space is a tab is 4 characters in eclipse
	// however the tab and the space are 2 different characters
	// this one will be determined by the team you work with
	public String spaces = "    ";
	public String tab = "\t";
	
	
	// boolean value set to true
	public boolean BooleanValue = true;
	public int intValue = 55;
	public long longValue = 15032428723407524L;
	
	public Boolean booleanClass = true;
	public Integer intClass = 10;
	
	// a String variable is defined with the ""
	public String utf8 = "¼";
	
	// a char is a single character that is defined with a single quote ''
	// the single quote is also referenced as a tic mark
	
	public char utf8Char = '\u00BC';
	
	
	public int a = 5;
	public int b = 5;
	
	boolean test = (a == b); // true
	
	boolean test1 = (a != b); // false
	
	
	public void logicalOperators() {
		if (a == b && a == 5) {
			// if either condition is false then the code block will not execute
		}
		if ( a == 6 || b == 5) {
			// if one of the conditions is true then the code will execute
		}
		
	}
	
	a = a++;
	
	
	
	
}
