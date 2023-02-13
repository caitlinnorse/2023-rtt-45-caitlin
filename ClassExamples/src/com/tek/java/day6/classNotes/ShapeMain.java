package com.tek.java.day6.classNotes;

import java.util.ArrayList;
import java.util.List;

public class ShapeMain {

	public static void main(String[] args) {
		Square s = new Square();
		s.setHeight(10);
		s.setLength(5);

		Square s1 = new Square();
		s1.setHeight(7);
		s1.setLength(7);
		
		Triangle t = new Triangle();
		t.setBase(5);
		t.setHeight(10);
		
		Triangle t1 = new Triangle();
		t1.setBase(7);
		t1.setHeight(4);
		

		List<Shape> shapes = new ArrayList<>();
		shapes.add(s1);
		shapes.add(t1);
		shapes.add(s);
		shapes.add(t);

		for (Shape shape : shapes) {
			String name = shape.shapeName(); // this is inherited from Shape class
			double area = shape.calculateArea();
			System.out.println("The area of a " + name + " is " + area);
			
			//THis is the if statement was neede when we had AreaCalculation implemented at the Triange and Square level
			// since we moved the AreaCalculation interface to the shape level can run the calculateArea function on the SHape and no longer 
			// need this statement
			/*
			if ( shape instanceof AreaCalculation ) {
				double area = ((AreaCalculation)shape).calculateArea(); // this implmentation is manditory due to the AreaCalculation - this is now defined at the shape level
				System.out.println("The area of a " + name + " is " + area);
			}
			*/
			
		}
	}

}
