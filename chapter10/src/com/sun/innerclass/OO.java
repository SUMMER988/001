package com.sun.innerclass;

public class OO {
    public static void main(String[] args) {
        System.out.println(AAA.num);
        System.out.println("==========");
        new AAA();
        new AAA();
        new AAA();
    }
}

class AAA {
    public static int num = 0;

    static {
        System.out.println("静态代码块");
    }
    {
        System.out.println("普通代码块");
    }

    public AAA() {
        System.out.println("调用无参构造器");
    }
}
