package com.mycompany;

import com.hankook.Tire;
//import com.hankook.*; // 해당 패키지 내 클래스 모두 사용 가능

public class Car {

	String brand, model;
	int speed;
	final int MAX_SPEED;
	
	// import 한 Tire
	Tire tire1 = new Tire();
	
	// import 하지 않은 Tire
	com.kumho.Tire tire2 = new com.kumho.Tire();
	
	public Car(String brand, String model, int speed, int MAX_SPEED) {
		this.brand = brand;
		this.model = model;
		this.speed = speed;
		this.MAX_SPEED = MAX_SPEED;
	}
	
	
	
	
	
	
	
}
