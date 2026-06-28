package com.libraryapp.exercise1.basic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("exercise1-context.xml")) {
            LibraryService libraryService = context.getBean(LibraryService.class);
            System.out.println(libraryService.listBooks());
        }
    }
}