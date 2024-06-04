package org.example;// 문제 : 아래 코드가 실행되도록 자동차 클래스를 만들어주세요.

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        계산기.합(a, b);
    }
}

class 계산기 {

    static void 합(int a, int b) {
        System.out.printf("%d + %d = %d", a, b, a + b);
    }
}

