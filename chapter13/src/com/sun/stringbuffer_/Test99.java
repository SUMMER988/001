package com.sun.stringbuffer_;

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
        StringBuffer stringBuffer = new StringBuffer("hello");
        System.out.println(stringBuffer.capacity());
        StringBuffer stringBuffer01 = new StringBuffer(100);
        System.out.println(stringBuffer01.capacity());
        System.out.println(stringBuffer01.length());

    }
}
