package com.tek.java.day6.classNotes;

public class Triangle extends Shape {
	
	int base;
	int height;
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public double calculateArea() {
		double area =  (base * height)/2;
		return area;
	}
	
	// we no longer need this method because we changed the parent SHape to have get and set name
//	@Override
//	public String shapeName() {
//		return "Triangle";
//	}

}
