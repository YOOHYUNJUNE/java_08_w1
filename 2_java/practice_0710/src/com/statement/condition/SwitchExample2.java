package com.statement.condition;

import java.util.Scanner;

public class SwitchExample2 {
	public static void main(String[] args) {
		double Random = Math.random();
		char grade = (char) (Random * 10 + 'A');
		
//		System.out.println("등급 입력 : ");
//		Scanner sc = new Scanner(System.in);
//		char grade = sc.nextLine().charAt(0);
		
		System.out.println(Random * 10);
		System.out.println((int) grade);
		System.out.println("등급 : " + grade);
		switch (grade) {
			case 'A' | 'a' :
//			case 'A':
//			case 'a':
				System.out.println("A");
				break;
			case 'B' :
				System.out.println("B");
				break;
			case 'C' :
				System.out.println("C");
				break;
			case 'D' :
				System.out.println("D");
				break;
			case 'E' :
				System.out.println("E");
				break;
			case 'F' :
				System.out.println("F");
				break;
			default:
				System.out.println("ERROR");
		}
	}
}
