package com.sun.innerclass;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f2();
        System.out.println(outer05);
    }
}

class Outer05 {
    private final int N1 = 99;
    public void f1() {
    }

    public void f2() {
        // 创建一个基于类的匿名内部类
        // 不能添加访问修饰符,因为它的地位就是一个局部变量
        // 作用域 : 仅仅在定义它的方法或代码块中
        Person person = new Person() {
            final int N1 = 9999;
            @Override
            public void hi() {
                // 可以直接访问外部类的所有成员，包含私有的
                // 如果外部类和匿名内部类的成员重名时，匿名内部类访问的话，
                // 默认遵循就近原则，如果想访问外部类的成员，
                // 则可以使用 （外部类名.this.成员）去访问
                System.out.println("匿名内部类重写了hi()方法，N1 = " + N1);
                System.out.println("f1().n1 = " + N1);
                System.out.println("Outer05.this.N1 = " + Outer05.this.N1);
                System.out.println(Outer05.this);
            }
        };
        System.out.println(person.getClass());
        person.hi();//动态绑定, 运行类型是 Outer05$1

        // new Person() {
        //     @Override
        //     public void hi() {
        //         System.out.println("匿名内部类重写了hi()方法,n1=" + n1);
        //     }
        //     @Override
        //     public void ok(String str) {
        //         super.ok(str);
        //     }
        // }.ok("sun");

    }
}

class Person {
    public void hi() {
        System.out.println("Person hi()");
    }
    public void ok(String str) {
        System.out.println("Person ok()" + str);
    }
}
