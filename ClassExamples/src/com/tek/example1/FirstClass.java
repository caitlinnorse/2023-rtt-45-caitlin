package com.tek.example1;

public class FirstClass {
	
	public static void main(String[] args) {
		System.out.println("First java program");
		
		
		// defining an integer
		int i = 5 + 5;
		System.out.println("5 + 5 = " + i);
		
		/* if you wish to make a comment spanning 
		 * multiple lines of code
		 * this is how
		 */
		
		String s = "some text with a \" and a \\ in it";
		System.out.println(s);
		
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

}
