package com.tek.java.day4;

public class Shape {
	// this means that only one variable x is created in memory for the entire JVM
	// this mostly gets used when you are creating a constant
	public static String SHAPE_NAME = "Shape";
	public String NOT_STATIC = "not static";
	
	public void printShape() {
		System.out.println("I am a shape.");
	}
	
	private void shapeSize() {
		System.out.println("Size of the shape");
	}

}
