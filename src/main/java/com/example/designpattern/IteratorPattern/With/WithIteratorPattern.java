package com.example.designpattern.IteratorPattern.With;


import com.example.designpattern.IteratorPattern.Without.Book;

import java.util.Iterator;

public class WithIteratorPattern {
    public static void main(String[] args) {
        System.out.println("-------- With Iterator Pattern -------");

        BookCollectionV2 bookCollection = new BookCollectionV2();

        bookCollection.addBook(new Book("C++ Book"));
        bookCollection.addBook(new Book("Java 8 Book"));
        bookCollection.addBook(new Book("Python Book"));

        Iterator<Book> iterator = bookCollection.createIterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book);
        }

        System.out.println("\n-------- Iterator Pattern by implementing builtIn Java inerface --------");

        BookCollectionV3 bookCollectionV3 = new BookCollectionV3();

        bookCollectionV3.addBook(new Book("NodeJS 23 Book"));
        bookCollectionV3.addBook(new Book("Java 17 Book"));
        bookCollectionV3.addBook(new Book("GoLang Book"));

        Iterator<Book> iterator3 = bookCollectionV3.iterator();


        while (iterator3.hasNext()) {
            Book book = iterator3.next();
            System.out.println(book);
        }

//        for (int i = 0; i < bookCollection.getBooks().size(); i++) {
//            System.out.println(bookCollection.getBooks().get(i));
//        }

    }
}
