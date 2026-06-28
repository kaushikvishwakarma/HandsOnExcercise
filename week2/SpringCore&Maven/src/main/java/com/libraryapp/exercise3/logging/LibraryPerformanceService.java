package com.libraryapp.exercise3.logging;

import org.springframework.stereotype.Service;

@Service
public class LibraryPerformanceService {

    public String loadCatalog() {
        return "Catalog loaded";
    }

    public String searchByTitle(String title) {
        return "Search result for " + title;
    }
}