package com.libraryapp.exercise5.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("exercise5-context.xml")) {
            CatalogService catalogService = context.getBean(CatalogService.class);
            System.out.println(catalogService.showFeaturedCatalog());
        }
    }
}