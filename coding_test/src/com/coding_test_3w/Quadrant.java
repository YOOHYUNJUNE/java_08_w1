package com.coding_test_3w;

import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        // 사분면 찾기
        // 1 사분면 : (양수, 양수)
        // 2 사분면 : (음수, 양수)
        // 3 사분면 : (음수, 음수)
        // 4 사분면 : (양수, 음수)
        
        Scanner sc = new Scanner(System.in);
  
        // x, y좌표
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        // 사분면
        int Q = 0;
        
        // 1 사분면 정의
        if (x > 0 && y > 0) {
            Q = 1;
        } else if (x < 0 && y > 0) {
            Q = 2;
        } else if (x < 0 && y < 0) {
            Q = 3;
        } else if (x > 0 && y < 0) {
            Q = 4;
        } 
        
        System.out.println(Q);
        
        
    } 
}

