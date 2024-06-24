package org.example2;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Main2 {
    public static void main(String[] args) {
        //일반 //홀수를 걸러낼거야.
        int[] arr = {33, 2, 55, 4, 51, 6, 71, 18, 29, 10};

        int rsArrLen = 0;

        for (int n : arr) { //arr 순회할거야 짝수의 개수를 세어서 rsArrLen에 저장할거야.
            if (n % 2 == 0) {
                rsArrLen++;
            }
        }
        int[] rsArr = new int[rsArrLen]; //길이가 rsArrLen인 정수형 배열을 선언. 이 배열은 짝수만 저장하기 위한 배열

        int rsArrLastIndex = -1; //인덱스 추적

        for (int n : arr) { //두 번째 for 루프는 배열 arr의 모든 요소를 다시 순회
            if (n % 2 != 0) { //현재 요소 n이 홀수인지를 확인
                continue; //만약 n이 홀수라면, continue 문을 통해 현재 반복을 건너뜀.
            }
            rsArr[++rsArrLastIndex] = n;
        }
        System.out.println(Arrays.toString(rsArr));
        System.out.println("=================");
        //내 풀이
        List<Integer> arr2 = Arrays.asList(33, 2, 55, 4, 51, 6, 71, 18, 29, 10);
        List<Integer> evenNumbers = arr2.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);

        //강사님 풀이
        System.out.println("=================");

        arr = new int[]{33, 2, 55, 4, 51, 6, 71, 18, 29, 10};

        rsArr = Arrays.stream(arr)
                .filter(e -> e % 2 == 0)
                .map(e -> e * 2) //맵 기능 설명을 위해 곱해봄
                .toArray();
        System.out.println(Arrays.toString(rsArr));
    }
}