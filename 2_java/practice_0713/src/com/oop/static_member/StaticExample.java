package com.oop.static_member;

// 정적 필드
public class StaticExample {
	String instanceField = "Hello";
	
	void instanceMethod() {
		System.out.println("인스턴스 메소드 호출");
		System.out.println("인스턴스 필드 : " + instanceField);
	}
	
	public static void main(String[] args) {
		// 밖에서 선언한 인스턴스 멤버 호출 불가
//		instanceMethod();
		StaticExample se = new StaticExample();
		System.out.println(se.instanceField);
		se.instanceMethod();
		
	}
	
	
}
