package com.statement.practice;

public class Practice6 {
	public static void main(String[] args) {
		for (int i=1; i<=100; i++) {
			System.out.print(i);
			if (i % 3 == 0) {
				System.out.print(" three");
			} if (i % 5 == 0) {
				System.out.print(" five");
			} if (i % 7 == 0) {
				System.out.print(" seven");
			}
			System.out.println();
		}
	}
}





