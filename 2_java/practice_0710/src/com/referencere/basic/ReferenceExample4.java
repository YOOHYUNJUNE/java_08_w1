package com.referencere.basic;

public class ReferenceExample4 {
	public static void main(String[] args) {
		String name1 = "유현준";
		String name2 = "유현준";
		String name3 = new String("유현준");
		String name4 = new String("유현준");
		
		System.out.println(name1 == name2); // true
		System.out.println(name1 == name3);
		System.out.println(name1 == name4);
		
		System.out.println(name2 == name3);
		System.out.println(name2 == name4);
		
		System.out.println(name3 == name4); // false
				
		System.out.println("-----------------------");
		
		System.out.println(name1.equals(name2));
		System.out.println(name1.equals(name3));
		System.out.println(name1.equals(name4));
		
		System.out.println(name2.equals(name3));
		System.out.println(name2.equals(name4));
		
		System.out.println(name3.equals(name4));
		
		
	}
}
