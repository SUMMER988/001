package com.sun.set_;

import java.util.HashSet;
import java.util.Set;

/**
 * ClassName: HashSet_
 * Description:
 * date: 2022/3/26 23:12
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
@SuppressWarnings({"all"})
public class HashSet_ {
    public static void main(String[] args) {
        //老韩解读
        //1. 构造器走的源码
        /*
            public HashSet() {
                map = new HashMap<>();
            }
         2. HashSet 可以存放null ,但是只能有一个null,即元素不能重复
         */
        Set hashSet = new HashSet();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add("AA");
        System.out.println(hashSet.add(null));
        System.out.println(hashSet.add(null));
        System.out.println("hashSet=" + hashSet);
    }
}
