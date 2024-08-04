package com.statement.condition;

import java.util.Scanner;

public class SwitchExample3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("등급 입력 : ");
		char grade = sc.nextLine().charAt(0);
		
		switch (grade) {
			case 'A', 'a' -> {
				System.out.println("A");
			}
			case 'B', 'b' -> {
				System.out.println("B");
			}
			case 'C' -> {
				System.out.println("C");
			}
			case 'D' -> {
				System.out.println("D");
			}
			case 'E' -> {
				System.out.println("E");
			}
			case 'F' -> {
				System.out.println("F");
			}
			default ->
				System.out.println("ERROR");
		}
	}
}
