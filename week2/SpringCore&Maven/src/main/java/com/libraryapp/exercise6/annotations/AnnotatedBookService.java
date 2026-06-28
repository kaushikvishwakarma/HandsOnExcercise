package com.libraryapp.exercise6.annotations;

import org.springframework.stereotype.Service;

@Service
public class AnnotatedBookService {

    private final AnnotatedBookRepository annotatedBookRepository;

    public AnnotatedBookService(AnnotatedBookRepository annotatedBookRepository) {
        this.annotatedBookRepository = annotatedBookRepository;
    }

    public String listTitles() {
        return String.join(", ", annotatedBookRepository.findAllTitles());
    }
}