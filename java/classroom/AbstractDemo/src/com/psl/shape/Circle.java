package com.psl.shape;

public class Circle extends Shape{

	int r;
	public Circle(int r) {
		// TODO Auto-generated constructor stub
		this.r=r;
	}
	@Override
	void calculateArea() {
		// TODO Auto-generated method stub
		float area=3.14f*r*r;
		System.out.println("Area of circle: "+area);
	}

}
