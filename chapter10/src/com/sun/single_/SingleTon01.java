package com.sun.single_;

public class SingleTon01 {
    public static void main(String[] args) {
        // GirlFriend instance = GirlFriend.getInstance();
        // System.out.println(instance);
        // GirlFriend instance1 = GirlFriend.getInstance();
        // System.out.println(instance);
        // System.out.println(instance == instance1);
        System.out.println(GirlFriend.n1);
    }
}

class GirlFriend {
    private String name;
    public static int n1 = 100;

    private static GirlFriend girlFriend = new GirlFriend("RED");

    private GirlFriend(String name) {
        System.out.println("构造器被调用");
        this.name = name;
    }

    public static GirlFriend getInstance() {
        return girlFriend;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
