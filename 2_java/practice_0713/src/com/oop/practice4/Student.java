package com.oop.practice4;

public class Student {

	
	// private는 StudentExample에서 사용 불가
	
	String name;
	String id;
	int age;
	

	Student() {}
	
	static int studentCount = 0;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		this.id = generateId();
		studentCount++; // 학생 생성시 마다 적용
	}
	
	// 학생 ID 생성
	private String generateId() {
		// "S" + (1000 + 학생수)
		return "S" + (1000 + getStudentCount());
	}
	
	final void printStudentInfo() {
		System.out.println("학생 정보 : " + name + " " + age + "세, " + id);
	}

	// 학생 수
	public static int getStudentCount() {
		return studentCount;
	}
	
	
	// 학생 이름 변경
	public void setName(String value) {
//		return value; // void -> String으로 할 경우
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
