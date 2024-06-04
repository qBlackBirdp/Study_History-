package org.example;
// 문제 : 아래와 같이 출력 되도록 해주세요.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // 예시 시작
//        int c = 20 + Math.더하기(10, 20);
//        System.out.println(c);
        // 예시 끝
        Scanner sc = new Scanner(System.in);
        System.out.println("1부터 n까지의 합,,, n 값을 입력하면 구해줌.");

        int i = sc.nextInt();

        System.out.printf("1부터 %d까지의 합\n", i);
        int 결과1 = Math.oneToSum(i);
        System.out.println("결과1 : " + 결과1);
        // 출력 : 결과1 : 6

        System.out.println("============================================");
        System.out.println("1부터 n까지의 합,,, n 값을 입력하면 구해줌.");

        i = sc.nextInt();
        System.out.printf("1부터 %d까지의 합\n", i);
        int 결과2 = Math.oneToSum(i);
        System.out.println("결과2 : " + 결과2);
        // 출력 : 결과2 : 55
    }
}

class Math {
//    static int 더하기(int a, int b) {
//        int c = a + b;
//
//        return c;
//    }

    public static int oneToSum(int i) {
        int sum = 0;
        while (0 <= i) {
            sum += i;
            i--;
        }
        return sum;
    }
}