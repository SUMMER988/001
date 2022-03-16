package com.sun.string_;

import java.util.Scanner;

/**
 * ClassName: Test
 * Description:
 * date: 2022/3/15 23:49
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
@SuppressWarnings({"all"})
public class Test {
    public static void main(String[] args) {
        double ceil = Math.ceil(4.0);
        System.out.println(ceil);
        double floor = Math.floor(-5.1);
        System.out.println(floor);
        long round = Math.round(-5.00001);
        System.out.println(round);
        long round0 = 0;
        while (true) {
            try {
                System.out.println("请输入价格:");
                //该语句若位于循环体外，则死循环↓↓↓
                Scanner scanner = new Scanner(System.in);
                round0 = scanner.nextLong();
                break;
            } catch (Exception e) {
                System.out.println("您输入的价格有误，请重新输入");
            }
        }
        System.out.println("你输入的价格为" + round0);
    }
}
