package com.sun.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
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
        Set<String> strings = new HashSet<String>();
        strings.add("AA");
        strings.add("DD");
        strings.add("BB");
        strings.add("EE");
        strings.add("AA");
        strings.add(null);
        System.out.println("======");
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println("======");
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("======");
        strings.remove(null);
        System.out.println(strings);
        strings.add("FF");
        System.out.println(strings);
        System.out.println("请输入要删除的字符串");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        if (strings.remove(str)) {
            String s = String.format("删除%s成功", str);
            System.out.println(s);
            System.out.println(strings);
        } else {
            System.out.println("删除失败");
        }
    }
}
