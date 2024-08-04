package com.reference.string;

import java.util.Scanner;

public class StringExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("책 제목을 입력");
		String title = sc.nextLine();
		
		if (title.contains("자바") || title.contains("java") || title.contains("Java")) {
			System.out.println("Java 관련 책입니다.");
		} else {
			System.out.println("Java와 관련 없는 책입니다.");
		}
		
	}
}
