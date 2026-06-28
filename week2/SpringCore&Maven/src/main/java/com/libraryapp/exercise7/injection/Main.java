package com.libraryapp.exercise7.injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("exercise7-context.xml")) {
            ConstructorInjectedBookService constructorInjectedBookService = context.getBean(ConstructorInjectedBookService.class);
            SetterInjectedBookService setterInjectedBookService = context.getBean(SetterInjectedBookService.class);
            System.out.println(constructorInjectedBookService.describeBook());
            System.out.println(setterInjectedBookService.describeBook());
        }
    }
}