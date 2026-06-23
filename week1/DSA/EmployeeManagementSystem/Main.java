package EmployeeManagementSystem;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Employee Management System ===\n");

        EmployeeArrayManager manager = new EmployeeArrayManager(5);

        manager.addEmployee(new Employee(201, "Aditi Rao", "HR Manager", 65000.00));
        manager.addEmployee(new Employee(202, "Ravi Kumar", "Software Engineer", 85000.00));
        manager.addEmployee(new Employee(203, "Neha Patel", "Finance Analyst", 72000.00));

        System.out.println("All employees:");
        manager.traverseEmployees();

        System.out.println("\nSearching employee 202:");
        System.out.println(manager.searchEmployee(202));

        System.out.println("\nDeleting employee 201:");
        System.out.println("Deleted: " + manager.deleteEmployee(201));

        System.out.println("\nEmployees after delete:");
        manager.traverseEmployees();
    }
}