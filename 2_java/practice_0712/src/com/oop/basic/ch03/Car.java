package com.oop.basic.ch03;

public class Car {
	String model = "람보르기니";
	int speed;
	boolean start;
	Tire tire = new Tire();
	
	
	// 기본 생성자( 자동 생성)
//	Car() {	
//	}
	
	Car(String m, int sp, boolean st) {
		model = m;
		speed = sp;
		start = st;
	}
	
	
	
	
}
