package com.reference.list;

public class Listbasic7 {
	public static void main(String[] args) {
		
		// 배열 길이 늘리는 방법 1
		int[] oldArr = {1,2,3};
		int[] newArr = new int[5];
		
//		newArr[0] = oldArr[0];
//		newArr[1] = oldArr[1];
//		newArr[2] = oldArr[2];
		
		for(int i=0; i<oldArr.length; i++) {
			newArr[i] = oldArr[i];
		}
		
		// 방법 2 : arraycopy()
		// System.arraycopy(원본배열, 복사시작위치, 새배열, 붙여넣기시작위치, 복사개수);
		int[] oldArr2 = {1,2,3};
		int[] newArr2 = new int[5];
		
		System.arraycopy(oldArr2, 0, newArr2, 0, oldArr2.length);
		
		for(int j=0; j<newArr2.length; j++) {
			System.out.print(newArr2[j]);
		}
		
		
		
		
		}
		
		
	
}
