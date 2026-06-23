package InventoryManagementSystem;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Inventory Management System ===\n");

        Inventory inventory = new Inventory();

        Product laptop = new Product(101, "Laptop", 12, 75000.00);
        Product mouse = new Product(102, "Wireless Mouse", 40, 1200.00);
        Product keyboard = new Product(103, "Mechanical Keyboard", 18, 5500.00);

        System.out.println("Adding products:");
        System.out.println("Laptop added: " + inventory.addProduct(laptop));
        System.out.println("Mouse added: " + inventory.addProduct(mouse));
        System.out.println("Keyboard added: " + inventory.addProduct(keyboard));

        System.out.println("\nCurrent inventory:");
        inventory.printInventory();

        System.out.println("\nUpdating product 102:");
        Product updatedMouse = new Product(102, "Wireless Mouse", 55, 1150.00);
        System.out.println("Mouse updated: " + inventory.updateProduct(updatedMouse));

        System.out.println("\nInventory after update:");
        inventory.printInventory();

        System.out.println("\nDeleting product 103:");
        System.out.println("Keyboard deleted: " + inventory.deleteProduct(103));

        System.out.println("\nInventory after delete:");
        inventory.printInventory();

        System.out.println("\nLookup product 101:");
        System.out.println(inventory.getProduct(101));
    }
}