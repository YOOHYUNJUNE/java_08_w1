package com.reference.list;

public class ListPractice {
	public static void main(String[] args) {
		String seasonArr[] = {"봄", "여름", "가을", "겨울"};
		seasonArr[0] = "Spring";
		seasonArr[1] = "Summer";
		seasonArr[2] = "Autumn";
		seasonArr[3] = "Winter";

		System.out.println(seasonArr[0]);
		System.out.println(seasonArr[1]);
		System.out.println(seasonArr[2]);
		System.out.println(seasonArr[3]);
		System.out.println();
		
		for (int i = 0; i < seasonArr.length; i++) {
			String season = seasonArr[i];
			System.out.print(season + " ");
		}
	}
}
