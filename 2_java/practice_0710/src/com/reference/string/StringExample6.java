package com.reference.string;

public class StringExample6 {
	public static void main(String[] args) {
		String rainbow = "빨,주,노,초,파,남,보";
		String[] rainbowArr = rainbow.split(",");
		
//		System.out.println(rainbowArr[0]);
		
		for (int i=0; i<7; i++) {
			System.out.print(rainbowArr[i]);
		}
		
		
	}
}
