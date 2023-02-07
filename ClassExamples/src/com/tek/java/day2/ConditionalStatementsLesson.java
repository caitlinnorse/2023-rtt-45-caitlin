package com.tek.java.day2;

public class ConditionalStatementsLesson {
	public static void main(String args[]) {
		ConditionalStatementsLesson d2 = new ConditionalStatementsLesson();
		d2.ifStatement();
		
	}
	
	public void ifStatement() {
		int grade = 150;
		
		int a = 1;
		int b = 2;
		
		if (grade > 100) {
			System.out.println("Grade " + grade + "  is invalid");
		} else if (grade >= 90) {
			System.out.println("Grade " + grade + " for the course is an A");
		} else if (grade >= 80){
			System.out.println("Grade " + grade + "  for the course is an B");
		} else if (grade >= 70){
			System.out.println("Grade " + grade + " for the course is an C");
		} else if (grade >= 60){
			System.out.println("Grade " + grade + " for the course is an D");
		} else {
			System.out.println("Grade " + grade + " for the course is an F");
		}
		
		//System.out.println("This is executed after the if statement no matter what");
	}

}
