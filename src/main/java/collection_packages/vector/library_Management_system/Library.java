package collection_packages.vector.library_Management_system;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

record Book(Integer id, String title, String author) {

}

public class Library  implements Serializable {
    public void displayAvailableBook(Vector<Book> books) {
        books.add(new Book(101, "core java", "Mr James"));
        books.add(new Book(102, "Adv java", "Mr Robert"));
        books.add(new Book(103, "Head First Java", "Miss Kathy Sierra"));
        books.add(new Book(104, "Programming in C", "Mr Denis"));
        books.forEach(System.out::println);

    }

    public void issueBook(Vector<Book> books, Scanner sc) {
        Iterator<Book> iterator = books.iterator();
        sc = new Scanner(System.in);
        int id = sc.nextInt();
        boolean flag = false;
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.id() == id) {
                System.out.println(book);
                iterator.remove();
                flag = true;
                System.out.println("Issued: " + book);
                break;
            }
        }
        if (!flag) {
            System.out.println("Not found with this id : " + id);
        }
    }

    public void searchBook(Vector<Book> books, Scanner sc) {
        sc = new Scanner(System.in);
        String title = sc.nextLine();
        boolean flag = false;
        for (Book book : books) {
            if (book.title().trim().equals(title)) {
                flag = true;
                System.out.println("Book found:" + book);
                break;
            }

        }
        if (!flag) {
            System.out.println("No matching books found");
        }
    }

}
