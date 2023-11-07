package com.prac1;

public class Main{
	public static void main(String args[]) {
		Circle circle = new Circle(25.0);
		Square square = new Square(10.0);
		
		BoundedShape<Circle>boundedCircle = new BoundedShape<>(circle);
		BoundedShape<Square>boundedSquare = new BoundedShape<>(square);
		
		System.out.println("Area of Circle is : " + boundedCircle.Area());
		System.out.println("Area of Square is : " + boundedSquare.Area());
	}
}
