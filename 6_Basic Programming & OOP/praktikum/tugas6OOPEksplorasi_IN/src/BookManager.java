import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

class BookManager {
    private ArrayList<Book> books;

    public BookManager() {
        books = new ArrayList<>();
    }

    public void createBook(String title, String author, String category) {
        Book book = new Book(title, author, category);
        books.add(book);
        System.out.println("Book added successfully!");
        System.out.println(book.getId());
    }

    public void getAllBooks() {
        for (Book book : books) {
            System.out.println(book.getId() + " " + book.getTitle() + " " + book.getAuthor() + " " + book.getCategory());
        }
    }

    public void getBookById(UUID id) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                System.out.println(book.getId() + " " + book.getTitle() + " " + book.getAuthor() + " " + book.getCategory());
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public void updateBook(UUID id, String title, String author, String category) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                book.setTitle(title);
                book.setAuthor(author);
                book.setCategory(category);
                System.out.println("Book updated successfully!");
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public void deleteBook(UUID id) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                books.remove(book);
                System.out.println("Book deleted successfully!");
                return;
            }
        }
        System.out.println("Book not found!");
    }
}

