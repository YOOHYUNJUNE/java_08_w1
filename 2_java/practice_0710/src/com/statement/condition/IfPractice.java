package com.statement.condition;

public class IfPractice {
	public static void main(String[] args) {
		// 70 ~ 100 랜덤 숫자 반환
		int score = (int) (Math.random() * 30) + 71;
		System.out.println("점수 : " + score);
		String grade = "F";
		
		// 중첩 if를 이용, 90:A, 80:B, 70:C, 5점 단위로 +등급
		
//		if (score >= 90) {
//			if (score >= 95) {
//				grade = "+A";
//			} else {
//				grade = "A";
//			}
//		} else if 
//			(score >= 80) {
//				if (score >= 85) {
//					grade = "+B";
//				} else {
//					grade = "B";
//				}
//		} else if 
//			(score >= 70) {
//				if (score >= 75) {
//					grade = "+C";
//				} else {
//					grade = "C";
//				}
//			}
//		
		// 간소화
		if (score >= 90) {
			grade = "A";
		} else if 
			(score >= 80) {
			grade = "B";
		} else if 
			(score >= 70) {
			grade = "C";
		}
		if (score % 10 >= 5 && score >= 70) {
			grade += "+";
		}
		
		System.out.println("학점 : " + grade);
	}
}
