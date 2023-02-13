package com.tek.java.day6.classNotes;

public class Square extends Shape {
	
	private int length;
	private int height;
	
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	// this is the implementation of the AreaCalculation
	@Override 
	public double calculateArea() {
		double area = length * height;
		return area;
	}
	// this method overrides the toString function of Object which is the
	// parent of all objects in Java. It is ther automatically and you do not need to do anything to use it
	@Override
	public String toString() {
		return "The area of " + getShapeName() + " (length= " + length + ", and height= " + height + ") is " + calculateArea();
		
	}
	
	
//	@Override
//	public String shapeName() {
//		return "Square";
//	}


}
