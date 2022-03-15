package com.sun.wrapper;

/**
 * ClassName: Interger01
 * Description:
 * date: 2022/3/15 17:25
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
public class Integer01 {
    public static void main(String[] args) {
        int n1 = 100;
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);
        System.out.println(integer);

        int i = integer.intValue();
        int n2 = 200;
        Integer integer2 = n2;
        int n3 = integer2;
    }
}
