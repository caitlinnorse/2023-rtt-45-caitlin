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
	
//	@Override
//	public String shapeName() {
//		return "Square";
//	}


}
