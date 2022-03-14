package com.sun.try_;

/**
 * ClassName: TryCatchDetail02
 * Description:
 * date: 2022/3/14 11:02
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
public class TryCatchDetail02 {
    public static void main(String[] args) {
        try {
            Person person = new Person();
            person = null;
            System.out.println(person.getName());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("程序执行中...");
        }
        System.out.println("程序继续执行...");
    }
}

class Person {
    private String name = "sun";

    public String getName() {
        return name;
    }
}
