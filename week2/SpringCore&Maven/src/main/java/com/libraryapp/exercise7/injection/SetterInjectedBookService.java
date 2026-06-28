package com.libraryapp.exercise7.injection;

public class SetterInjectedBookService {

    private SharedBookRepository bookRepository;

    public void setBookRepository(SharedBookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public String describeBook() {
        return "Setter injection picked: " + bookRepository.getPrimaryTitle();
    }
}