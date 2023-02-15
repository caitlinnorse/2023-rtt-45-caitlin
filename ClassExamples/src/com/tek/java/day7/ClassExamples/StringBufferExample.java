package com.tek.java.day7.ClassExamples;

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer("abcdefghi");
		
		System.out.println(sb);
		
		// arg 1 is the start index
		// arg 2 is the end index
		// arg 3 is what to replace it with
		// really this is doing 2 operations ... first is to delete the characters from position 0 (start index)to 5 (end index)
		// then inserts the characters in the string at position 0 (start index)
		sb.replace(0, 5, "12345");
		
		System.out.println(sb);
		
		// this is one operation that adds the characters at position 0
		sb.insert(0, "ABCD");
		
		System.out.println(sb);
		

	}

}
