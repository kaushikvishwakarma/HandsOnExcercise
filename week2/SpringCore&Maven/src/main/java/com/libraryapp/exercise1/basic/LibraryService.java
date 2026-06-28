package com.libraryapp.exercise1.basic;

public class LibraryService {

    private final LibraryRepository libraryRepository;

    public LibraryService(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    public String listBooks() {
        return String.join(", ", libraryRepository.getAvailableBooks());
    }
}