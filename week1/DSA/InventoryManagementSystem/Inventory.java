package InventoryManagementSystem;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private final Map<Integer, Product> products;

    public Inventory() {
        this.products = new HashMap<>();
    }

    public boolean addProduct(Product product) {
        if (product == null || products.containsKey(product.getProductId())) {
            return false;
        }

        products.put(product.getProductId(), product);
        return true;
    }

    public boolean updateProduct(Product product) {
        if (product == null || !products.containsKey(product.getProductId())) {
            return false;
        }

        products.put(product.getProductId(), product);
        return true;
    }

    public boolean deleteProduct(int productId) {
        return products.remove(productId) != null;
    }

    public Product getProduct(int productId) {
        return products.get(productId);
    }

    public Collection<Product> getAllProducts() {
        return products.values();
    }

    public void printInventory() {
        if (products.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }

        for (Product product : products.values()) {
            System.out.println(product);
        }
    }
}