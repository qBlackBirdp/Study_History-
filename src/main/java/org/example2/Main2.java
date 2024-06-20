package org.example2;

// 문제 : 아래가 실행되도록 해주세요.

import java.util.ArrayList;
import java.util.List;

class Main2 {
    public static void main(String[] args) {
        v1();
        v2();
        v3();
    }
    static void v3() {
        System.out.println("==v3==");
        List<Article> articles = new ArrayList<>();// <>안에는 변수 타입을 지정함.

        articles.add(new Article());
        articles.add(new Article());
        articles.add(new Article());

        for (int i = 0; i < articles.size(); i++) {
            Article article = articles.get(i);
            System.out.println(article.id);
        }
    }
    static void v2() {
        System.out.println("==v2==");
        ArrayList articles = new ArrayList();

        articles.add(new Article());
        articles.add(new Article());
        articles.add(new Article());

        for (int i = 0; i < articles.size(); i++) {
            Article article = (Article) articles.get(i);
            System.out.println(article.id);
        }
    }
    static void v1(){
        System.out.println("==v1==");
        Article[] articles = new Article[100];

        int articleSize = 0;

        articles[0] = new Article();
        articleSize++;
        articles[1] = new Article();
        articleSize++;
        articles[2] = new Article();
        articleSize++;

        for (int i = 0; i < articleSize; i++) {
            System.out.println(articles[i].id);
        }
    }
}

class Article {
    static int lastId; //스태틱 변수는 공공재다.

    int id;
    String regDate;

    static {
        lastId = 0;
    }

    Article() {
        this( lastId+ 1, "2024-12-12 12:12:12");
        lastId++;
    }

    Article(int id, String regDate) {
        this.id = id;
        this.regDate = regDate;
    }

}