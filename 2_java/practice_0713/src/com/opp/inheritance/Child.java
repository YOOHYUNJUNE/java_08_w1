package com.opp.inheritance;

public class Child extends Parents {
	String job = "개발자";
	
	void hello() {
		System.out.println("안녕하세요!");
	}
	
	
	// 오버라이딩 (재정의)
	@Override
	void walk() {
		System.out.println("뚜벅뚜벅");
	}
	
}
