package org.example;

// 문제 : 번호가 다른 각각의 자동차가 서로 다른 최고속력으로 달리게 해주세요.

import java.util.Scanner;

class Main { // main 클래스
    public static void main(String[] args) {

        // 구현시작
        car aCar = new car(); // -> aCar 선언
        car bCar = new car(); // -> bCar 선언

        Scanner sc = new Scanner(System.in);
        aCar.maxKm = sc.nextInt();
        bCar.maxKm = sc.nextInt();

//        aCar.maxKm = 200; // -> aCar 최고 속력 데이터 저장
//        bCar.maxKm = 240; // -> bCar 최고 속력 데이터 저장

        aCar.drive(); // -> 메서드 호출 (함수 실행) -> 구성요소중 기능을 담당
        bCar.maxKm++;

        bCar.drive(); // -> 메서드 호출 (함수 실행)
    }
}

class car {
    int maxKm;

    void drive() { // -> 실행버튼(기능) -> 메서드 -> 기능을 담당
        System.out.printf("자동차가 최고속력 %dkm로 달립니다.\n", this.maxKm);
    }
}