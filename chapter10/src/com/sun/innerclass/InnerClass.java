package com.sun.innerclass;

public class InnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.m1();

    }
}

class Outer {
    private int n1 = 100;
    private void m2() {
        System.out.println("Outer m2()");

    }
    public void m1() {
        final class Inner02 {
            public void f1() {
                System.out.println("n1=" + n1);
                m2();
            }
        }

        Inner02 inner02 = new Inner02();
        inner02.f1();

    }

    public Outer() {
    }
}
