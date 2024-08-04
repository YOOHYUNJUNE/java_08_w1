package com.statement.condition;

public class SwitchExample {
	public static void main(String[] args) {
		String id = "990101-1012345";
//		int genderNum = Integer.parseInt(id.substring(7, 8)); // 7~8번째 수를 가져옴
		int genderNum = id.charAt(7) - 0; // 정수 변환
		
		switch (genderNum % 2) {
			case 0 : 
				System.out.println("여성"); 
				break; // 종료
			case 1 : 
				System.out.println("남성");
				break;
		}
	}
}
