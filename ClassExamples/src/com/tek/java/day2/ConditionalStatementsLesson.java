package com.tek.java.day2;

public class ConditionalStatementsLesson {
	public static void main(String args[]) {
		ConditionalStatementsLesson d2 = new ConditionalStatementsLesson();
		d2.ifStatement();
		d2.caseStatement();
		
	}
	
	public void caseStatement() {
		int grade = 2;
		

		// only use case to check a specific value
		switch(grade) {
		case 1: System.out.println("Selection = 1");
			break;
		case 2: System.out.println("Selection = 2");
			break;
		case 3: System.out.println("Selection = 3");
			break;

		}

		
		
	}
	
	public void ifStatement() {
		int grade = 15;
		
		int a = 1;
		int b = 2;
		
// !!!!!!!!!!!!!!!!!!!!!!! YOU MUST ALWAYS HAVE {} FOR THE CODE BLOCK AFTER THE IF STATEMENT
		
		if (grade > 100 || grade < 0) {
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
	// do this one without looking at answer
	public void leapYear() {
		
	}

}
