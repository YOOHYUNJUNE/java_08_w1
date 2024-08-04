package com.reference.list;

public class Listbasic6 {
	public static void main(String[] args) {
		// 다차원 배열: 배열 안 배열
		
//		int[] arr1 = {0,0,0};
		int[] arr1 = new int[3]; // [2]가 아니라 [3]
		int[] arr2 = {1,2,3};
		int[] arr3 = {4,5,6};
	
		// 2차원 배열: 차원 수 만큼 [ ]
		int[][] arr4 = {arr1, arr2, arr3};
		System.out.println(arr4[2][2]);
		
		int[][] arr5 = { new int[3], {1,2,3}, {4,5,6} };
		System.out.println(arr5[2][2]);
		
		// { {0,0}, {0,0}, {0,0}, {0,0} }
		int[][] arr6 = new int[4][2];
		
		// { {0,0,0}, {0,0}, {0,0,0} }
		int[][] arr7 = new int[3][];
		arr7[0] = new int[3];
		arr7[1] = new int[2];
		arr7[2] = new int[3];
		
		System.out.println(arr7[0][2]);
		
		
		
	}
	
	
}
