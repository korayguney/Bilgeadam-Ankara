package com.bilgeadam.aggregationchallenge;

public class TestBookAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("J.K.Rowling", "j.k@rowling.org", 'f');
        Author author2 = new Author("J.R.R.Tolkien", "j.r.r@tolkien.org", 'm');
        Author[] authors = {author1, author2};
        // authors[0] = author1;
        // authors[1] = author2;

        Book book = new Book("Harry Potter and Philosophy Stone",
                            authors,
                            45.50,
                            100);

        System.out.println(book);

    }
}
