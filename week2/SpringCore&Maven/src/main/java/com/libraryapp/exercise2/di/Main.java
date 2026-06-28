package com.libraryapp.exercise2.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("exercise2-context.xml")) {
            BookService bookService = context.getBean(BookService.class);
            System.out.println(bookService.createCatalogReport());
        }
    }
}