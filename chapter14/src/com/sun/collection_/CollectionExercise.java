package com.sun.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName: CollectionExercise
 * Description:
 * date: 2022/3/20 11:12
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
@SuppressWarnings({"all"})
public class CollectionExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(Dog.getInstance("A", 3));
        list.add(Dog.getInstance("B", 1));
        list.add(Dog.getInstance("C", 2));
        System.out.println(list);
        for (Object dog : list) {
            System.out.println(dog);
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object dog = iterator.next();
            System.out.println(dog);
        }
        iterator = list.iterator();
        while (iterator.hasNext()) {
            Object dog = iterator.next();

            System.out.println(dog);
        }

    }
}

class Dog {
    private final String name;
    private int age;
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    private Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static Dog getInstance(String name, int age) {
        return new Dog(name, age);
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
