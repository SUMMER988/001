package com.sun.interface_;

public class ExtendsVsInterface {
    public static void main(String[] args) {
        LittleMonkey wuKong = new LittleMonkey("悟空");
        wuKong.climbing();
        wuKong.swimming();
        wuKong.fly();
    }
}

class Monkey {
    private String name;
    public Monkey(String name) {
        this.name = name;
    }
    public void climbing() {
        System.out.println(name + "会爬树...");
    }
    @Override
    public String toString() {
        return "Monkey{" +
                "name='" + name + '\'' +
                '}';
    }
    public String getName() {
        return name;
    }
}
//接口
interface Fish {
    void swimming();
}
interface Bird {
    void fly();
}
class LittleMonkey extends Monkey implements Fish, Bird {

    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(getName() + "通过学习像鱼儿会游泳...");
    }
    @Override
    public void fly() {
        System.out.println(getName() + "通过学习像鸟儿会飞翔...");
    }
}
