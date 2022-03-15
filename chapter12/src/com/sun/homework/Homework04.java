package com.sun.homework;

/**
 * ClassName: Homework04
 * Description:
 * date: 2022/3/15 16:31
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
public class Homework04 {
    public static void main(String[] args) {//main方法
        try {
            showExce();
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("B");
        } finally {
            System.out.println("C");
        }
        System.out.println("D");
    }

    public static void showExce() throws Exception {
        throw new Exception();
    }

}
