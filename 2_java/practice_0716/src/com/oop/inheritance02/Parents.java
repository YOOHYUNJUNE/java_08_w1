package com.oop.inheritance02;

public class Parents {
	
	private String eyeColor = "갈색";

	public String getEyeColor() {
		return eyeColor;
	}
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	
	// 부모의 메소드
	void walk() {
		System.out.println("뒤뚱뒤뚱");
	}
	void eat() {
		System.out.println("냠냠");
	}
	
	
}
