package com.sun.codeblock;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        A a = new A();
    }
}

class A {
    private static int n1 = getN1();

    static {
        System.out.println("A 的静态代码块1被调用");
    }

    private int n2 = getN2();

    {
        System.out.println("A 的普通代码块被调用");

    }
    public static int getN1() {
        System.out.println("getN1()被调用");
        return 100;
    }
    public int getN2() {
        System.out.println("getN2()被调用");
        return 200;
    }

}

class B {
    private static int n1 = setN1();

    static {
        System.out.println("B 的静态代码块1被调用");
    }
    public static int setN1() {
        System.out.println("getN1()被调用");
        return 100;
    }

    public static int getN1() {
        return n1;
    }
}
