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
        //实例化不同的car对象
        Car2 car0 = new Car2(-1);
        car0.getAir().flow();
        Car2 car1 = new Car2(20);
        car1.getAir().flow();
        Car2 car2 = new Car2(60);
        car2.getAir().flow();
        new Car2(30).getAir().flow();
        new Car2(40).getAir().flow();
        new Car2(50).getAir().flow();
    }
}

/*
有一个Car2类，有属性temperature（温度），车内有Air（空调）类，有吹风的功能flow，
Air会监视车内的温度，如果温度超过40度则吹冷气。如果温度低于0度则吹暖气，
如果在这之间则关掉空调。实例化具有不同温度的Car对象，调用空调的flow方法，
测试空调吹的风是否正确 . //体现 类与类的包含关系的案例 类(内部类【成员内部类】)

 */
class Car2 {

    private final double temperature;

    public Car2(double temperature) {
        this.temperature = temperature;
    }

    //Air 成员内部类
    class Air {
        public void flow() {
            if (temperature > 40) {
                System.out.println("当前温度为" + temperature + "，空调吹冷气..");
            } else if (temperature < 0) {
                System.out.println("当前温度为" + temperature + "，空调吹暖气..");
            } else {
                System.out.println("当前温度为" + temperature + "，关闭空调..");
            }
        }
    }
    //返回一个Air对象
    public Air getAir() {
        return new Air();
    }
}
