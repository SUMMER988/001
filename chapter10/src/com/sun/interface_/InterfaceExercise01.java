package com.sun.interface_;

interface A {
    int a = 30;
}

public class InterfaceExercise01 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(A.a);
        System.out.println(b.a);
        System.out.println(B.a);
    }
}

class B implements A {

}
