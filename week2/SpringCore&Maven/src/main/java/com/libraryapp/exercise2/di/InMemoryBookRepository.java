package com.libraryapp.exercise2.di;

import java.util.LinkedHashMap;
import java.util.Map;

public class InMemoryBookRepository implements BookRepository {

    private final Map<String, String> books = new LinkedHashMap<>();

    public InMemoryBookRepository() {
        books.put("9780132350884", "Clean Code");
        books.put("9780134494166", "Effective Java");
    }

    @Override
    public void save(String isbn, String title) {
        books.put(isbn, title);
    }

    @Override
    public String findTitleByIsbn(String isbn) {
        return books.get(isbn);
    }

    @Override
    public int totalBooks() {
        return books.size();
    }
}