package com.practice.vehicle;

public class Truck extends Car {

	
	public Truck(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
	}
	

	
	// 거리를 연비로 나눠 오일 소모량 추출
	int distance;
	public double calcOil(int distance) {
		return distance / getEfficiency();
	}
	
	// calcOil호출해, 사용 1L 당 3000원
	public int getCost(int distance) {
		double oil = calcOil(distance);
		return (int) (oil * 3000);
	}

	@Override
	// calcOil호출해, 잔여 오일 -= 오일 감소
	public void moving(int move) {
		double oil = calcOil(move);
		setOil(getOil() - oil);
	}
	

	@Override
	public String toString() {
		return super.toString() + ", 연비=" + getEfficiency();
	}


	@Override
	// 적재량 5kg당 연비 0.2km 감소
	public double getEfficiency() {
		return super.getEfficiency() - ((getWeight() / 5) * 0.2) ;
	}
	
	
	
	
	
	
	
	
}
