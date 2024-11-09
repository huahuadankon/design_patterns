package com.huahuadan.pattern.iterator;

import java.util.ArrayList;

/**
 *
 */
public class BookShelf implements Aggregate<Book> {
    private ArrayList<Book> books;
    public BookShelf(int initialsize) {         
        this.books = new ArrayList<>(initialsize);
    }                                           

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }

    @Override
    public Book getByIndex(int index) {
        return books.get(index);
    }

    @Override
    public void add(Book element) {
        books.add(element);
    }


    @Override
    public int size() {
        return books.size();
    }
}
