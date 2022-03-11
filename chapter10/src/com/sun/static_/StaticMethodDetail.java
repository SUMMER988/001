package com.sun.static_;

public class StaticMethodDetail {
    public static void main(String[] args) {

        new D().ok();
    }
}

class D {

    public static int n1 = 100;
    public int n2 = 200;

    public static void hi() {
        System.out.println("hi()...");
    }

    public static void hello() {
        System.out.println("hello()...");
        System.out.println(n1);
        System.out.println(D.n1);
        hi();
        // say();无法从静态上下文中引用非静态 方法 say()
        // * 静态方法只能访问静态成员(方法|变量)

    }

    public void say() {
        System.out.println("say()...");
        System.out.println("n1 in say() is " + n1);
        System.out.println("n2 in say() is " + n2);
        hi();

    }

    public void ok() {
        System.out.println(n1);
        System.out.println(n2);
        hello();

    }
}
