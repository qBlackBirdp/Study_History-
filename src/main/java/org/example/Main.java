package org.example;// 문제 : 아래 코드가 실행되도록 자동차 클래스를 만들어주세요.

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
//        boolean rs = 계산기.is_a_bigger_than_b(10,20);
//        System.out.println(rs);
//
//        rs = 계산기.is_a_bigger_than_b(240,20);
//        System.out.println(rs);
//
//        rs = 계산기.is_a_bigger_than_b(20,20);
//        System.out.println(rs);
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("a는 b보다 큰가?");
        System.out.println("a 값 입력");
        a = sc.nextInt();
        System.out.println("b 값 입력");
        b = sc.nextInt();
        boolean rs = 계산기.is_a_bigger_than_b(a, b);
        System.out.println(rs);
    }
}

class 계산기 {

    static boolean is_a_bigger_than_b(int a, int b) {
        System.out.printf("%d > %d : ", a , b);
        return a > b;
    }
}

