package com.sun.string_;

/**
 * ClassName: StringExercise03
 * Description:
 * date: 2022/3/15 20:25
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
public class StringExercise03 {
    public static void main(String[] args) {
        String a = "sun";
        String b = new String("sun");
        System.out.println(a.equals(b));
        System.out.println(a == b);
        System.out.println(a == b.intern());
        System.out.println(b == b.intern());
    }
}
