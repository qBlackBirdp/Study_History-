package org.example;
// 문제 : 아래와 같이 출력 되도록 해주세요.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.println("x부터 y의 합을 알려주겠다.");
        System.out.println("x입력");
        x = sc.nextInt();
        System.out.println("y입력");
        y = sc.nextInt();;
        int 결과1 = Math.nToMSum(x, y);
        System.out.println("결과1 : " + 결과1);
        // 출력 : 결과1 : 5
        System.out.println("==========================");
        System.out.println("x부터 y의 합을 알려주겠다.");
        System.out.println("x입력");
        x = sc.nextInt();
        System.out.println("y입력");
        y = sc.nextInt();
        int 결과2 = Math.nToMSum(x, y);
        System.out.println("결과2 : " + 결과2);
        // 출력 : 결과2 : 45
    }
}

class Math {
    static int nToMSum (int x, int y){
        int sum = x;
        x = x + 1;
        while (x <= y){
            sum = sum + x;
            x++;
        }
        return sum;
    }
}