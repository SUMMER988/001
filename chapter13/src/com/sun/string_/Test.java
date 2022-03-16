package com.sun.string_;

import java.util.Random;

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
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println();
            }
            System.out.print((int) (2 + (Math.random() * 6)));
        }
    }
}
