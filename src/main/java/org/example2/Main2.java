package org.example2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Main2 {
    public static void main(String[] args) {
        //일반 //홀수를 걸러낼거야.
        int[] arr = {33, 2, 55, 4, 51, 6, 71, 18, 29, 10};

        List<Integer> resultAl = new ArrayList<>();

        //filter
        for (int n : arr) if (n % 2 == 0) resultAl.add(n); // 중괄호 안이 한줄이면 이렇게 써도돼.

        //map
        for (int i = 0; i < resultAl.size(); i++) {
            int newValue = resultAl.get(i) * 2;
            resultAl.set(i, newValue);
        }
        System.out.println(resultAl);

        System.out.println("=================");

        //스트림
        arr = new int[]{33, 2, 55, 4, 51, 6, 71, 18, 29, 10};

        resultAl = Arrays.stream(arr)
                .filter(e -> e % 2 == 0)
                .map(e -> e * 2)
                .boxed() // new Integer 과 같은 말.
                .collect(Collectors.toList());
        System.out.println(resultAl);
    }
}