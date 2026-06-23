package SortingCustomerOrders;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Sorting Customer Orders ===\n");

        Order[] orders = {
                new Order(501, "Aarav Sharma", 1899.50),
                new Order(502, "Priya Singh", 799.99),
                new Order(503, "Kabir Mehta", 4599.00),
                new Order(504, "Ananya Gupta", 1299.25),
                new Order(505, "Rohan Verma", 2899.75)
        };

        Order[] bubbleSortedOrders = Arrays.copyOf(orders, orders.length);
        Order[] quickSortedOrders = Arrays.copyOf(orders, orders.length);

        System.out.println("Original orders:");
        printOrders(orders);

        SortingAlgorithms.bubbleSort(bubbleSortedOrders);
        System.out.println("\nAfter Bubble Sort by totalPrice:");
        printOrders(bubbleSortedOrders);

        SortingAlgorithms.quickSort(quickSortedOrders, 0, quickSortedOrders.length - 1);
        System.out.println("\nAfter Quick Sort by totalPrice:");
        printOrders(quickSortedOrders);
    }

    private static void printOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}