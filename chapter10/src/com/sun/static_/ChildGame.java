package com.sun.static_;

public class ChildGame {
    public static void main(String[] args) {
        Child child0 = new Child("白骨精");
        child0.join();
        Child.totalNum++;

        Child child1 = new Child("狐狸精");
        child1.join();
        Child.totalNum++;

        System.out.println("The totalNum is " + Child.totalNum);

    }
}

class Child {
    public static int totalNum = 0;
    private String name;

    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + "加入游戏");
    }
}
