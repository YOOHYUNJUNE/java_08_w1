package com.reference.list;

public class Listbasic3 {
	public static void main(String[] args) {
		String[] season; // 선언만 하면 메모리에 적용되지 않음
//		season = 			  {"봄", "여름", "가을", "겨울"}; // 오류
		season = new String[] {"봄", "여름", "가을", "겨울"};
		
		// 새 배열을 선언한 것이므로, 배열의 길이 변경 가능
		season = new String[] {"Spring", "Summer", "Autumn", "Summer", "Autumn", "Summer", "Autumn"};

//		System.out.println(season[0]);
//		System.out.println(season[1]);
//		System.out.println(season[2]);
//		System.out.println(season[3]);
//		System.out.println();
		
		for (int i = 0; i < season.length; i++) {
			String A = season[i];
			System.out.print(A + " ");
		
		}
	}
}
