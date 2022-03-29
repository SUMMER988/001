package com.sun.set_;

import java.util.Random;

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
}

//父类
class BBB {
    public static long time = System.currentTimeMillis();

    static {
        timeElapsed();//设置延时
        System.out.println("B类静态块" + +System.currentTimeMillis());
    }

    public static BBB t1 = new BBB();
    public static BBB t2 = new BBB();
    public BBB() {
        super();
        timeElapsed();//设置延时
        System.out.println("B类构造块" + System.currentTimeMillis());
    }
    // 延时方法
    public static void timeElapsed() {
        for (int i = 0; i < 10000000; i++) {
            int a = new Random(100).nextInt();
            int b = new Random(100).nextInt();
            a = a + b;
        }
    }
}

//子类
class AAA extends BBB {
    public static long time = System.currentTimeMillis();

    static {
        timeElapsed();//设置延时
        System.out.println("A类静态块");
    }

    public static AAA t1 = new AAA();
    public static AAA t2 = new AAA();
    public AAA() {
        super();
        timeElapsed();//设置延时
        System.out.println("A类构造块");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
        AAA t = new AAA();
    }
}

