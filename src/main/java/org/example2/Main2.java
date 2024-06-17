package org.example2;
// 문제 : 1부터 n까지의 소수의 갯수를 출력하는 함수를 만들어주세요.

class Main2 {
    public static void main(String[] args) {
        int rs = one_to_n_Prime_Numbers_count(10);
        System.out.println("rs : " + rs);
        // rs : 4
        rs = one_to_n_Prime_Numbers_count(13);
        System.out.println("rs : " + rs);
        // rs : 6
        rs = one_to_n_Prime_Numbers_count(100);
        System.out.println("rs : " + rs);
        // rs : 25
    }

    // 2를 제외한 2의 배수 모두 지우기, 3을 제외한 3의 배수 모두 지우기.
    private static int one_to_n_Prime_Numbers_count(int m) {
        int count = 0;
        for (int i = 1; i <= m; i++) {
            if (isPrimeNumbers(i)) {
                count++;
            }
        }
        return count;
    }
    public static boolean isPrimeNumbers(int m) {
        if (m == 1){
            return false;
        }
        for (int i = 2; i < m; i++) {
            if (m % i == 0) {
                return false;
            }
        }
        return true;
    }
}