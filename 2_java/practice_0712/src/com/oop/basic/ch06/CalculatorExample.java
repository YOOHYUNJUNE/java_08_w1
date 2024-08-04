package com.oop.basic.ch06;

public class CalculatorExample {
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
//		calc.powerOff();
		calc.powerOn();
		
		int plusResult = calc.plus(5, 6);
		System.out.println("덧셈 결과 : " + plusResult);
		
		int x = 10;
		int y = 4;
		double divideResult = calc.divide(x, y);
		System.out.println("나눗셈 결과 : " + divideResult);
		
		int minusResult = calc.minus(10, 30);
		System.out.println("뺄셈 결과 : " + minusResult);
		
		int multipleResult = calc.muliple(20, 12);
		System.out.println("곱셈 결과 : " + multipleResult);
		
		
//		int sumResult = calc.sum(1,2,3,4,5,6,6,8);
		int sumResult = calc.sum(new int[] {1,2,3,4,5,5,6,8});
		System.out.println("결과 : " + sumResult);
		
		double sumResult2 = calc.sum(new double[] {0.434343, 0.421421, 0.42134213, 0.4234213});
		System.out.println("결과 : " + sumResult2);
	
//		calc.powerOn();
		calc.powerOff();
		
		
	}
}
