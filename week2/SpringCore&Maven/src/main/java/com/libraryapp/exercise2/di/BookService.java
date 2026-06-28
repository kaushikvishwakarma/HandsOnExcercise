package com.libraryapp.exercise2.di;

public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public String createCatalogReport() {
        return "Total books: " + bookRepository.totalBooks() + ", Clean Code title: " + bookRepository.findTitleByIsbn("9780132350884");
    }
}