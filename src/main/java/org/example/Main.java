package org.example;// 문제 : 아래 코드가 실행되도록 자동차 클래스를 만들어주세요.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int a = 계산기.더한결과를_화면에_출력(10, 20);
        System.out.println(a);
        // 출력 => 결과 : 30

        int b = 계산기.더한결과를_화면에_출력(50, 20);
        System.out.println(b);
        // 출력 => 결과 : 70

        int c = 계산기.뺀결과를_화면에_출력(50, 20);
        System.out.println(c);
        // 출력 => 결과 : 30

        int d = 계산기.뺀결과를_화면에_출력(5, 2);
        System.out.println(d);
        // 출력 => 결과 : 3

        int e = 계산기.곱한결과를_화면에_출력(5, 2);
        System.out.println(e);
        // 출력 => 결과 : 10
    }
}

class 계산기 {

    public static int 더한결과를_화면에_출력(int a, int b) {
        return a + b;
    }

    public static int 뺀결과를_화면에_출력(int a, int b) {
        return a - b;
    }

    public static int 곱한결과를_화면에_출력(int a, int b) {
        return a * b;
    }
}