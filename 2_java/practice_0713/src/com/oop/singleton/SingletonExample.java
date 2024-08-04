package com.oop.singleton;

import java.util.Calendar;

public class SingletonExample {
	public static void main(String[] args) {
		
		// 
		Singleton st1 = Singleton.getInstance();
		Singleton st2 = Singleton.getInstance();

		System.out.println(st1 == st2);
		
//		Calendar.getInstance(); // 싱글톤과 같은 방식
		
		
	}
}
