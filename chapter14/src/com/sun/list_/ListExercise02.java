package com.sun.list_;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * ClassName: ListExercise02
 * Description:
 * date: 2022/3/20 12:17
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
@SuppressWarnings({"all"})
public class ListExercise02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("三国志", "罗贯中", 80));
        list.add(new Book("水浒传", "施耐庵", 19));
        list.add(new Book("西游记", "吴承恩", 10));
        list.add(new Book("红楼梦", "曹雪芹", 100));
        for (Object book : list) {
            System.out.println(book);
        }
        sort(list);
        printList(list);

        // sort1(list, new Comparator() {
        //     @Override
        //     public int compare(Object o1, Object o2) {
        //         Book book1 = (Book) o1;
        //         Book book2 = (Book) o2;
        //         return Integer.compare(book1.getPrice(), book2.getPrice());
        //     }
        // });

    }
    // 冒泡排序
    // 静态方法
    public static void sort(List list) {
        int sortCount = 0;
        int pos = 0;
        int lastPos = list.size() - 1;
        for (int i = 0; i < list.size() - 1; i++) {
            sortCount++;
            boolean flag = false;
            for (int j = 0; j < lastPos; j++) {
                Book book = (Book) list.get(j);
                Book book1 = (Book) list.get(j + 1);
                if (book.getPrice() > book1.getPrice()) {
                    list.set(j, book1);
                    list.set(j + 1, book);
                    flag = true;
                    pos = j;

                }
            }
            if (!flag) {
                System.out.println("sortCount = " + sortCount);
                break;
            }
            lastPos = pos;
        }

    }

    // 冒泡排序
    // 静态方法 + 匿名内部类
    public static void sort1(List list, Comparator c) {
        int sortCount = 0;
        int pos = 0;
        int lastPos = list.size() - 1;
        for (int i = 0; i < list.size() - 1; i++) {
            sortCount++;
            boolean flag = false;
            for (int j = 0; j < lastPos; j++) {
                Book book = (Book) list.get(j);
                Book book1 = (Book) list.get(j + 1);
                if (c.compare(book, book1) > 0) {
                    list.set(j, book1);
                    list.set(j + 1, book);
                    flag = true;
                    pos = j;
                }
            }
            if (!flag) {
                break;
            }
            System.out.println("sortCount = " + sortCount);
            printList(list);
            lastPos = pos;
        }

    }

    public static void sort2(List list) {
        // int sortCount = 0;
        int pos = 0;
        int lastPos = list.size() - 1;
        while (true) {
            // sortCount++;
            for (int i = 0; i < lastPos; i++) {
                Book book = (Book) list.get(i);
                Book book1 = (Book) list.get(i + 1);
                if (book.getPrice() > book1.getPrice()) {
                    list.set(i, book1);
                    list.set(i + 1, book);
                    pos = i;
                }
            }

            if (lastPos == pos) {
                // System.out.println(sortCount);
                break;
            }
            lastPos = pos;
        }

    }

    public static void printList(List list) {
        System.out.println("====排序后====");
        for (Object book : list) {
            System.out.println(book);
        }

    }
}

class Book {
    private final String name;
    private final String author;
    private int price;
    public Book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "名称：" + name + "\t\t" +
                "作者：" + author + "\t\t" +
                "价格：" + price;
    }
}
