package com.oop.access;

public class CarExample {
	public static void main(String[] args) {
		
		Car myCar = new Car("나의 차");
		myCar.info();
		
//		myCar.speed = -100; // 차의 속도는 음수가 될 수없음 : 무결성 위배
		myCar.setSpeed(200);
		myCar.info();
		
		System.out.println(5 * myCar.getSpeed()); // private인 speed를 호출 가능
				
	}
}
