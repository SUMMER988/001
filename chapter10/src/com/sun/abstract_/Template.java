package com.sun.abstract_;

public class Template {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.calculateTime();
        BB bb = new BB();
        bb.calculateTime();
    }
}

class AA extends Base {

    public void job() {
        long num = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            num += i;
        }
        System.out.println(num);
    }

}

class BB extends Base {

    public void job() {
        long num = 1;
        for (int i = 1; i < Integer.MAX_VALUE >> 6; i++) {
            num += i;
        }
        System.out.println(num);
    }

}

abstract class Base {
    public abstract void job();

    public void calculateTime() {
        long startTime = System.currentTimeMillis();
        job();
        long endTime = System.currentTimeMillis();
        System.out.println("任务执行时间为" + (endTime - startTime) + "ms");
    }
}
