package com.sun.codeblock;

public class CodeBlockDetail03 {
    public static void main(String[] args) {
        new BBB();
    }
}

class AAA {
    {
        System.out.println("AAA的普通代码块被调用");
    }

    public AAA() {
        System.out.println("AAA() is called");
    }

}

class BBB extends AAA {
    {
        System.out.println("BBB的普通代码块被调用");
    }

    public BBB() {
        System.out.println("BBB() is called");
    }
}
