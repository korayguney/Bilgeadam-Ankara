package com.bilgeadam.aggregationchallenge;

public class Book {
    private String name;
    private Author[] authorArray;
    private double price;
    private int qty;

    public Book(String name, Author[] author, double price, int qty) {
        this.name = name;
        this.authorArray = author;
        this.price = price;
        this.qty = qty;
    }

    public Book(String name, Author[] author, double price) {
        this.name = name;
        this.authorArray = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthorArray() {
        return authorArray;
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
        StringBuilder authorStr = new StringBuilder();
        for (Author author : authorArray) {
            authorStr.append(author);
        }

        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + authorStr +
                // ", author=" + Arrays.toString(author) +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
