package com.statement.loop;

public class ForExample {
	public static void main(String[] args) {
//		System.out.println("안녕하세요."); // Ctrl + Alt + 방향키 : 복붙
//		System.out.println("안녕하세요."); // Ctrl + Alt + 방향키 : 복붙
		
//		for (int i = 0; i < 10; i++) {
//			System.out.println("i = " + i);
//			System.out.println("안녕하세요."); // i가 10보다 작으면 true이므로, print출력, i++
//		}
//		
//		for (int i = 10; i > 0; i--) {
//			System.out.println("i = " + i);
//			System.out.println("TEST");
//		}
		
		
		// 45 ~ 99 합계 // (45+99)*(99-45+1)/2
		int sum = 0;
		for (int i = 45; i <= 99; i++) {
			sum += i;
		}
		System.out.println(sum);
			
		
		
		
		
	}
}
