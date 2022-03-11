package com.sun.interface_;

interface IH {
    void say();
}

interface IG extends IH {
}

public class InterfacePolyPass {
    public static void main(String[] args) {
        //接口类型的变量可以指向，实现了该接口的类的对象实例
        IG ig = new Teacher();
        ig.say();
        //如果IG 继承了 IH 接口，而Teacher 类实现了 IG接口
        //那么，实际上就相当于 Teacher 类也实现了 IH接口.
        //这就是所谓的 接口多态传递现象.
        IH ih = new Teacher();
        ih.say();
        t(ig);
        t(ih);
    }

    public static void t(IH ih) {
        ih.say();
    }

}

class Teacher implements IG {
    @Override
    public void say() {
        System.out.println("Teacher is saying...");
    }
}
