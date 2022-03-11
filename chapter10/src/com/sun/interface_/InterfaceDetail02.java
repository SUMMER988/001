package com.sun.interface_;

interface IB {
    //接口中的属性,只能是final的，而且是 public static final 修饰符
    int n1 = 10; //等价 public static final int n1 = 10;
    void hi();
}

interface IC {
    void say();
}

interface ID extends IB, IC {

}

public class InterfaceDetail02 {
    public static void main(String[] args) {
        System.out.println(IB.n1);
        //IB.n1 = 30; n1 是final

    }
}

class IDD implements ID {

    @Override
    public void hi() {

    }
    @Override
    public void say() {

    }
}

class Pig implements IB, IC {
    @Override
    public void hi() {

    }
    @Override
    public void say() {

    }
}

