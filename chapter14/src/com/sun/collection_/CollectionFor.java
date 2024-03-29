package com.sun.collection_;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ClassName: CollectionFor
 * Description: 增强for循环，底层仍然是迭代器，适用于Collection，数组
 * date: 2022/3/20 11:06
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
@SuppressWarnings({"all"})
public class CollectionFor {
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("三国演义", "罗贯中", 10.1));
        col.add(new Book("小李飞刀", "古龙", 5.1));
        col.add(new Book("红楼梦", "曹雪芹", 34.6));

        // 老韩解读
        // 1. 使用增强for, 在Collection集合
        // 2. 增强for， 底层仍然是迭代器
        // 3. 增强for可以理解成就是简化版本的 迭代器遍历
        // 4. 快捷键方式 iter
        // for (Object book : col) {
        //    System.out.println("book=" + book);
        // }
        for (Object o : col) {
            System.out.println("book=" + o);
        }

        //  增强for，也可以直接在数组使用
        // int[] nums = {1, 8, 10, 90};
        // for (int num : nums) {
        //     System.out.println(num);
        // }

    }
}

