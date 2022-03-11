package com.sun.final_;

public class FinalDetail01 {
    public static void main(String[] args) {
        CC cc = new CC();
        new EE().cal();
    }
}

class AA {
    /*
    1. 定义时：如 public final double TAX_RATE=0.08;
    2. 在构造器中
    3. 在代码块中
     */
    public final double TAX_RATE = 0.08;//1.定义时赋值
    public final double TAX_RATE2;
    public final double TAX_RATE3;

    {
        TAX_RATE3 = 1.2;
    }

    public AA() {
        TAX_RATE2 = 1.1;
    }
}

class BB {
    /*
    如果final修饰的属性是静态的，则初始化的位置只能是
    1 定义时  2 在静态代码块 不能在构造器中赋值。
     */
    public static final double TAX_RATE = 99.9;
    public static final double TAX_RATE2;
    // public static final double TAX_RATE3;
    //
    // public BB() {
    //     TAX_RATE3 = 8.8;
    // }

    static {
        TAX_RATE2 = 3.3;
    }

}

final class CC {

}

class DD {
    public final void cal() {
        System.out.println("cal()...");
    }
}

class EE extends DD {

}
