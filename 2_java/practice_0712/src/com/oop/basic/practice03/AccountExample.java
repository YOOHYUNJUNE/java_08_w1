package com.oop.basic.practice03;

public class AccountExample {
	public static void main(String[] args) {
		
		Account a = new Account("145-1234-5678", 500_000, 5);
		
		// 초기 정보
		System.out.println("계좌정보 : " + a.account + "\t\t잔액 : " + a.balance);
		System.out.println("-----------------------------------");
		
		// 출금할 금액 1
		a.withdraw(600_000);
		System.out.println("계좌정보 : " + a.account + "\t\t잔액 : " + a.balance);
		System.out.println("-----------------------------------");

		// 출금할 금액 2
		a.withdraw(400_000);
		System.out.println("계좌정보 : " + a.account + "\t\t잔액 : " + a.balance);
		System.out.println("-----------------------------------");

		// 입금할 금앢
		a.deposit(330_000);
		System.out.println("계좌정보 : " + a.account + "\t\t잔액 : " + a.balance);
		
		
	}
}
