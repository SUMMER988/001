package com.sun.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName: Test99
 * Description:
 * date: 2022/3/20 0:07
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
@SuppressWarnings({"all"})
public class Test99 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(Dog.getInstance("A", 1));
        list.add(Dog.getInstance("B", 2));
        list.add(Dog.getInstance("C", 3));

        for (Object o : list) {
            System.out.println(o);

        }

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object dog = iterator.next();
            System.out.println(dog);
        }

    }
}

class Dog {
    private final String name;
    private final int age;
    private Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public static Dog getInstance(String name, int age) {
        return new Dog(name, age);
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
