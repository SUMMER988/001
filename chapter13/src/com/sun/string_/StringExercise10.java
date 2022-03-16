package com.sun.string_;

/**
 * ClassName: StringExercise10
 * Description:
 * date: 2022/3/17 0:26
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
public class StringExercise10 {
    public static void main(String[] args) {

    }
}

class Test1 {
    String str = new String("hsp");
    final char[] ch = {'j', 'a', 'v', 'a'};

    public void change(String str, char ch[]) {
        str = "java";
        ch[0] = 'h';
    }

    public static void main(String[] args) {
        Test1 ex = new Test1();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str + " and ");
        System.out.println(ex.ch);
    }
}
