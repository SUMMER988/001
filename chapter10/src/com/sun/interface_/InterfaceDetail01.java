package com.sun.interface_;

interface IA {
    void say();
    void hi();
}

public class InterfaceDetail01 {
    public static void main(String[] args) {
        //new IA();
        Cat cat = new Cat();
        t(cat);
    }

    public static void t(IA ia) {
        ia.hi();
        ia.say();
    }
}

class Cat implements IA {

    @Override
    public void say() {
        System.out.println("say()...");
    }

    @Override
    public void hi() {
        System.out.println("hi()...");
    }
}
