package collection_packages.arraylist.library_management_project;

import java.util.Scanner;

public class BookLibrary {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        while (true) {
            System.out.println("1. Add Book\n" +
                    "2. Display Books\n" +
                    "3. Update Quantity\n" +
                    "4. Delete Book\n" +
                    "5. Exit");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> {
                    System.out.println("enter the title");
                    String title = sc.nextLine();
                    System.out.println("Enter the Author ");
                    String author = sc.nextLine();
                    System.out.println("Enter the isbn: ");
                    long isbn = Long.parseLong(sc.nextLine());
                    System.out.println("Enter the Price: ");
                    double price = Double.parseDouble(sc.nextLine());
                    System.out.println("Enter the Quantity : ");
                    int quantity = Integer.parseInt(sc.nextLine());
                    Book book = new Book(title.trim(), author.trim(), isbn, price, quantity);
                    library.addBook(book);
                    System.out.println(book);
                }
                case 2 -> library.displayAllBooks();

                case 3 -> {
                    System.out.println("Enter the isbn");
                    long isbn = Long.parseLong(sc.nextLine());
                    library.updateBookQuantityByIsbn(isbn);
                }
                case 4 -> {
                    System.out.println("Enter the title");
                    String title = sc.nextLine();
                    library.deleteBookByTitle(title);

                }
                case 5 ->System.exit(0);

                default -> throw new RuntimeException("Enter the correct choice: " + choice);
            }
        }
    }
}
