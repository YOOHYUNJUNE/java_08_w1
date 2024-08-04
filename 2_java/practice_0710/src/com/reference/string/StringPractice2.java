package com.reference.string;

import java.util.Scanner;

public class StringPractice2 {
	public static void main(String[] args) {
		// Scanner로 주민번호를 입력받음 990101-1010100
		// 자리수가 맞지 않으면, 계속 입력 받음
		// 자리수가 맞으면, 태어난 월이 3~5면 "봄", 6~8이면 "여름"... 성별도 출력
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("주민번호를 입력하세요.");
			String num = sc.nextLine();
			
			if(num.length() == 14) {
				int month = Integer.parseInt(num.substring(2,4));
				int gender = Integer.parseInt(num.substring(7,8));
				// char gender = num.charAt(7);
				
				
				System.out.println("주민번호 : " + num);
				
				// 나이 계산
				int year = Integer.parseInt(num.substring(0,2));
				int birthYear;
				if(year <= 24) {
					birthYear = 2000 + year;
				} else {
					birthYear = 1900 + year;
				}
				int age = 2024 - birthYear;
				System.out.println(age + "세");
//				String resultYear = Integer.parseInt(year) <= 24 ? "20" + year : "19" + year;
				
				// 태어난 개월
				if(month >= 3 && month <= 5) {
					System.out.println("[봄]에 태어남");
				} else if (month >= 6 && month <= 8) {
					System.out.println("[여름]에 태어남");
				} else if (month >= 9 && month <= 11) {
					System.out.println("[가을]에 태어남");
				} else if (month <= 12) {
					System.out.println("[겨울]에 태어남");
				} else {
					System.out.println("개월을 바르게 입력하세요.");
					continue;
				}
				
				// switch문 변경
				String resultWeather = switch (month) {
					case 3, 4, 5 -> "봄";
					case 6, 7, 8 -> "여름";
					case 9, 10, 11 -> "가을";
					case 12, 1, 2 -> "겨울";
					default -> "에러";
				};
				
				
				
				// gender % 2 == 0 ? "여자" : "남자"
				
//				char gender = num.charAt(7);
//				String resultYear = gender <= '3' ? "20" + year : "19" + year;
				
				if(gender == 1) {
					System.out.println("남자");
				} else if (gender == 2) {
					System.out.println("여자");
				} else {
					System.out.println("성별을 바르게 입력하세요.");
					continue;
				}
				break;
				
			} else {
				System.out.println("14자리를 입력하세요.");
				continue;
			}
			
		}
		
		
		
			
	}
		
}

