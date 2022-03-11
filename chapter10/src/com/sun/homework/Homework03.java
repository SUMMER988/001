package com.sun.homework;

/**
 * ClassName: Homework03
 * Description:
 * date: 2022/3/12 1:26
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
// @SuppressWarnings({"all"})
public class Homework03 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat();
        animals[1] = new Cat();
        animals[2] = new Dog();
        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                ((Cat) animal).shout();
            }
            if (animal instanceof Dog) {
                ((Dog) animal).shout();
            }
        }
    }
}

abstract class Animal {
    abstract void shout();
}

class Cat extends Animal {
    @Override
    void shout() {
        System.out.println("喵喵喵");
    }
}

class Dog extends Animal {
    @Override
    void shout() {
        System.out.println("汪汪汪");
    }
}
