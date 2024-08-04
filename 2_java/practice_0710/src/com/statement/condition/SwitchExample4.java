package com.statement.condition;

import java.util.Scanner;

public class SwitchExample4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("등급 입력 : ");
		char grade = sc.nextLine().charAt(0);
		
		int score = switch (grade) {
			case 'A', 'a' -> 100;
			case 'B', 'b' -> 90;
			case 'C', 'c' -> 80;
			case 'D', 'd' -> 70;
			case 'E', 'e' -> {
				yield 60;
			}
			default -> {
				yield 0;
			}
		};
		System.out.println(score);
	}
}
