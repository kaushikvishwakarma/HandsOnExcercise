package com.libraryapp.exercise6.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class)) {
            AnnotatedBookService annotatedBookService = context.getBean(AnnotatedBookService.class);
            System.out.println(annotatedBookService.listTitles());
        }
    }
}