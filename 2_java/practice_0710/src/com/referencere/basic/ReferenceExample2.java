package com.referencere.basic;

public class ReferenceExample2 {
	public static void main(String[] args) {
		int[] arr1;
		int[] arr2;
		int[] arr3;
		int[] arr4 = {1, 2, 3};
		
		arr1 = new int[] {1, 2, 3};
		arr2 = new int[] {1, 2, 3};
		arr3 = arr2;
		
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
		System.out.println(arr4);
		
		System.out.println("---------------------------");
		
		System.out.println(arr1 == arr2);
		System.out.println(arr1 == arr3);
		System.out.println(arr1 == arr4);
		
		System.out.println(arr2 == arr3); // true
		System.out.println(arr2 == arr4);
		
		System.out.println(arr3 == arr4);
		
		System.out.println("---------------------------");
		
		System.out.println(arr1.equals(arr2));
		System.out.println(arr1.equals(arr3));
		System.out.println(arr1.equals(arr4));
		
		System.out.println(arr2.equals(arr3)); // true
		System.out.println(arr2.equals(arr4));
		
		System.out.println(arr3.equals(arr4));
	}
}
