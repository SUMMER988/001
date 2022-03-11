package com.sun.homework;

/**
 * ClassName: Homework01
 * Description:
 * date: 2022/3/12 0:57
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
public class Homework01 {
    public static void main(String[] args) {
        Car c = new Car();
        Car c1 = new Car(100);
        System.out.println(c);//9.0,red
        System.out.println(c1);//100.0,red

    }
}

class Car {
    static String color = "white";
    double price = 10;
    public Car() {
        this.price = 9;
        color = "red";
    }
    public Car(double price) {
        this.price = price;
    }
    public String toString() {
        return price + "\t" + color;
    }
}


