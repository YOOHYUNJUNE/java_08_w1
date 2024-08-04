package com.practice.vehicle;

public class VehicleTest {
	public static void main(String[] args) {
		
		Truck car = new Truck(1000, 100, 5);
		
		System.out.println("트럭 기본 정보");
		System.out.println(car.toString());		
		
		System.out.println();
		System.out.println("주유, 적재, 주행 후");
		
		// 주유
		System.out.println("주유합니다.");
		car.addOil(50);
		System.out.println(car.toString());
		System.out.println();
		
		// 주행
		car.moving(50);
		System.out.println(car.toString());
		System.out.println();
		
		// 적재
		car.addWeight(100);
		car.getEfficiency();
		// 연비 계산
		System.out.println(car.toString());
		System.out.println();
		
		// 이동 후 금액
		car.moving(30);
		System.out.println(car.toString());
		System.out.println(car.getCost(30));

		
		
		
		
		
	}
}
