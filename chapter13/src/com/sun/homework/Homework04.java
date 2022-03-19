package com.sun.homework;

import java.util.Scanner;

/**
 * ClassName: Homework04
 * Description: 输入字符串，判断里面有多少个大写字母，多少个小写字母，多少个数字
 * date: 2022/3/19 21:32
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
@SuppressWarnings({"all"})
public class Homework04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str;

        try {
            str = scanner.next();
        } catch (Exception e) {
            str = scanner.nextLine();
            System.out.println(e.getMessage());
        }
        countStr(str);
    }

    public static void countStr(String str) {
        if (str == null) {
            System.out.println("输入不能为null");
            return;
        }
        int strlen = str.length();
        int numCount = 0;
        int lowerCount = 0;
        int upperCount = 0;
        int otherCount = 0;
        for (char chars : str.toCharArray()) {
            if (chars >= '0' && chars <= '9') {
                numCount++;
            } else if (chars >= 'a' && chars <= 'z') {
                lowerCount++;
            } else if (chars >= 'A' && chars <= 'Z') {
                upperCount++;
            } else {
                otherCount++;
            }
        }
        String format = String.format("数字有%d个，小写字母有%d个，" +
                "大小字母有%d个，其他字符有%d个", numCount, lowerCount, upperCount, otherCount);
        System.out.println(format);
    }
}
