package com.sun.codeblock;

public class CodeBlockExercise02 {

}

class Sample {
    Sample(String s) {
        System.out.println(s);
    }

    Sample() {
        System.out.println("Sample默认构造函数被调用");
    }
}

class Test {
    static Sample sam = new Sample("静态成员sam初始化");

    static {
        System.out.println("static块执行");//
        if (sam == null) {
            System.out.println("sam is null");
        }
    }

    Sample sam1 = new Sample("sam1成员初始化");

    Test() {
        System.out.println("Test默认构造函数被调用");//
    }

    //主方法
    public static void main(String[] args) {
        Test a = new Test();//无参构造器
    }

}


