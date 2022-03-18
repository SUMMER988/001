package com.sun.homework;

/**
 * ClassName: Homework01
 * Description:
 * date: 2022/3/19 1:18
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
@SuppressWarnings({"all"})
public class Homework01 {
    public static void main(String[] args) {
        String str = "ABCDEFG";
        System.out.println("===交换前===");
        System.out.println("str = " + str);
        try {
            str = reverse(str, 2, 5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("===交换后===");
        System.out.println("str = " + str);

    }
    public static String reverse(String str, int start, int end) {
        if (str == null) {
            throw new RuntimeException("字符串不能为空");
        }
        if (!(start >= 0 && end < str.length() && start < end)) {
            throw new RuntimeException("参数设置有误");
        }
        char[] chars = str.toCharArray();
        while (start < end) {
            swap(chars, start++, end--);
        }
        return new String(chars);
    }
    public static void swap(char[] chars, int left, int right) {
        char temp = chars[left];
        chars[left] = chars[right];
        chars[right] = temp;
    }
}
