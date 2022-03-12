package com.sun.homework;

/**
 * ClassName: Homework07
 * Description:
 * date: 2022/3/12 22:56
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
public class Homework07 {
    public static void main(String[] args) {
        Car2 car2 = new Car2(50);
        car2.getAir().flow();
        Car2 car21 = new Car2(-1);
        car21.getAir().flow();
        Car2.Air air = new Car2(20).new Air();
        air.flow();
    }
}

class Car2 {
    private final double temperature;
    public Car2(double temperature) {
        this.temperature = temperature;
    }
    class Air {
        public void flow() {
            if (temperature > 40) {
                System.out.println("吹冷气");
            } else if (temperature < 0) {
                System.out.println("吹暖气");
            } else {
                System.out.println("温度正常，关闭空调");
            }
        }
    }

    public Air getAir() {
        return new Air();
    }
}
