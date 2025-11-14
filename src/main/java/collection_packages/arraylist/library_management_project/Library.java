package collection_packages.arraylist.library_management_project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Library {
    public ArrayList<Book> books;


    public Library() {
        books = new ArrayList<>();
        books.add(new Book("core java", "james", 123456, 1289D, 10));
        books.add(new Book("advanced java", "scott", 1234567, 1678D, 20));
    }

    public void addBook(Book book) {
        if (searchBook(book.getIsbn()) != null) {
            boolean add = books.add(book);
            if (add) {

                System.out.println("Book is added successfully");
            } else {
                System.out.println("Book is not added");
            }
        } else {
            System.err.println("the same Book is already present with " + book.getIsbn());
        }

    }

    private Book searchBook(long isbn) {
        for (Book b : books) {
            if (isbn != b.getIsbn()) {
                return b;
            }
        }
        return null;
    }

    public void displayAllBooks() {
        books.forEach(System.out::println);
    }

    public void deleteBookByTitle(String title) {
        Iterator<Book> i = books.iterator();
        boolean remove = false;
        if (i.hasNext()) {
            remove = books.remove(title);
            System.out.println("removed: " + i.next());
        }
        if (!remove) {
            System.out.println("Book is removed ");
        } else {
            System.out.println("Book is not removed");
        }

    }

    public void updateBookQuantityByIsbn(long isbn) {
        Book book = searchBook(isbn);

        if (book == null) {
            System.out.println("There no book" + isbn);
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the quantity");
            int qty = Integer.parseInt(sc.nextLine());
            book.setQuantity(qty);
            System.out.println("Quantity updated successfully");
            System.out.println(book);
        }
    }
}

