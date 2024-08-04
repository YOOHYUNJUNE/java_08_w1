package com.oop.basic.practice03;

public class Account {

	String account;
	int balance;
	double interestRate;
	
	Account() {}

	public Account(String account, int balance, double interestRate) {
		this.account = account; // 계좌번호
		this.balance = balance; // 잔액
		this.interestRate = interestRate; // 이율
	}
	
	// 지급할 이자
	double calculateInterest() {
		return balance * interestRate/100;
	} 
	
	
	// 입금
	void deposit(int money) {
		balance += money;
		System.out.println(money + "원을 입금합니다.");
	}
	

	// 출금액이 잔액보다 클 경우 오류
	void withdraw(int money) {
		if (money > balance) {
			System.out.println(money + "원을 출금합니다. 잔액이 부족합니다.");
		} else {
			balance -= money;
			System.out.println(money + "원을 출금합니다. 이자 : " + calculateInterest());
		}
	}
	
	
	
	
	
	
}
