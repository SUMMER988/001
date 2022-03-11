package com.sun.final_;

public class FinalDetail02 {
    public static void main(String[] args) {
        System.out.println(BBB.num);
    }
}

//final 和 static 往往搭配使用，效率更高，不会导致类加载.底层编译器做了优化处理
class BBB {
    public final static int num = 100;

    static {
        System.out.println("BBB静态代码块被执行");
    }
}

final class AAA {
    public void cry() {

    }
}
