package com.oop.practice;

public class MemberExample {
	public static void main(String[] args) {
		
		MemberService ms = new MemberService();
		
		boolean result = ms.login("hong", "12345"); // true, false
		if (result) {
			System.out.println("로그인되었습니다.");
			ms.logout("hong");
		} else {
			System.out.println("id 또는 password가 정확하지 않습니다.");
		}
		
		
	}
	
}
