package com.sun.enum_;

public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season.NUM0);
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
        System.out.println(Season.AUTUMN);
        System.out.println(Season.WINTER);
    }
}

class Season {
    public final static int NUM0 = 100;
    public final static String NAME0 = "123";
    public final static String NAME1 = null;
    public final static Season SPRING = new Season("春天", "温暖");
    public final static Season SUMMER = new Season("夏天", "温暖");
    public final static Season AUTUMN = new Season("秋天", "温暖");
    public final static Season WINTER = new Season("冬天", "温暖");
    public static int NUM1 = 200;

    static {
        System.out.println("静态代码块被执行");
    }

    private final String name;
    private final String desc;

    //1. 将构造器私有化,目的防止 直接 new
    //2. 去掉setXxx方法, 防止属性被修改
    //3. 在Season 内部，直接创建固定的对象
    //4. 优化，可以加入 final 修饰符

    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
    @Override
    public String toString() {

        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
    public String getName() {
        return name;
    }
    public String getDesc() {
        return desc;
    }
}

