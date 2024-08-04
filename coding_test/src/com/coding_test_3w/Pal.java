package com.coding_test_3w;

import java.util.Scanner;

public class Pal {
	public static void main(String[] args) {
		
		// 소문자 단어가 팰린드롬인가 : 앞 뒤로 읽을 때 같은 단어 ( level , noon )
		// 팰린드롬 조건: 입력시, 1번째와 -1번째, 2번째와 -2번째....배열? charAt()
		// Pal ? 1 : 0
//		System.out.println("단어를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		String pal = sc.nextLine();
//		String pal = "12354352353321";
		
		int range = pal.length() - 1;

//		// 첫째
//		System.out.println(pal.charAt(0));
//		// 마지막
//		System.out.println(pal.charAt(range));
		
		// 팬린드롬 조건 
		// i = 1 / pal.chartAt(i) = pal.chartAt(range)
		// i = 2 / pal.chartAt(i + 1) = pal.chartAt(range - 1)
		// i = 3 / pal.chartAt(i + 2) = pal.chartAt(range - 2)
		
		// 초기값
		boolean palBool = true; 
		
		for (int i=0; i<pal.length() / 2; i++) {
//			System.out.print(i);
			if (pal.charAt(i) != pal.charAt(range - i)) {
				palBool = false;
			}
		}
		
		int result = palBool ? 1 : 0;
		System.out.println(result);
		
		
		
		
		
	}
}
