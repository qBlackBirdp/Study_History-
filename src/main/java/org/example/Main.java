package org.example;// 문제 : 아래 코드가 실행되도록 자동차 클래스를 만들어주세요.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("=============");
        System.out.println("더하기입니다.");
        System.out.println("a 값입력");
        a = sc.nextInt();
        System.out.println("b 값입력");
        b = sc.nextInt();

        int x = 계산기.더한결과를_화면에_출력(a, b);
        System.out.printf("%d + %d = %d \n", a, b, x);
        // 출력 => 결과 : 30
        System.out.println("=============");
        System.out.println("더하기입니다.");
        System.out.println("a 값입력");
        a = sc.nextInt();
        System.out.println("b 값입력");
        b = sc.nextInt();

        int y = 계산기.더한결과를_화면에_출력(a, b);
        System.out.printf("%d + %d = %d \n", a, b, y);
        // 출력 => 결과 : 70
        System.out.println("=============");
        System.out.println("빼기입니다.");
        System.out.println("a 값입력");
        a = sc.nextInt();
        System.out.println("b 값입력");
        b = sc.nextInt();

        int c = 계산기.뺀결과를_화면에_출력(a, b);
        System.out.printf("%d - %d = %d \n", a, b, c);
        // 출력 => 결과 : 30
        System.out.println("=============");
        System.out.println("빼기입니다.");
        System.out.println("a 값입력");
        a = sc.nextInt();
        System.out.println("b 값입력");
        b = sc.nextInt();

        int d = 계산기.뺀결과를_화면에_출력(a, b);
        System.out.printf("%d - %d = %d \n", a, b, d);
        // 출력 => 결과 : 3
        System.out.println("=============");
        System.out.println("곱하기입니다.");
        System.out.println("a 값입력");
        a = sc.nextInt();
        System.out.println("b 값입력");
        b = sc.nextInt();

        int e = 계산기.곱한결과를_화면에_출력(a, b);
        System.out.printf("%d * %d = %d \n", a, b, e);
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