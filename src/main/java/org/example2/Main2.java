package org.example2;

// 문제 : 매개변수를 사용해서 전사가 매번 다르게 공격하도록 해주세요.

class Main {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        a전사.공격("브라이언", "칼");
        // 브라이언이(가) 칼(으)로 공격합니다.

        a전사.재공격();
        // 브라이언이(가) 칼(으)로 공격합니다.

        a전사.공격("필립", "창");
        // 필립이(가) 창(으)로 공격합니다.

        a전사.공격("마크", "지팡이");
        // 마크(가) 지팡이(으)로 공격합니다.

        a전사.재공격();
        // 마크(가) 지팡이(으)로 공격합니다.

        a전사.재공격();
        // 마크(가) 지팡이(으)로 공격합니다.
    }
}
class 사람 {
    public void 공격() {
    }
}
class 전사 extends 사람 {
    String 마지막사람;
    String 마지막공격;

    void 공격(String a, String b) {

        System.out.println(a + "이(가) " + b +"(으)로 공격합니다.");
        this.마지막사람 = a;
        this.마지막공격 = b;
    }
    void 재공격() {

            System.out.println(this.마지막사람 + "이(가) " + this.마지막공격 + "(으)로 재공격합니다.");

    }
}
