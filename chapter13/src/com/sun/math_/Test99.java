package com.sun.math_;

import java.util.Random;

/**
 * ClassName: Test99
 * Description:
 * date: 2022/3/17 16:24
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
@SuppressWarnings({"all"})
public class Test99 {
    public static void main(String[] args) {
        double num1 = 0;
        double num2 = 0;
        Random random = new Random();
        long startTime = System.currentTimeMillis();
        int count = 0;
        while (true) {
            count++;
            num1 = random.nextInt(100);
            num2 = random.nextInt(100);
            if (num1 == num2) {
                System.out.println(num1 + "\t" + count);
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
