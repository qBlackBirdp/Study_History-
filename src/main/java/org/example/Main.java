package org.example;

// 문제 : 번호가 다른 각각의 자동차가 서로 다른 최고속력으로 달리게 해주세요.

import java.util.Scanner;


// 문제 : 번호가 다른 각각의 자동차가 서로 다른 최고속력으로 달리게 해주세요.
class Main { // main 클래스
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 구현시작
        car aCar = new car(); // -> aCar 선언
        car bCar = new car(); // -> bCar 선언
        System.out.println("두대의 차의 최고 속력을 출력해줍니다.");

        System.out.println("첫번째 차의 이름을 입력해주세요.");
        aCar.name = sc.next();

        System.out.println("두번째 차의 이름을 입력해주세요.");
        bCar.name = sc.next();


        System.out.println("a Car 의 최고 속력을 입력해주세요.");
        aCar.maxKm = sc.nextInt();
        System.out.println("b Car 의 최고 속력을 입력해주세요.");

        bCar.maxKm = sc.nextInt();

//        aCar.maxKm = 200; // -> aCar 최고 속력 데이터 저장
//        bCar.maxKm = 240; // -> bCar 최고 속력 데이터 저장

        aCar.drive(); // -> 메서드 호출 (함수 실행) -> 구성요소중 기능을 담당

        bCar.drive(); // -> 메서드 호출 (함수 실행)
    }
}

class car {
    int maxKm;
    String name;

    void drive() { // -> 실행버튼(기능) -> 메서드 -> 기능을 담당
        System.out.printf("%s가(이) 최고속력 %dkm/h로 달립니다.\n", this.name, this.maxKm);
    }
}