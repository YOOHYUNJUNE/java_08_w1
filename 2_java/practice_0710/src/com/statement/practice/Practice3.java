package com.statement.practice;

public class Practice3 {
	public static void main(String[] args) {
		// 주사위 2개 던졌을 때 합이 6이 되는 경우의 수를 출력
		// d1 = 1~6 / d2 = 1~6 / d1 + d2 = 6
		for (int d1=1; d1<=6; d1++) {
			for (int d2=1; d2<=6; d2++) {
				if (d1+d2 == 6) {
					System.out.println(d1 + "+" + d2 + "=" + (d1+d2));
					break;
				}
			}
		}
		
	}
}
