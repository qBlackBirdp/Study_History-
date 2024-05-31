package org.example;

//정보 선생님은 수업을 시작하기 전에 이상한 출석을 부른다.
//
//        선생님은 출석부를 보고 번호를 부르는데,
//        학생들의 얼굴과 이름을 빨리 익히기 위해 번호를 무작위(랜덤)으로 부른다.
//
//        그리고 얼굴과 이름이 잘 기억되지 않는 학생들은 번호를 여러 번 불러
//        이름과 얼굴을 빨리 익히려고 하는 것이다.
//
// 출석 번호를 n번 무작위로 불렀을 때, 각 번호(1 ~ 23)가 불린 횟수를 각각 출력해보자.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n, i;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for(i = 0; i <= n; i++){
            arr[i] = sc.nextInt();
        }
        for(i = n - 1; i >= 0; i--){
            System.out.printf("%d", arr[i]);
        }
    }
}
//int n, i;
//int a[1000]={};
//scanf("%d", &n); //개수 입력 받기
//for(i=1; i<=n; i++) //개수 만큼 입력 받기
//scanf("%d", &a[i]); //읽어서 순서대로 배열에 넣는다.
//
//for(i=n; i>=1; i--)
//printf("%d ", a[i]); //i 번 배열에 저장되어 있는 값 출력하기
//

