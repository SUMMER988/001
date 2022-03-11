package com.sun.main_;

public class Main01 {
    //静态变量\属性(静态成员)
    private static final String name = "Sun";
    private int n1 = 10000;

    public static void hi() {
        System.out.println("hi() of Main01");
    }

    public static void main(String[] args) {
        //静态方法main可以访问本类的静态成员
        System.out.println(name);
        hi();
        //静态方法main不可以直接访问本类的非静态成员
        //cry();
        //System.out.println(n1);
        //静态方法main要访问本类的非静态成员,需要先创建对象,再调用即可
        Main01 main01 = new Main01();
        main01.cry();
        System.out.println(main01.n1);
    }

    public void cry() {
        System.out.println("cry()");
    }
}
