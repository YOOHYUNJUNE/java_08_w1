package com.reference.list;

import java.util.Arrays;

public class ListPractice6 {
	public static void main(String[] args) {
		// 1~10까지 랜덤숫자 넣고, 출력, 데이터 합과 평균
		int[] arr = new int[20];
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);	
		}
		System.out.println(Arrays.toString(arr));
				
		for(int s: arr) {
			sum += s;
		}
		System.out.println(sum + ", " + (double) sum/arr.length);
		
		
	}
}
