package com.libraryapp.exercise8.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class)) {
            LibraryTransactionService transactionService = context.getBean(LibraryTransactionService.class);
            System.out.println(transactionService.borrowBook("Ava", "Clean Code"));
            System.out.println(transactionService.returnBook("Ava", "Clean Code"));
        }
    }
}