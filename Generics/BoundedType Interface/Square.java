package com.prac1;

class Square implements Shape{
	double side;
	public Square (double side) {
		this.side = side;
	}
	
	public double Area() {
		return side*side;
	}
}


