package com.sun.homework;

import java.util.Scanner;

/**
 * ClassName: Homework02
 * Description: 注册邮箱
 * date: 2022/3/19 1:22
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
@SuppressWarnings({"all"})
public class Homework02 {
    public static void main(String[] args) {
        String[] strings = new String[3];
        init(strings);
        isRegister(strings);

    }
    public static void isRegister(String[] strings) {
        try {
            userRegister(strings[0], strings[1], strings[2]);
            String format = String.format("注册成功,用户名为%s,邮箱为%s", strings[0], strings[2]);
            System.out.println(format);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }

    }

    public static void init(String[] strings) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        strings[0] = scanner.nextLine();
        System.out.println("请输入密码");
        strings[1] = scanner.nextLine();
        System.out.println("请输入邮箱");
        strings[2] = scanner.nextLine();
    }

    public static void userRegister(String name, String pwd, String mail) {
        if (name.length() < 2 || name.length() > 4) {
            throw new RuntimeException("用户名格式有误");
        }
        if (pwd.length() != 6 || !isDigital(pwd)) {
            throw new RuntimeException("密码格式有误");
        }
        if (!(mail.contains("@") && mail.contains(".")
                && mail.indexOf("@") < mail.indexOf("."))) {
            throw new RuntimeException("邮箱格式有误");
        }

    }
    public static boolean isDigital(String pwd) {
        long startTime = 0L;
        long endTime = 0L;
        startTime = System.nanoTime();
        char[] chars = pwd.toCharArray();
        for (char ch : chars) {
            if (ch < '0' || ch > '9') {
                return false;
            }
        }
        endTime = System.nanoTime();
        // System.out.println("TotalTime is " + (endTime - startTime));
        return true;
    }
}

