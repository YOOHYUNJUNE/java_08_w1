package com.statement.practice;

public class Practice1 {
	public static void main(String[] args) {
		// 1~20 정수 중 2배수가 아니고 3배수가 아닌 수의 총 합
		// n >= 1 %% n <= 20
		// n % 2 != 0
		// n % 3 != 0
		int a = 0;
		for (int n = 1; n<=20; n++) {
			if ((n % 2 != 0) && (n % 3 != 0)) {
				a += n;
			}
		}
		System.out.println(a);
	}
}
