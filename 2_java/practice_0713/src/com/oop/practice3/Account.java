package com.oop.practice3;

public class Account {
	
	int balance;
	final int MIN_BALANCE = 0;
	final int MAX_BALANCE = 1_000_000;
	
	public Account(int balance) {
//		this.balance = balance;
		setBalance(balance);
	}
	
	
	private void setBalance(int balance) {
		if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
		}
//		this.balance = balance >= MIN_BALANCE && balance <= MAX_BALANCE ? balance : 10000;
	}
	
	private int getBalance() {
		return balance;
	}
	
	
	
	public void info() {
		System.out.println("현재 잔고 : " + this.getBalance() + " 원 입니다.");
	}
	
	// 입금
	public void deposit(int money) {
		if (balance > MAX_BALANCE && money < MIN_BALANCE) {
//		if (money >= MIN_BALANCE) { 
//			setBalance(balance+money); // 이미 setBalance에서 조건을 달아놨기 때문에 사용 가능
			System.out.println("최대 금액 초과로 입금할 수 없습니다.");
		} else {
			balance += money;
			System.out.println(money + "원 입금되었습니다. 현재 잔고 " + balance + " 원 입니다.");
		}
	}
	
	// 출금
	public void withdraw(int money) {
		if (balance - money < MIN_BALANCE && money > balance) {
//		if (money >= MIN_BALANCE) {
//			setBalance(balance-money);
			System.out.println("잔고를 초과해서 출금할 수 없습니다.");
			setBalance(balance-money); // 이미 setBalance에서 조건을 달아놨기 때문에 사용 가능
		} else {
			balance -= money;
			System.out.println("출금되었습니다. 현재 잔고 " + balance + " 원 입니다.");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
