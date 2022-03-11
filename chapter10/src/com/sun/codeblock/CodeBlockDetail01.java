package com.sun.codeblock;

public class CodeBlockDetail01 {
    public static void main(String[] args) {
        // 类被加载的情况举例
        //         new AA();
        //         new AA();
        System.out.println(Cat.n2);
        System.out.println(Cat.color);
        System.out.println(DD.n1);
        System.out.println(new DD().n2);
    }
}

class DD {
    public static int n1 = 888;//静态属性

    //静态代码块
    static {
        System.out.println("DD的静态代码块1被执行");
    }

    public int n2 = 999;

    //普通代码块,在new对象时,被调用,每创建一个对象,就调用一次
    //普通代码块是构造器的补充
    {
        System.out.println("DD的普通代码块被执行");
    }
}

class Animal {
    public static int n2 = 100;

    static {
        System.out.println("Animal的静态代码块1被执行");
    }
}

class Cat extends Animal {
    public static int n1 = 999;
    public static String color = "red";

    static {
        System.out.println("Cat的静态代码块1被执行");
    }
}

class BB {
    static {
        System.out.println("BB的静态代码块1被执行");
    }

    public BB() {
        System.out.println("BB()被调用");
    }
}

class AA extends BB {
    static {
        System.out.println("AA的静态代码块1被执行");
    }

    public AA() {
        System.out.println("AA()被调用");
    }
}
