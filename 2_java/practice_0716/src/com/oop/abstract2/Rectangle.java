package com.oop.abstract2;

public class Rectangle extends Shape {

	private double width, height;

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	double calculateArea() {
		super.display();
		return width * height;
	}
	
	@Override
	public void display() {
		System.out.println("이것은 직사각형입니다.");
	}
	
	
	
}
