package com.tek.java.day4;

public class Day4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Shape();
		s.printShape();
		System.out.println("Accessubg sgaoe bane statically from shape " + Shape.SHAPE_NAME, + " " + s.NOT_STATIC));
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
