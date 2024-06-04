package org.example;

// 문제 : 번호가 다른 각각의 자동차가 서로 다른 최고속력으로 달리게 해주세요.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        bandMember[] bm = new bandMember[5]; //=> 반복문 활용을 위한 변수 선언 (5명이라 5개 만듦)
        Scanner sc = new Scanner(System.in);

        bandMember v = new bandMember();
        bm[0] = v;
        v.name = sc.next(); // -> 인스턴스가 존재하지 않으면 오류, 클래스 안에 객체를 생성해야함.
        v.position = sc.next();
        v.age = sc.nextInt();
        v.isMarred = sc.nextBoolean();

        bandMember p = new bandMember();
        bm[1] = p;
        p.name = "김모씨";
        p.position = "Piano";
        p.age = 25;
        p.isMarred = false;

        bandMember g = new bandMember();
        bm[2] = g;
        g.name = "유모씨";
        g.position = "Guitar";
        g.age = 27;
        g.isMarred = false;

        bandMember b = new bandMember();
        bm[3] = b;
        b.name = "한모씨";
        b.position = "Bass";
        b.age = 28;
        b.isMarred = false;

        bandMember d = new bandMember();
        bm[4] = d;
        d.name = "오모씨";
        d.position = "Drum";
        d.age = 29;
        d.isMarred = false;

        for (int i = 0; i <= 4; i++) {
            bandMember a = bm[i]; // -> 반복할 때 마다 a 값 0~4까지.
            bm[i] = a;
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