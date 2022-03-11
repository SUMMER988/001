package com.sun.abstract_;

public class AbstractExercise01 {
    public static void main(String[] args) {
        Manager sun = new Manager("sun", 999, 50000);
        sun.setBonus(8000);
        sun.work();
        CommonEmployee Tom = new CommonEmployee("Tom", 888, 20000);
        Tom.work();
    }
}

