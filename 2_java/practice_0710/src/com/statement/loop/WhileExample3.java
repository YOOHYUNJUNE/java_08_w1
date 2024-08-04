package com.statement.loop;

import java.util.Scanner;

public class WhileExample3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int speed = 0;
		
		while(run) {
			System.out.println("---".repeat(8));
			System.out.println("1. 가속 | 2. 감속 | 3. 중지 ");
			System.out.println("---".repeat(8));
			
			System.out.println("선택 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 : System.out.println("현재 속도 = " + ++speed); break;
			case 2 : System.out.println("현재 속도 = " + --speed); break;
			case 3 : run = false;
			}
			System.out.println("프로그램 종료");
		}
		
	}
}
