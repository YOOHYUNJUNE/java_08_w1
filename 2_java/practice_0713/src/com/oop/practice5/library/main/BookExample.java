package com.oop.practice5.library.main;

import com.oop.practice5.library.book.Book;
import com.oop.practice5.library.book.EBook;

public class BookExample {
	public static void main(String[] args) {
		// Book
		// 제목, 저자, ISBN (string)
		// 정적 멤버 변수로 총 도서수 관리
		Book book1 = new Book("삼국지", "이문열", "1234567890");
		Book book2 = new Book("갈매기의 꿈", "리처드바크", "0987654321");
		
		// EBook
		// 파일 크기 포함 (double)
		// Book 상속, 오버라이딩
		EBook ebook1 = new EBook("소설과 구보씨의 일일", "최인훈", "1122334455", 1.5);
		
		// 정보 출력
		book1.printBookInfo();
		book2.printBookInfo();
		ebook1.printBookInfo();
		
		// 총 도서 수 출력
		System.out.println("총 도서 수 : " + Book.getBookCount() + " 권");
		
		
		
	}
}
