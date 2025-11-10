package collection_packages.vector.library_Management_system;

import java.util.Scanner;
import java.util.Vector;

public class LibraryManagement {
    public static void main(String[] args) {
        Vector<Book > books = new Vector<>();
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println(" \t 1) Display Books Available in the Library \n" +
                    "\t 2) Search a Book in the Library \n" +
                    "\t 3) Issue a Book from the Library \n" +
                    "\t 4) Exit from the application ");
            int choice = sc.nextInt();
            switch (choice){
                case 1->library.displayAvailableBook(books);
                case 2->library.searchBook(books,sc);
                case 3->library.issueBook(books,sc);
                case 4-> {
                        System.out.println("Thank you for Visiting..");
                        System.exit(0);}
            }
        }
//
//        library.issueBook(books,sc);
//        library.searchBook(books,sc);
    }
}
