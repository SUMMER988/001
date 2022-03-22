package com.sun.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * ClassName: Test99
 * Description:
 * date: 2022/3/20 18:07
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
@SuppressWarnings({"all"})
public class Test99 {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("1");
        set.add("2");
        set.add("4");
        set.add("6");
        set.add(false);
        set.add(true);
        set.add(null);
        set.add("1");
        set.add("2");
        System.out.println(set);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj = " + obj);
        }
        set.remove(null);
        set.remove(false);
        System.out.println("增强for循环");
        for (Object obj : set) {
            System.out.println("obj = " + obj);
        }

    }
}
