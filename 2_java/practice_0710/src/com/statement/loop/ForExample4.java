package com.statement.loop;

public class ForExample4 {
	public static void main(String[] args) {
		// 바깥 for는 구구단의 각 단 / 안쪽 for는 각 단의 곱셈 결과
		int max = 9;
		
		for(int i = 2; i <= max; i++) {
			System.out.println(i + "단");
			
			for (int j = 1; j <= max; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println();
		}
		

	}
	
}
