package EcommerceSearchFunction;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== E-commerce Platform Search Function ===\n");

        Product[] unsortedProducts = {
                new Product(105, "Bluetooth Speaker", "Electronics"),
                new Product(101, "Running Shoes", "Footwear"),
                new Product(109, "Coffee Mug", "Home"),
                new Product(103, "Smart Watch", "Electronics"),
                new Product(107, "Office Chair", "Furniture")
        };

        Product[] sortedProducts = Arrays.copyOf(unsortedProducts, unsortedProducts.length);
        Arrays.sort(sortedProducts, Comparator.comparingInt(Product::getProductId));

        int targetProductId = 103;

        System.out.println("Linear search on unsorted array:");
        Product linearResult = SearchAlgorithms.linearSearch(unsortedProducts, targetProductId);
        System.out.println(linearResult != null ? linearResult : "Product not found");

        System.out.println("\nBinary search on sorted array:");
        Product binaryResult = SearchAlgorithms.binarySearch(sortedProducts, targetProductId);
        System.out.println(binaryResult != null ? binaryResult : "Product not found");

        System.out.println("\nSearch for missing product 999:");
        System.out.println("Linear search: " + SearchAlgorithms.linearSearch(unsortedProducts, 999));
        System.out.println("Binary search: " + SearchAlgorithms.binarySearch(sortedProducts, 999));
    }
}