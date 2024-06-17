package org.example2;

class Main2 {
    public static void main(String[] args) {
        boolean rs = Math.isEvenNumbers(2);
        System.out.println(rs);

        rs = Math.isEvenNumbers(3);
        System.out.println(rs);

        rs = Math.isEvenNumbers(4);
        System.out.println(rs);

        rs = Math.isEvenNumbers(5);
        System.out.println(rs);

        rs = Math.isEvenNumbers(7);
        System.out.println(rs);

        rs = Math.isEvenNumbers(9);
        System.out.println(rs);

    }
}

class Math {

    public static boolean isEvenNumbers(int m) {
        for (int i = 2; i < m; i++) {
            if (m % i == 0) {
                return false;
            }
        }
        return true;
    }
}