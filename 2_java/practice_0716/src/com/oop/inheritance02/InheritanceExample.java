package com.oop.inheritance02;

public class InheritanceExample {
	public static void main(String[] args) {
		
		Parents p = new Parents();
		System.out.println(p.getEyeColor());
		p.eat();
		p.walk();
		
		// instanceof 연산자
		System.out.println("Parents p는 Parents의 객체다? \t : " + (p instanceof Parents));
		System.out.println("Parents p는 Child의 객체다? \t : " + (p instanceof Child));
		
		System.out.println();
		
		Child c = new Child();
		System.out.println(c.getEyeColor());
		c.eat();
		c.walk();
		c.hello();
		
		// instanceof 연산자
		System.out.println("Child c는 Child의 객체다? \t : " + (c instanceof Child));
		System.out.println("Child c는 Parents의 객체다? \t : " + (c instanceof Parents));

		
		System.out.println();
		
		// 자식이 부모로 promotion
		Parents pc = c;
		System.out.println(pc.getEyeColor());
		pc.eat();
		pc.walk(); // 부모가 되었지만, Override 되어 chlid로 사용
		
//		System.out.println(pc.getJob());
		
		// instanceof 연산자
		System.out.println("Parents pc는 Parents의 객체다? \t : " + (pc instanceof Parents));
		System.out.println("Parents pc는 Child의 객체다? \t : " + (pc instanceof Child));
		
		
		
		System.out.println();
		
		// 강제 타입 변환 casting
//		Child cc = (Child) p; // 부모를 자식으로 변환 : 실행 불가
		Child cc = (Child) pc;
		cc.hello();
		
		
		
		
	
		
		
		
		
	}
}
