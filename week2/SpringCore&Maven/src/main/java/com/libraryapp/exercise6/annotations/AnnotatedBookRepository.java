package com.libraryapp.exercise6.annotations;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class AnnotatedBookRepository {

    public List<String> findAllTitles() {
        return List.of("Spring in Action", "Java Concurrency in Practice", "Patterns of Enterprise Application Architecture");
    }
}