package com.sun.interface_;

public class InterfacePolyParameter {
    public static void main(String[] args) {
        IF if01 = new Monster();
        ((Monster) if01).cry();
        if01 = new Car();
        ((Car) if01).run();
        AAA aaa = new BBB();
        aaa = new CCC();

    }
}

interface IF {
}
class Monster implements IF {
    public void cry() {
        System.out.println("Monster is crying...");
    }
}
class Car implements IF {
    public void run() {
        System.out.println("Car is running...");
    }
}
class AAA {

}
class BBB extends AAA {

}
class CCC extends AAA {

}
