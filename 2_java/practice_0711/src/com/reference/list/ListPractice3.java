package com.reference.list;


public class ListPractice3 {
	public static void main(String[] args) {
		// 문자열 배열 합
		
		String[] subjects = {"HTML", "CSS", "JavaScript", "Java", "CS"};
		
		// for (향상된)반복 하며, "Java"가 있으면 출력, 없으면 넘어감
		for (String subject : subjects) {
			if(subject.contains("Java")) {
				System.out.println(subject);
			}
//			if(subject.indexOf("Java") < 0) {
//				continue;
//			}
//			System.out.println(subject);
		}
		
		
		
		
	}
}
