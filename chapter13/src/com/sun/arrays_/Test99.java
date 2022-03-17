package com.sun.arrays_;

import java.util.Comparator;

/**
 * ClassName: Test99
 * Description:
 * date: 2022/3/17 17:15
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
// @SuppressWarnings({"all"})
public class Test99 {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦", 100);
        books[1] = new Book("金瓶梅", 90);
        books[2] = new Book("青年文摘", 5);
        books[3] = new Book("从入门到放弃", 300);
        sort2(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {

                Book book1 = (Book) o1;
                Book book2 = (Book) o2;
                System.out.println(Double.compare(book1.getPrice(), book2.getPrice()));
                return Double.compare(book1.getPrice(), book2.getPrice());
            }
        });
        for (Book book : books) {
            System.out.println(book);
        }
        sort1(books);
        for (Book book : books) {
            System.out.println(book);
        }

    }

    public static void sort1(Book[] books) {

        int lastPos = books.length - 1;
        int tempPos = 0;
        for (int i = 0; i < books.length - 1; i++) {
            boolean flag = false;//标记是否发生交换
            for (int j = 0; j < lastPos; j++) {
                if (books[j].getPrice() < books[j + 1].getPrice()) {
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                    tempPos = j;
                    flag = true;
                }
            }
            lastPos = tempPos;
            if (!flag) {
                break;
            }

        }
    }
    public static void sort2(Book[] books, Comparator c) {
        Book temp;
        for (int i = 0; i < books.length - 1; i++) {
            boolean flag = false;//标记是否发生交换
            for (int j = 0; j < books.length - 1 - i; j++) {
                if (c.compare(books[j], books[j + 1]) > 0) {
                    temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }

        }
    }
}

class Book {
    private final String name;
    private final int price;
    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
}
