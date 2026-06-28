package com.libraryapp.exercise2.di;

public interface BookRepository {

    void save(String isbn, String title);

    String findTitleByIsbn(String isbn);

    int totalBooks();
}