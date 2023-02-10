package com.tek.java.day4;

public class Square extends Shape {
	// this means that only one variable x is created in memory for the entire JVM
	// this mostly gets used when you are creating a constant
	public static String x = "100";
	
	@Override
	public void printShape() {
		// super means run it in the parent class
		// in this case we are getting all of the functionality in the parent plus
		// the additional functionality in the child square
		super.printShape();
		System.out.println("This is a different implementation for print shape in the square");
		
		SHAPE_NAME = "Square";
		}
	
	public void printSquare() {
		System.out.println("I am a square and my parents name is " + SHAPE_NAME);
		
	}
	
	public void squareSize() {
		// method is private so it is unable to be accessed outside of the class
		//this.shapeSize();
	}

}
