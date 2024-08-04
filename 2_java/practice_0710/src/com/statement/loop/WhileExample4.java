package com.statement.loop;

import java.util.Scanner;

public class WhileExample4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int speed = 0;
		
		while(true) {
			System.out.println("---".repeat(8));
			System.out.println("1. 가속 | 2. 감속 | 3. 중지 ");
			System.out.println("---".repeat(8));
			
			System.out.println("선택 : ");
			int num = sc.nextInt();
			
			if (num == 1) {
				System.out.println("현재 속도 = " + ++speed);
			} else if (num == 2) {
				System.out.println("현재 속도 = " + --speed);
			} else if (num == 3) {
				break;
			}
		}
		System.out.println("프로그램 종료");
		
	}
}
