package com.oop.basic.ch02;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		System.out.println("내 자동차 모델 : " + myCar.model);
		System.out.println("시동 여부 : " + myCar.start);
		System.out.println("속도 : " + myCar.speed + " km/h");
		System.out.println("타이어의 브랜드 : " + myCar.tire.brand);
		System.out.println(myCar);
		
		System.out.println();
		
		// 시동 켜기
		myCar.start = true;
		myCar.speed = 200;
		System.out.println("시동 여부 : " + myCar.start);
		System.out.println("속도 : " + myCar.speed + " km/h");
		
		System.out.println("--------------------------");
		
		// 메모리 주소는 다름
		Car fatherCar = new Car();
		
		// 모델 변경
		fatherCar.model = "페라리";
		
		System.out.println("아빠 자동차 모델 : " + fatherCar.model);
		System.out.println("아빠차 시동 여부 : " + fatherCar.start);
		System.out.println("아빠차 속도 : " + fatherCar.speed + " km/h");
		System.out.println("아빠차 타이어의 브랜드 : " + fatherCar.tire.brand);
		System.out.println(fatherCar);
		
		
	}
}
