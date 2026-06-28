package com.libraryapp.exercise7.injection;

public class ConstructorInjectedBookService {

    private final SharedBookRepository sharedBookRepository;

    public ConstructorInjectedBookService(SharedBookRepository sharedBookRepository) {
        this.sharedBookRepository = sharedBookRepository;
    }

    public String describeBook() {
        return "Constructor injection picked: " + sharedBookRepository.getPrimaryTitle();
    }
}