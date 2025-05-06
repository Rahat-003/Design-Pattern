package com.example.designpattern.IteratorPattern.With;

import com.example.designpattern.IteratorPattern.Without.Book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookCollectionV2 {
    private List<Book> books = new ArrayList<>();
    public void addBook(Book book){
        books.add(book);
    }
    public List<Book> getBooks() {
        return books;
    }

    public Iterator<Book> createIterator(){
        return new BookIterator(this.books);
    }

    // Another Class (Nested Class)
    private class BookIterator implements Iterator<Book> {
        private List<Book> books;
        private int index = 0;

        public BookIterator(List<Book> books){
            this.books = books;
        }


        @Override
        public boolean hasNext() {
            return index < books.size();
        }

        @Override
        public Book next() {
            return books.get(index++);
        }
    }
}
