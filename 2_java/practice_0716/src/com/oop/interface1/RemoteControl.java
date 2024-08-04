package com.oop.interface1;

public interface RemoteControl {

	// 추상 메소드
	void turnOn(); // public abstract 생략
	void turnOff();
	void setVolume(int volume);
	
	
	// 공용 정적 상수 필드도 들어올 수 있음
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0; // public static final 이 생략되어 있음
	
	// 정적 메소드 : public, private
	/* public */ static void changeBattery() {
		staticMethod();
		System.out.println("건전지를 교환합니다.");
	}
	
	private static void staticMethod() {
		System.out.println("(속닥속닥) 정적 메소드를 호출합니다.");
	}
	
	
	
	
	
	
	// 디폴트 일반 메소드도 들어올 수 있음(java 8 이상)
	
	// 음소거 해제 시, tv는 0, 라디오는 이전 볼륨으로
	default void setMute(boolean mute) {
		if (mute) {
		System.out.println("음소거 되었습니다.");
		setVolume(MIN_VOLUME);
		} else {
		System.out.println("음소거 해제되었습니다.");
		}
	}

	
	
	
	
	
}
