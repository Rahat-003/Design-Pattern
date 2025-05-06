package com.example.designpattern.IteratorPattern.Without;

public class WithoutIteratorPattern {
    public static void main(String[] args) {
        System.out.println("-------- Without Iterator Pattern -------");

        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(new Book("C++ Book"));
        bookCollection.addBook(new Book("Java Book"));
        bookCollection.addBook(new Book("Python Book"));


        for(int i = 0; i < bookCollection.getBooks().size(); i++) {
            System.out.println(bookCollection.getBooks().get(i));
        }
    }
}
