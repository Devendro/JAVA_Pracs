package com.prac1;

class BoundedShape <T extends Shape>{
	T shape;
	
	public BoundedShape (T shape) {
		this.shape = shape;
	}
	
	public double Area() {
		return shape.Area();
	}
}
