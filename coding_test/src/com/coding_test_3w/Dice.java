package com.coding_test_3w;

//import java.util.Scanner;

public class Dice {
 public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//      int d1 = sc.nextInt();
//      int d2 = sc.nextInt();
//      int d3 = sc.nextInt();
	 
     // 랜덤값 
     int d1 = (int) (Math.random()*6 + 1);
     int d2 = (int) (Math.random()*6 + 1);
     int d3 = (int) (Math.random()*6 + 1);
     
     // 상금
     int money = 0;
     // 같은 눈
     int sameNum = 0;
     // 가장 큰 눈 (d1으로 지정)
     int maxNum = d1;
     
     // 눈 조건
     // 같은 눈 3개
     if (d1 == d2 && d2 == d3) {
         money = 10000 + d1 * 1000;
     }
     // 같은 눈 2개만
     else if (d1 == d2 && d2 != d3) {
             sameNum = d1;
             money = 1000 + sameNum * 100;
     } else if (d1 == d3 && d1 != d2) {
             sameNum = d1;
             money = 1000 + sameNum * 100;
     } else if (d2 == d3 && d2 != d1) {
             sameNum = d2;
             money = 1000 + sameNum * 100;
     }
     // 모두 다른 눈
     else {
         // 가장 큰 눈
         if (d2 > maxNum) {
             maxNum = d2;
         }
         if (d3 > maxNum) {
             maxNum = d3;
         }
         money = maxNum * 100;
     }
     System.out.println("주사위 : " + d1 + " " + d2 + " " + d3);
     System.out.println("세 수 모두 같은 경우 : 10000 + " + d1 + " x 1000");
     System.out.println("두 수 같은 경우 : 1000 + " + sameNum + " x 100");
     System.out.println("모두 다른 눈인 경우 : " + maxNum + " x 100");
     System.out.println(money);
     
 }
}