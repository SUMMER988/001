package com.sun.math_;

import java.util.Arrays;

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

        String str = "ABCDEFG";
        char[] chars = str.toCharArray();
        Arrays.sort(chars, 0, 3);
        System.out.println(Arrays.toString(chars));

    }

}
