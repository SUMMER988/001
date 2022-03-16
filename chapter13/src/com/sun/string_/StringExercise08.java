package com.sun.string_;

/**
 * ClassName: StringExercise08
 * Description:
 * date: 2022/3/15 21:54
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
public class StringExercise08 {
    public static void main(String[] args) {
        String a = "hello"; //创建 a对象
        String b = "abc";//创建 b对象
        String c = a + b;
        StringBuilder str = new StringBuilder();
        str.append(1);
        str.append(1);
        str.append(1);
        str.append(1);
        System.out.println(str);

        // String d = "helloabc";
        // System.out.println(c == d);//真还是假? 是false
        // String e = "hello" + "abc";//直接看池， e指向常量池
        // System.out.println(d == e);//真还是假? 是true
    }
}
