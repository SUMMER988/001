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
        String s = scanner.nextLine();
        String[] strings = s.split("\\s+");
        System.out.println(strings.length);
        System.out.println(String.format("%s,%s.%c",
                strings[2], strings[0], strings[1].toUpperCase().charAt(0)));
    }
}
