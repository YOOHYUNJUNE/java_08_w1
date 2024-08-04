package com.review.car;

public class ECar extends Car {

	private int batteryCapacity;
	
	public ECar() {}

	public ECar(String brand, String model, int year, int batteryCapacity) {
		super(brand, model, year);
		this.batteryCapacity = batteryCapacity;
	}
	
	@Override
	public void printCarInfo() {
		super.printCarInfo();
		System.out.println("배터리용량 : " + batteryCapacity);
	}

	
	@Override
	public String toString() {
		super.toString();
		return "ECar [batteryCapacity=" + batteryCapacity + "]";
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	
	
	
	
}
