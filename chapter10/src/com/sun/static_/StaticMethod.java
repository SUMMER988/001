package com.sun.static_;

public class StaticMethod {
    public static void main(String[] args) {
        Stu tom = new Stu("Tom");
        Stu.payFee(100);
        Stu.showFee();
        Stu sun = new Stu("Sun");
        Stu.payFee(200);
        Stu.showFee();
        Stu mike = new Stu("Mike");
        Stu.payFee(300);
        Stu.showFee();
        System.out.println(CalTools.calSum(1, 2, 3));
    }
}

class CalTools {
    public static double calSum(double... n1) {
        double sum = 0;
        for (double num : n1) {
            sum += num;
        }
        return sum;
    }
}

class Stu {
    private static double fee = 0;

    public Stu(String name) {
    }

    public static double getFee() {
        return fee;
    }

    public static void payFee(double fee) {
        Stu.fee += fee;
    }

    public static void showFee() {
        System.out.println("总学费为" + Stu.fee);
    }
}

class AA {
    public String name;
    public double fee;

    public AA(String name, double fee) {
        this.name = name;
        this.fee = fee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "AA{" +
                "name='" + name + '\'' +
                ", fee=" + fee +
                '}';
    }
}
