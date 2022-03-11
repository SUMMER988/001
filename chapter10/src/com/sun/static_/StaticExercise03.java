package com.sun.static_;

public class StaticExercise03 {

}

class Person {
    private static int total = 0;
    private int id;

    public Person() {
        total++;
        id = total;
    }

    public static void setTotalPerson(int total) {
        Person.total = total;
    }

    public static void showTotal() {
        System.out.println("The total is " + total);
    }
}

class TestPerson {
    public static void main(String[] args) {
        Person.setTotalPerson(3);
        new Person();
        Person.showTotal();
        new Person();
        Person.showTotal();
        new Person();
        Person.showTotal();
        new Person();
        Person.showTotal();
    }
}
