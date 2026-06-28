package com.libraryapp.exercise8.aop;

import org.springframework.stereotype.Service;

@Service
public class LibraryTransactionService {

    public String borrowBook(String memberName, String title) {
        return memberName + " borrowed " + title;
    }

    public String returnBook(String memberName, String title) {
        return memberName + " returned " + title;
    }
}