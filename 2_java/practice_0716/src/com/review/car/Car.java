package com.review.car;

public class Car {

	// protected: 타 패키지라도 상속관계면 호출 가능
	protected String brand, model;
	protected int year;
	
	public Car() {}
	
	private static int carCount = 0;
	
	// final 클래스가 되면 상속 불가
	public Car(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.carCount++;
	}
	
	public static int getCarCount() {
		return carCount;
	}
	
	// final 메소드가 되면, 자식이 오버라이드 불가
	public void printCarInfo() {
		System.out.println("브랜드 : " + brand + "\t모델명 : " + model + "\t연도 : " + year);
	}
	
	
	// object 클래스 
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", year=" + year + "]";
	}

	
	
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}

	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	
	
	
	
	
}
