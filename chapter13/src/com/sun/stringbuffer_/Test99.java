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
        String str = null;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        System.out.println(stringBuffer);

        try {
            StringBuffer stringBuffer1 = new StringBuffer(str);
            System.out.println(stringBuffer1);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("执行...");
        }
        System.out.println("继续执行...");
    }
}
