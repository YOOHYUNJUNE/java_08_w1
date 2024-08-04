package com.oop.basic.practice02;

public class Book {
	
	String bookName;
	int bookPrice;
	double bookDiscountRate;
	
	Book () {}

	public Book(String bookName, int bookPrice, double bookDiscountRate) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
	}
	
	
	double getDiscoutBookPrice() {
		double result = bookPrice * (100 - bookDiscountRate)/100;
//		return Math.round(result * 1) / 1;
		return result;
	} 
	
	
	
	
	
	
}
