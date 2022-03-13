package com.sun.exception_;

/**
 * ClassName: ClassCastException_
 * Description:
 * date: 2022/3/14 0:52
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
public class ClassCastException_ {
    public static void main(String[] args) {
        A b = new B(); //向上转型
        B b2 = (B) b;//向下转型，这里是OK
        C c2 = (C) b;//这里抛出ClassCastException
    }
}

class A {
}

class B extends A {
}

class C extends A {
}

