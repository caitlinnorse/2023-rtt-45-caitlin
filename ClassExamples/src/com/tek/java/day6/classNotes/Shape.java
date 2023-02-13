package com.tek.java.day6.classNotes;


// the keyword abstract means that this shape class can not be instantiated.
// it must have a child class that extends shape which can then be instantiated
// having the implements AreaCalculation interface here also forces all subclasses to implement the interface methods
public abstract class Shape implements AreaCalculation{
	
	// this method can be overriden by a child calss but it is not madatory
	public String shapeName() {
		return "Shape";
	}

}
