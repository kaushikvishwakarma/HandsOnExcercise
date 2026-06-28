package com.libraryapp.exercise9.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibrarySpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibrarySpringBootApplication.class, args);
    }

    @Bean
    CommandLineRunner seedBooks(BookRepository bookRepository) {
        return args -> {
            if (bookRepository.count() == 0) {
                bookRepository.save(new Book(null, "Spring Boot in Action", "Craig Walls"));
                bookRepository.save(new Book(null, "Pro Spring 6", "Iuliana Cosmina"));
            }
        };
    }
}