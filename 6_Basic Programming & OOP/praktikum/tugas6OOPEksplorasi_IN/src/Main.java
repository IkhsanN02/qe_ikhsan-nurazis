import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        BookManager manager = new BookManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("1. Create book");
            System.out.println("2. Get all books");
            System.out.println("3. Get book by ID");
            System.out.println("4. Update book");
            System.out.println("5. Delete book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter book category: ");
                    String category = scanner.nextLine();
                    manager.createBook(title, author, category);
                    System.out.println("Book created successfully.");
                    break;
                case 2:
                    manager.getAllBooks();
                    break;
                case 3:
                    System.out.print("Enter book ID: ");
                    String id = scanner.nextLine();
                    manager.getBookById(UUID.fromString(id));
                    break;
                case 4:
                    System.out.print("Enter book ID: ");
                    String bookId = scanner.nextLine();
                    System.out.print("Enter new book title: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Enter new book author: ");
                    String newAuthor = scanner.nextLine();
                    System.out.print("Enter new book category: ");
                    String newCategory = scanner.nextLine();
                    manager.updateBook(UUID.fromString(bookId), newTitle, newAuthor, newCategory);
                    System.out.println("Book updated successfully.");
                    break;
                case 5:
                    System.out.print("Enter book ID: ");
                    String deleteId = scanner.nextLine();
                    manager.deleteBook(UUID.fromString(deleteId));
                    System.out.println("Book deleted successfully.");
                    break;
                case 6:
                    System.out.println("Exiting the program...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            System.out.println();
        }
        scanner.close();
    }
}