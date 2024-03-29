package com.sun.annotation_;

/**
 * ClassName: Override_
 * Description:
 * date: 2022/3/11 17:11
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
public class Override_ {
    public static void main(String[] args) {
        Son son = new Son();
        son.fly();
        son.say();
        System.out.println(son.num);
    }
}

class Father {//父类

    public int num = 0;
    public void fly() {
        int num = 0;
        System.out.println("Father fly...");
    }
    public void say() {
    }

}

class Son extends Father {//子类
    /*
    老韩解读
    1. @Override 注解放在fly方法上，表示子类的fly方法时重写了父类的fly
    2. 这里如果没有写 @Override 还是重写了父类fly
    3. 如果你写了@Override注解，编译器就会去检查该方法
       是否真的重写了父类的方法，如果的确重写了，
     则编译通过，如果没有构成重写，则编译错误
    4. 看看 @Override的定义
       解读： 如果发现 @interface 表示一个 注解类
        @Target(ElementType.METHOD)
        @Retention(RetentionPolicy.SOURCE)
        public @interface Override {
        }
     */
    @Override   //说明
    public void fly() {
        System.out.println("Son fly....");
    }
    @Override
    public void say() {
        System.out.println("Son say...");
    }
}

