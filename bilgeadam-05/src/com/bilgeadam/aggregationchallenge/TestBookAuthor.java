package com.bilgeadam.aggregationchallenge;

public class TestBookAuthor {
    public static void main(String[] args) {
        Author author = new Author("J.K.Rowling", "j.k@rowling.org", 'f');
        Book book = new Book("Harry Potter and Philosophy Stone",
                            author,
                            45.50,
                            100);

        System.out.println(book);

    }
}
