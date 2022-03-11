package com.sun.abstract_;

public class AbstractDetail02 {
    public static void main(String[] args) {

    }
}

abstract class H {
    public abstract void hi();
}

abstract class E {
    public abstract void hi();
}

abstract class F extends E {
}

class G extends E {
    @Override
    public void hi() { //这里相等于G子类实现了父类E的抽象方法，所谓实现方法，就是有方法体

    }
}

//抽象类的本质还是类，所以可以有类的各种成员
abstract class D {
    public int n1 = 10;
    public static String name = "sun";

    public void hi() {
        System.out.println("hi");
    }

    public abstract void hello();

    public static void ok() {
        System.out.println("ok");
    }
}
