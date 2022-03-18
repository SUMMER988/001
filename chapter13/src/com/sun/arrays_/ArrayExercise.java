package com.sun.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ClassName: ArrayExercise
 * Description:
 * date: 2022/3/18 22:24
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
@SuppressWarnings({"all"})
public class ArrayExercise {
    public static void main(String[] args) {

        Book[] books = new Book[4];
        books[0] = new Book("红楼梦", 100);
        books[1] = new Book("金瓶梅新", 90);
        books[2] = new Book("青年文摘20年", 5);
        books[3] = new Book("java从入门到放弃~", 300);
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Integer.compare(o1.getName().length(), o2.getName().length());
            }
        });
        for (Book book : books) {
            System.out.println(book);
        }
        //直接反转数组
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return -1;
            }
        });
        for (Book book : books) {
            System.out.println(book);
        }

    }
}

class Book {
    private final String name;
    private final double price;
    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
