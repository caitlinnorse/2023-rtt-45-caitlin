package com.tek.java.day6.classNotes;

public class Circle extends Shape {
	
	private int radius;
	private static final double PI = 3.14159;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		double area = PI * (radius * radius);
		return area;
	}
	

	@Override
	public String toString() {
		return "The area of " + getShapeName() + " (radius= " + radius + ", and pi= " + PI + ") is " + calculateArea();
		
	}
	
}
