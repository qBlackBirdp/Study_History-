package org.example2;


import java.util.Scanner;

class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] inputs = sc.nextLine().split(" ");

        long sum = 0;

        for (String inputData : inputs) {
            sum += Long.parseLong(inputData);
        }

        System.out.println(sum);

        sc.close();
    }
}