package com.practice.vehicle;

public class Car extends Vehicle {

	private double oil; // 잔여 오일
	private int weight; // 추가 중량
	private int distance; // 거리
	
	public Car() {}
	
	public Car(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
		
	}
	
	// 연료 주입
	public void addOil(int overOil) {
		if ((oil + overOil) <= getOilTankSize()) {
			setOil(oil + overOil);
		}
	}
	
	// 주행에 따른 오일 감소
	public void moving(int distance) {
		setOil(oil - (distance / getEfficiency()));
	}
	
	// 적재 중량
	public void addWeight(int addWeight) {
		if ((addWeight + weight) <= getMaxWeight()) {
			setWeight(weight += addWeight);
		}
	}

	@Override
	public String toString() {
//		super.toString();
//		return "잔여오일=" + oil + ", 적재중량=" + weight + "]";
		return super.toString() + ", 잔여오일=" + oil + ", 적재중량=" + weight;
	}

	public int getOil() {
		return (int) oil;
	}

	public void setOil(int oil) {
		this.oil = oil;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public void setOil(double oil) {
		this.oil = oil;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
