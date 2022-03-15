package com.sun.homework;

/**
 * ClassName: Homework03
 * Description:
 * date: 2022/3/15 16:20
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
public class Homework03 {
    public static void func() {//静态方法
        try {
            throw new RuntimeException();
        } finally {
            System.out.println("B");
        }
    }
    public static void main(String[] args) {//main方法
        try {
            func();
            System.out.println("A");//try代码块中抛出异常，剩余语句不执行
        } catch (Exception e) {
            System.out.println("C");
        }
        System.out.println("D");
    }
}
