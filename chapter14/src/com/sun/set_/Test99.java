package com.sun.set_;

/**
 * ClassName: Test99
 * Description:
 * date: 2022/3/20 18:00
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
@SuppressWarnings({"all"})
public class Test99 {
    public static void main(String[] args) {
        new AA().f1();
        new AA().f1();

    }
}

class AA {
    private static int num;

    static {
        num++;
        System.out.println("static codeBlock");
    }
    {
        System.out.println("average codeBlock");
    }

    public AA() {
        System.out.println("AA()");
    }

    public static void f1() {
        System.out.println("f1()");
    }
}
