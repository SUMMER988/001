package com.sun.codeblock;

public class CodeBlock01 {
    public static void main(String[] args) {
        new Movie("你好李焕英");
        new Movie("唐探3", "陈思诚");
    }
}

class Movie {
    private String name;
    private double price;
    private String director;

    {
        System.out.println("电影屏幕打开...");
        System.out.println("广告开始...");
        System.out.println("电影正式开始...");
    }

    public Movie(String name) {
        System.out.println("Movie(String name)被调用");
        this.name = name;
    }

    public Movie(String name, String director) {
        System.out.println("Movie(String name, String director)被调用");
        this.name = name;
        this.director = director;
    }

    public Movie(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
    }
}
