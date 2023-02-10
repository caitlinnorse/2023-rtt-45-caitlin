package com.tek.java.day4;

public class Day4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Shape();
		s.printShape();
		System.out.println("Accessubg sgaoe bane statically from shape " + Shape.SHAPE_NAME + " " + s.NOT_STATIC);
		
		//however because our NOT_STATIC member variable is not static we must use an instance of the class
		//Shape.NOT_STATIC // this cannot be done
		System.out.println(s.NOT_STATIC); // this works because s has been created as a new object in memory
		
		// this is calling the static method on the Shape object
		// note that we do not need to use an instance, this is similar to the Arrays class
		Shape.createShape();
		
		Shape.SHAPE_NAME ="XXXXXXXXX";
		// method is private so it is unable to be accessed outside of the class
		// s.shapeSize();
		
		System.out.println("=======================================");
		
		Square sq = new Square();
		sq.printShape(); // this is implemented on the parent shape function
		sq.printSquare(); // this is implemented on the square function
		
		// method is private so it is unable to be accessed outside of the class
		//sq.shapeSize();
		System.out.println("=======================================");

		Circle c = new Circle();
		c.printShape();
		c.printCircle();
		
	}

}
