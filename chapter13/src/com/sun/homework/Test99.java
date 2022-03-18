package com.sun.homework;

import java.util.Scanner;

/**
 * ClassName: Test99
 * Description:
 * date: 2022/3/17 23:07
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
@SuppressWarnings({"all"})
public class Test99 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        try {
            printName(str);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void printName(String str) {
        if (str == null) {
            throw new RuntimeException("字符串不能为空");
        }
        String[] names = str.split(" ");
        if (names.length != 3) {
            throw new RuntimeException("字符串长度有误");
        }
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            if (!(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch == ' ')) {
                throw new RuntimeException("字符串格式有误");
            }
        }
        String format = String.format("%s,%s.%c", names[2], names[0], names[1].toUpperCase().charAt(0));
        System.out.println(format);
        System.out.println(format);

    }
}
