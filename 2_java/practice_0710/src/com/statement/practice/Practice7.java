package com.statement.practice;

import java.util.Scanner;

public class Practice7 {
	public static void main(String[] args) {
		// 1부터 Scanner 입력값 까지의 정수 합
		// 0과 음수일때는 다시 입력
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		
		while(true) {
			System.out.println("값을 입력해주세요.");
			num = sc.nextInt();
			if (num <= 0) {
				System.out.println("자연수만 입력해주세요.");
			} else {
				for(int i=1; i<=num; i++) {
					sum += i;
				}
			}
			break;

		}
		System.out.println(sum);
		

	}
}
