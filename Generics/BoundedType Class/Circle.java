package com.prac1;

//Defining class Circle which will extends class Shape
class Circle extends Shape{
	double radius;
	public Circle (double radius) {
		this.radius = radius;
	}
	
	public double Area() {
		return 3.14*radius*radius;
	}
}

