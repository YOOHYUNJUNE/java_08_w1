package com.statement.loop;

public class ContinueExample {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%2 !=0) {
				continue; // break일 경우 i=1에서 종료
			}
			System.out.print(i + " ");
		}
	}
}
