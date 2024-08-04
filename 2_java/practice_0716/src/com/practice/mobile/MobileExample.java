package com.practice.mobile;

public class MobileExample {
	public static void main(String[] args) {
		
		Mobile l = new Ltab("갤럭시 탭", "os", 500);
		Mobile o = new Otab("아이패드", "os", 1000);
		
		l.charge(10);
		System.out.println(l.getBatterySize());
		l.operate(5);
		System.out.println(l.getBatterySize());
		
		System.out.println();
		
		o.charge(10);
		System.out.println(o.getBatterySize());
		o.operate(5);
		System.out.println(o.getBatterySize());
		
		
		
	}
	
	
	
}
