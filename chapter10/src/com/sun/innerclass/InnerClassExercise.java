package com.sun.innerclass;

public class InnerClassExercise {
}

class Test {
    public Test() {
        Inner s1 = new Inner();
        s1.a = 20;
        Inner s2 = new Inner();
        System.out.println(s2.a);
    }
    public static void main(String[] args) {
        Test test = new Test();
        Inner inner = test.new Inner();
        System.out.println(inner.a);
    }

    class Inner {
        public int a = 10;
    }
}
