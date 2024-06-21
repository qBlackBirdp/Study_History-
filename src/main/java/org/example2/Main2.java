package org.example2;


import java.util.InputMismatchException;
import java.util.Scanner;

class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;

        while (true) {
            System.out.print("숫자: ");
            try {
                n = sc.nextInt();  // 대기, 숫자를 똑바로 입력할 때 까지
                sc.nextLine(); //버퍼를 지운다.
                break;
            } catch (InputMismatchException e) {
                System.out.println("숫자를 똑바로 입력해.");
                sc.nextLine(); //버퍼를 지운다.
            }
        }

        System.out.printf("입력된 숫자 : %d", n);

        sc.close();
    }
}