package com.reference.list;

public class Listbasic5 {
	public static void main(String[] args) {
		
		String[] menus = {"햄버거", "부대찌개", "떡볶이", "김치찜"};
		// printItems("이름", 배열)
		printItems("점심메뉴", menus);
		
		// 새로 선언
		menus = new String[] { "제육볶음", "스파게티", "치킨", "돈가스", "test01", "test02" };
		printItems("바뀐 메뉴", menus);
		
		// 한 줄로 새로 선언: menus를 안에 넣기
		printItems("저녁 메뉴", new String[] {"자장면", "짬뽕", "볶음밥"}); 
		
	
	}
	
	// 함수 생성
	public static void printItems(String name, String[] strArr) {
		System.out.println(name + " 출력");
		for(int i=0; i<strArr.length; i++) {
			System.out.println("\t" + strArr[i]);
		}
	}
	
	
	
	
	
	
}
