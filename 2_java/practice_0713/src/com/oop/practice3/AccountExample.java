package com.oop.practice3;

public class AccountExample {
	public static void main(String[] args) {
		Account acc = new Account(10000);
		
//		acc.setBalance(10000);
//		System.out.println("잔고 : " + acc.getBalance());
//		
//		acc.setBalance(-100);
//		System.out.println("잔고 : " + acc.getBalance());
		
		
		acc.info(); // 현재 잔고 출력
		acc.deposit(200);
		acc.withdraw(10000);
		
		acc.info();
		
		
	}
}
