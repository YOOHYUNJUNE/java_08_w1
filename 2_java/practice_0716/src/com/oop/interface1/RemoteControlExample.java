package com.oop.interface1;

public class RemoteControlExample {
	public static void main(String[] args) {
		
//		TV tv = new TV();
//		Radio radio = new Radio();
//		tv.turnOn();
//		radio.turnOn();
		
		// final이 생략되어 있어 수정 불가
//		RemoteControl.MIN_VOLUME = 10;
		
		// 인터페이스를 이용
		// TV
		RemoteControl rc = new TV();
		rc.turnOn();
		rc.setVolume(11);
		
		TV tv = (TV) rc;
		System.out.println("TV 볼륨 : " + tv.getVolume());
		
		rc.setVolume(-1);
		System.out.println("TV 볼륨 : " + tv.getVolume());
		
		rc.setMute(true);
		System.out.println("TV 볼륨 : " + tv.getVolume());
		rc.setMute(false);
		System.out.println("TV 볼륨 : " + tv.getVolume());

	
		rc.turnOff();

		System.out.println();
		
		// 라디오
		rc = new Radio();
		rc.turnOn();
		rc.setVolume(11);
		
		Radio rd = (Radio) rc;
		System.out.println("Radio 볼륨 : " + rd.getVolume());
		
		rc.setVolume(5);
		System.out.println("Radio 볼륨 : " + rd.getVolume());
		
		rc.setMute(true);
		System.out.println("Radio 볼륨 : " + rd.getVolume());
		rc.setMute(false);
		System.out.println("Radio 볼륨 : " + rd.getVolume());

	
		rc.turnOff();
		
		
		
		
		
	}
}
