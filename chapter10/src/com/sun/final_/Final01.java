package com.sun.final_;

public class Final01 {
    public static void main(String[] args) {
        E e = new E();
        // e.TAX_RATE = 0.10;
        new F().cry();
    }
}

//如果我们要求A类不能被其他类继承
//可以使用final修饰A类
final class A {
}

class C {
    public final void hi() {
    }
}

class D extends C {
    // @Override
    // public void hi() {
    //     super.hi();
    // }
}

class E {
    public final double TAX_RATE = 0.08;
}

class F {
    public void cry() {
        //局部常量
        final double NUM = 0.01;
        // NUM = 0.09;
        System.out.println("NUM=" + NUM);
    }
}
