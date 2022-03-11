package com.sun.static_;

public class StaticDetail {
    public static void main(String[] args) {
        System.out.println(B.n1);
        /*
          System.out.println(B.n0);
          error
         */
        System.out.println(C.n1);
        System.out.println(C.n2);
        System.out.println(C.n3);

    }
}

class B {
    public static int n1 = 100;
    public static int n2 = 200;
    public int n0 = 200;
}

class C extends B {
    public static int n1 = -100;
    public static int n3 = 300;
}
