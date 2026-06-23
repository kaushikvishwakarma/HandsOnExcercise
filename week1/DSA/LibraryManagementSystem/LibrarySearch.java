package LibraryManagementSystem;

public class LibrarySearch {
    public static Book linearSearchByTitle(Book[] books, String targetTitle) {
        if (books == null || targetTitle == null) {
            return null;
        }

        for (Book book : books) {
            if (book != null && book.getTitle().equalsIgnoreCase(targetTitle)) {
                return book;
            }
        }

        return null;
    }

    public static Book binarySearchByTitle(Book[] sortedBooks, String targetTitle) {
        if (sortedBooks == null || targetTitle == null) {
            return null;
        }

        int left = 0;
        int right = sortedBooks.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            Book middleBook = sortedBooks[middle];

            if (middleBook == null) {
                return null;
            }

            int comparison = middleBook.getTitle().compareToIgnoreCase(targetTitle);

            if (comparison == 0) {
                return middleBook;
            }

            if (comparison < 0) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return null;
    }
}