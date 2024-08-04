package com.oop.basic.practice04;

import java.util.Arrays;

public class StudentExample {
	public static void main(String[] args) {
		
		Student s1 = new Student("홍길동", 25, 171, 81);
		Student s2 = new Student("한사람", 23, 183, 72);
		Student s3 = new Student("임꺽정", 29, 175, 65);
		
		Student[] sArr = {s1, s2, s3};
		
		double sumAge = 0;
		double sumHeight = 0;
		double sumWeight = 0;
		
		// 배열의 객체 정보 출력
		// 향상된 for
		for (Student s : sArr) {
			System.out.println(s.name + " " + s.age + " " + s.height + " " + s.weigth);
		}
		System.out.println("---------------------------------------------");
		
		
		// 배열의 객체 정보 for문으로 출력
		System.out.println("이름 \t\t 나이 \t\t 신장 \t\t 몸무게");
		for (int i=0; i<sArr.length; i++) {
			Student info = sArr[i];
			System.out.println(info.name + "\t\t  " + info.age + "\t\t " + info.height + "\t\t  " + info.weigth);
			
			sumAge += info.age;
			sumHeight += info.height;
			sumWeight += info.weigth;
		}
		
		System.out.println("나이 평균 : " + Math.round(sumAge/3*100)/100.0);
		System.out.println("신장 평균 : " + Math.round(sumHeight/3*100)/100.0);
		System.out.println("몸무게 평균 : " + Math.round(sumWeight/3*100)/100.0);
	
		
		
		
		
		
		
	}
}
