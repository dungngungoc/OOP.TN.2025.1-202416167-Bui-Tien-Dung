package com.hust.kstn.test;

import com.hust.kstn.models.Book;
import com.hust.kstn.models.BookAuthor;
import java.util.ArrayList;
import java.util.List;

public class BookTest {

    public static void main(String[] args) {
        BookAuthor author1 = new BookAuthor("Joshua Bloch", 1961, "Effective Java author");
        
        List<BookAuthor> authors = new ArrayList<>();
        authors.add(author1);

        Book book1 = new Book("Effective Java", "Programming", 45.99, 50000, authors);

        System.out.println(book1.toString());
    }
}