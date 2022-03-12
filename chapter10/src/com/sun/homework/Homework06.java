package com.sun.homework;

/**
 * ClassName: Homework06
 * Description:
 * date: 2022/3/12 17:28
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
public class Homework06 {
    public static void main(String[] args) {
        Person person = new Person("唐僧", VehiclesFactory.getHorse());
        person.common();
        person.passRiver();

    }
}

