package com.sun.static_;

public class StaticExercise {
}

class Test {
    static int count = 9;

    public static void main(String[] args) {
        new Test().count();
        new Test().count();
        System.out.println(Test.count);
    }

    public void count() {
        System.out.println("count = " + (count++));
    }
}
