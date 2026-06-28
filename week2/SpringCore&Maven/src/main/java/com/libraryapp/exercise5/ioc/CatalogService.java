package com.libraryapp.exercise5.ioc;

public class CatalogService {

    private final CatalogRepository catalogRepository;

    public CatalogService(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }

    public String showFeaturedCatalog() {
        return String.join(" | ", catalogRepository.getFeaturedTitles());
    }
}