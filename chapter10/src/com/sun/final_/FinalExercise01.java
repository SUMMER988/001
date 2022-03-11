package com.sun.final_;

public class FinalExercise01 {
    public static void main(String[] args) {
        System.out.println(new Circle(3).calArea());
        System.out.println(new Circle(4).calArea());
        System.out.println(new Circle(5).calArea());
    }
}

class Circle {
    private double radius;
    private final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calArea() {
        return radius * radius * PI;
    }
}
