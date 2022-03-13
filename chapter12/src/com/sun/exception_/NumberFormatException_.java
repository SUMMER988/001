package com.sun.exception_;

/**
 * ClassName: NumberFormatException_
 * Description:
 * date: 2022/3/14 0:58
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
public class NumberFormatException_ {
    public static void main(String[] args) {
        String name = "韩顺平教育";
        //将String 转成 int
        int num = Integer.parseInt(name);
        //抛出NumberFormatException
        System.out.println(num);//1234
    }
}
