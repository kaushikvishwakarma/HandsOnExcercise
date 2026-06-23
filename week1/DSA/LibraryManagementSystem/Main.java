package LibraryManagementSystem;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Library Management System ===\n");

        Book[] books = {
                new Book(401, "The Java Handbook", "James Gosling"),
                new Book(402, "Clean Code", "Robert Martin"),
                new Book(403, "Algorithms Unlocked", "Thomas Cormen"),
                new Book(404, "Head First Design Patterns", "Eric Freeman"),
                new Book(405, "Effective Java", "Joshua Bloch")
        };

        Book[] sortedBooks = Arrays.copyOf(books, books.length);
        Arrays.sort(sortedBooks, Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));

        String targetTitle = "Effective Java";

        System.out.println("Linear search by title:");
        Book linearResult = LibrarySearch.linearSearchByTitle(books, targetTitle);
        System.out.println(linearResult != null ? linearResult : "Book not found");

        System.out.println("\nBinary search by title:");
        Book binaryResult = LibrarySearch.binarySearchByTitle(sortedBooks, targetTitle);
        System.out.println(binaryResult != null ? binaryResult : "Book not found");

        System.out.println("\nSearch for missing title:");
        System.out.println("Linear search: " + LibrarySearch.linearSearchByTitle(books, "Unknown Title"));
        System.out.println("Binary search: " + LibrarySearch.binarySearchByTitle(sortedBooks, "Unknown Title"));
    }
}