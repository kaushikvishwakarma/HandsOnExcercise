package com.libraryapp.exercise3.logging;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LoggingConfig.class)) {
            LibraryPerformanceService performanceService = context.getBean(LibraryPerformanceService.class);
            System.out.println(performanceService.loadCatalog());
            System.out.println(performanceService.searchByTitle("Clean Code"));
        }
    }
}