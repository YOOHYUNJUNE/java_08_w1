package com.referencere.basic;

public class ReferenceExample5 {
	public static void main(String[] args) {
		String name1 = "유현준";
		String name2 = "유현준";
		
		if (name1 == name2) {
			System.out.println("name1과 name2는 참조가 [같음]"); //
		} else {
			System.out.println("name1과 name2는 참조가 [다름]");
		}
		
		
		String name3 = new String("유현준");
		String name4 = new String("유현준");
		
		if (name3 == name4) {
			System.out.println("name3과 name4는 참조가 [같음]");
		} else {
			System.out.println("name3과 name4는 참조가 [다름]"); //
		}
		
		
		if (name1.equals(name4)) {
			System.out.println("name1과 name4는 문자열이 같음");
		}
				
		
		
	}
}
