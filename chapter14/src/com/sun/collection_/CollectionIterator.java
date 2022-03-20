package com.sun.collection_;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ClassName: CollectionIterator
 * Description:
 * date: 2022/3/20 10:39
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
@SuppressWarnings({"all"})
public class CollectionIterator {
    public static void main(String[] args) {

        Collection col = new ArrayList();

        col.add(Book.getInstance("三国演义", "罗贯中", 10.1));
        col.add(Book.getInstance("小李飞刀", "古龙", 5.1));
        col.add(Book.getInstance("红楼梦", "曹雪芹", 34.6));
        System.out.println(col);
        for (Object obj : col) {
            System.out.println(obj);

        }
    }
}

class Book {
    private final String name;
    private final String author;
    private double price;
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
    private Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public static Book getInstance(String name, String author, double price) {
        return new Book(name, author, price);
    }
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
}
