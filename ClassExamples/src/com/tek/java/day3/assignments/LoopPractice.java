package com.tek.java.day3.assignments;

public class LoopPractice {
	public static void main(String args[]) {
		// exercise 1
		for(int i = 1; i <= 12; i++) {
			System.out.println(i + " ");
			for(int j = 1; j <= 12; j++) {
				System.out.print(j * i + " ");
			}
		}
	}

}
