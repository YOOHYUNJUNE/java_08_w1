package com.enumeration;

import java.util.Calendar;

public class EnumExample2 {
	public static void main(String[] args) {
		// 내장된 캘린더 가져오기 
		
		Calendar now = Calendar.getInstance(); 
		
		int week = now.get(Calendar.DAY_OF_WEEK); // 요일: 1 = 일요일
		
//		int year = now.get(Calendar.YEAR);
//		int month = now.get(Calendar.MONTH); // 0부터 시작함
//		int day = now.get(Calendar.DAY_OF_MONTH);
//		int hour = now.get(Calendar.HOUR_OF_DAY);
//		int minute = now.get(Calendar.MINUTE);
//		int second = now.get(Calendar.SECOND);

		Week todayWeek = null;
		
//		switch(week) {
//			case 1 -> todayWeek = Week.SUNDAY;
//			case 2 -> todayWeek = Week.MONDAY;
//			case 3 -> todayWeek = Week.TUESDAY;
//			case 4 -> todayWeek = Week.WEDNESDAY;
//			case 5 -> todayWeek = Week.THURSDAY;
//			case 6 -> todayWeek = Week.FRIDAY;
//			case 7 -> todayWeek = Week.SATURDAY;
//		}
		
		todayWeek = switch(week) {
		case 1 -> Week.SUNDAY;
		case 2 -> Week.MONDAY;
		case 3 -> Week.TUESDAY;
		case 4 -> Week.WEDNESDAY;
		case 5 -> Week.THURSDAY;
		case 6 -> Week.FRIDAY;
		case 7 -> Week.SATURDAY;
		default -> null;
	};
		
//		if (todayWeek.equals("THURSDAY")) {
		if (todayWeek == Week.THURSDAY) {
			System.out.println("목요일");
		}
		
		
		if (todayWeek == Week.SUNDAY) {
			System.out.println("쉬는 날");
		} else {
			System.out.println("공부하는 날");
		}
		
		
		
	}
}
