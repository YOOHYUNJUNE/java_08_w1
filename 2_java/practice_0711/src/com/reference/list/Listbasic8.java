package com.reference.list;

public class Listbasic8 {
	public static void main(String[] args) {
		
		int[] score = {95, 71, 84, 93, 86};

		int sum = 0;
		
//		for(int i=0; i<score.length; i++) {
//			sum += score[i]; // sum에 score가 순서대로 더해짐
//		}
		// 배열의 index 없이 값만 가지고 사용
		for (int s: score) {
			sum += s;
		}
		
		double avg = (double) sum / score.length; // score.length: score의 개수
		
		System.out.println("합계 : " + sum + ", 평균 : " + avg);
		
		
		
		
		
		}
		
}
