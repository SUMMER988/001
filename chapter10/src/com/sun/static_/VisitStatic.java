package com.sun.static_;

public class VisitStatic {
    public static void main(String[] args) {
        //类名.类变量名（静态变量名）
        //说明：类变量是随着类的加载而创建，所以即使没有创建对象实例也可以访问

        System.out.println(A.name);
        //'age' 在 'com.sun.static_.A' 中具有 private 访问权限
        //System.out.println(A.age);
        System.out.println(A.getAge());
    }
}

class A {
    public static String name = "Sun";
    private static int age = 20;

    public static int getAge() {
        return age;
    }

    public void setAge(int age) {
        A.age = age;
    }

    public void setName(String name) {
        A.name = name;
    }
}
