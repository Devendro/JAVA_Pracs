package com.prac1;

class Square extends Shape{
	double side;
	public Square (double side) {
		this.side = side;
	}
	
	public double Area() {
		return side*side;
	}
}

