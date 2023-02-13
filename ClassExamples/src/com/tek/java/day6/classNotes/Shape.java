package com.tek.java.day6.classNotes;


// the keyword abstract means that this shape class can not be instantiated.
// it must have a child class that extends shape which can then be instantiated
// having the implements AreaCalculation interface here also forces all subclasses to implement the interface methods
public abstract class Shape implements AreaCalculation{
	
	// at this abstract class level we are building any functionality that is common to all shapes
	// in this case we are saying all shapes have a name
	// by putting this functionality here, each shape can have its own individual name
	private String name;
	
	// this method can be overridden by a child class but it is not mandatory
	public void setShapeName(String name) {
		this.name = name;
	}
	
	public String getShapeName() {
		return name;
	}
	
	// this is overriding the toString of Object which is the parent of all classes
	@Override
	public String toString() {
		return "The area of " + getShapeName() + " is " + calculateArea();
	}

}
