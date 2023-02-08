package com.tek.java.day3.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoopPractice {
	public static void main(String args[]) {
		// exercise 1
		System.out.println("Exercise 1");
		for(int i = 1; i <= 12; i++) {
			System.out.println(i + " ");
			for(int j = 1; j <= 12; j++) {
				System.out.print(j * i + " ");
			}
		}
		
		// exercise 2
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		List<Integer> intList = new ArrayList<>();
		
		for(int k = 1; k <= n1 || k <= n2; k++) {
			int temp = 0;
			if (n1 % k == 0 && n2 % k == 0) {
				temp = k;
				intList.add(temp);
			}
			intList.sort(null);
		}
	}

}
