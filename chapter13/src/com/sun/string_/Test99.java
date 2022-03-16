package com.sun.string_;

/**
 * ClassName: Test99
 * Description:
 * date: 2022/3/17 0:43
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
public class Test99 {
    public static void main(String[] args) {
        String str1 = "sun";
        String str2 = "sun";
        str2 = str2.toUpperCase();
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        String name = "john";
        if ("johN".equalsIgnoreCase(name)) {
            System.out.println("Success!");
        } else {
            System.out.println("Failure!");
        }
        System.out.println("韩顺平".length());
        String s1 = "wer@terwe@g";
        int index = s1.indexOf("@");
        System.out.println(index);
        int lastIndex = s1.lastIndexOf("@");
        System.out.println(lastIndex);
        System.out.println("@g@@g@@g@@g@h".indexOf("@@g@@g@h"));
        s1 = "wer@terwe@g@";
        lastIndex = s1.lastIndexOf('@');
        System.out.println(lastIndex);
        System.out.println(s1.indexOf("ter"));
        String name0 = "张三";
        StringBuffer stringBuffer = new StringBuffer(name0);
        stringBuffer.insert(0, "1234");
        System.out.println(stringBuffer);
        name0 = stringBuffer.toString();
        System.out.println(name0.substring(4));
        System.out.println(name0);
        System.out.println(name0.substring(2, 4));
    }
}
