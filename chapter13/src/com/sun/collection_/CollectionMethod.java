package com.sun.collection_;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: CollectionMethod
 * Description:
 * date: 2022/3/20 1:25
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
@SuppressWarnings({"all"})
public class CollectionMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("sun");
        list.add(10);
        list.add(true);
        System.out.println("list = " + list);
    }
}
