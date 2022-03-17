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
        String str = "YouAreWellcome";
        StringBuffer stringBuffer = new StringBuffer(str);

        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1.append(str);

        StringBuffer stringBuffer2 = new StringBuffer("sun");
        String s = stringBuffer2.toString();
        String s1 = new String(stringBuffer2);
        System.out.println(s1);

    }
}
