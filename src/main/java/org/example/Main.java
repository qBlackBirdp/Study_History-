package org.example;

// 문제 : 번호가 다른 각각의 자동차가 서로 다른 최고속력으로 달리게 해주세요.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        bandMember[] bm = new bandMember[5]; //=> 반복문 활용을 위한 변수 선언 (5명이라 5개 만듦)
        Scanner sc = new Scanner(System.in);
        System.out.println("5명의 밴드멤버 리스트를 작성할 수 있습니다.");

        bandMember v = new bandMember();
        bm[0] = v;

        bandMember p = new bandMember();
        bm[1] = p;

        bandMember g = new bandMember();
        bm[2] = g;

        bandMember b = new bandMember();
        bm[3] = b;

        bandMember d = new bandMember();
        bm[4] = d;

        for (int i = 0; i <= 4; i++) {
            bandMember a = bm[i]; // -> 반복할 때 마다 a 값 0~4까지.
            bm[i] = a;
            System.out.println("이름을 입력해주세요.");
            a.name = sc.next(); // -> 인스턴스가 존재하지 않으면 오류, 클래스 안에 객체를 생성해야함.
            System.out.println("악기파트를 입력해주세요.");
            a.position = sc.next();
            System.out.println("나이를 입력해주세요.(숫자만 입력)");
            a.age = sc.nextInt();
            System.out.println("결혼여부를 입력해주세요.(true/false만 입력)");
            a.isMarred = sc.nextBoolean();
            a.introduce();
        }

    }
}

class bandMember {
    String name;
    String position;
    int age;
    boolean isMarred;

    void introduce() {
        System.out.printf("이름: %s\n파트: %s\n나이: %d\n결혼여부: %b\n\n", this.name, this.position, this.age, this.isMarred);//-> a변수를 출력문에 대입.

    }
}