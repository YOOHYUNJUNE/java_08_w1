package com.practice.mobile;

public class Ltab extends Mobile {
	
	public Ltab() {}
	
	public Ltab(String mobileName, String osType, int batterySize) {
		super(mobileName, osType, batterySize);
	}
	
	int battery;
	

	@Override
	public int operate(int time) {
		setBatterySize(getBatterySize() - 10 * time);
		return getBatterySize();
	}

	@Override
	public int charge(int time) {
		setBatterySize(getBatterySize() + 10 * time);
		return getBatterySize();
	}

	
	
	



}
