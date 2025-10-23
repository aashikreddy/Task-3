import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added to the library.");
    }

    public void showAllBooks() {
        System.out.println("\nAvailable Books:");
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void issueBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title) && !b.isIssued()) {
                b.issueBook();
                System.out.println("Book \"" + title + "\" issued successfully!");
                return;
            }
        }
        System.out.println("Book \"" + title + "\" not available or already issued.");
    }

    public void returnBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title) && b.isIssued()) {
                b.returnBook();
                System.out.println("Book \"" + title + "\" returned successfully!");
                return;
            }
        }
        System.out.println("Book \"" + title + "\" not found or not issued.");
    }
}
