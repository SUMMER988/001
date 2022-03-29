package com.sun.set_;

/**
 * ClassName: OutClass
 * Description:
 * date: 2022/3/29 20:03
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
@SuppressWarnings({"all"})
public class OutClass extends Father {
    public void test() {
        class InnerClass {
            private String name;
            final static String test = "1";
            public InnerClass(String name) {
                super();
                this.name = name;
            }
            public void say(String str) {
                System.out.println(name + ":" + str);
            }
        }
        new InnerClass("test").say("hello");
    }

    public static void main(String[] args) {
        new OutClass().test();
    }
}

class Father {
    private String hobby;
    public Father() {
        System.out.println("调用父类无参构造器");
    }
    public Father(String hobby) {
        this.hobby = hobby;
    }
    public String getHobby() {
        return hobby;
    }
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
