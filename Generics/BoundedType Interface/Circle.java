package com.prac1;

class Circle implements Shape{
	double radius;
	public Circle (double radius) {
		this.radius = radius;
	}
	
	public double Area() {
		return 3.14*radius*radius;
	}
}
