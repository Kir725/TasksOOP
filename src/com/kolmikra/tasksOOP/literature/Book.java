package com.kolmikra.tasksOOP.literature;

import java.util.Arrays;
import java.util.Objects;

public class Book {
    private String name;
    private double price;
    private Author[] authors;
    private int qty;

    public Book(String name, double price, Author[] authors) {
        this.name = name;
        this.price = price;
        this.authors = authors;
    }

    public Book(String name, double price, Author[] authors, int qty) {
        this.name = name;
        this.price = price;
        this.authors = authors;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {

        String authorsList = "";
        for (Author author : authors) {
            authorsList += author.toString();
        }

        return "Book[name=" + name + ", authors{" + authorsList + "}, price=" + price + ", qty=" + qty + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return name.equals(book.name) &&
                Arrays.equals(authors, book.authors);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = 31 * result + Arrays.hashCode(authors);
        return result;
    }

    public String getAuthorNames() {
        String authorNames = "";
        for (Author author : authors) {
            authorNames += author.getName() + " ";
        }
        return authorNames;
    }
}
