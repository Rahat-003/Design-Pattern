package com.example.designpattern.IteratorPattern.With;


import com.example.designpattern.IteratorPattern.Without.Book;

import java.util.*;

// There is a Iterable interface for implementing iterator pattern
public class BookCollectionV3 implements Iterable<Book> {

    private Set<Book> books = new TreeSet<>();

    public void addBook(Book book) {
        books.add(book);
    }


    @Override
    public Iterator<Book> iterator() {
        return books.iterator();
    }

//    Doesn't require following class

//    private class BookIterator implements Iterator<Book> {
//        private int index = 0;
//
//        @Override
//        public boolean hasNext() {
//            return index < books.size();
//        }
//
//        @Override
//        public Book next() {
//            return books.get(index++);
//        }
//    }
}
