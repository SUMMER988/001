package com.sun.homework;

import java.util.Scanner;

/**
 * ClassName: Homework02
 * Description:
 * date: 2022/3/19 1:22
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
@SuppressWarnings({"all"})
public class Homework02 {
    public static void main(String[] args) {
        init();
    }

    public static void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1");
        String name = scanner.nextLine();
        System.out.println("2");
        String pwd = scanner.nextLine();
        System.out.println("3");
        String mail = scanner.nextLine();
        try {
            userRegister(name, pwd, mail);
            System.out.println("注册成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
    }

    public static void userRegister(String name, String pwd, String mail) {
        if (name.length() < 2 || name.length() > 4) {
            throw new RuntimeException("用户名长度有误");
        }
        if (pwd.length() != 6 || !isDigital(pwd)) {
            throw new RuntimeException("密码长度有误");
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

