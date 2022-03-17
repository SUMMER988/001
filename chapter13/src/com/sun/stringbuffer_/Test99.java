package com.sun.stringbuffer_;

import java.util.Scanner;

/**
 * ClassName: Test99
 * Description:
 * date: 2022/3/17 2:16
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
@SuppressWarnings({"all"})
public class Test99 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String price = null;
        StringBuffer priceSb = new StringBuffer();
        while (true) {
            try {
                System.out.println("请输入价格：");
                price = scanner.next();
                Double.parseDouble(price);
                priceSb.append(price);
                break;
            } catch (Exception e) {
                System.out.println("价格输入有误，请重新输入");
                scanner.nextLine();
            }
        }
        int index = priceSb.lastIndexOf(".");
        if (index == -1) {
            index = priceSb.length();
        }
        while (true) {
            if (index < 4) {
                break;
            }
            priceSb = priceSb.insert(index - 3, ',');
            index = index - 3;
        }
        System.out.println(priceSb);
    }
}
