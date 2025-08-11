package test1.book;

import java.util.Scanner;

public class BookDemo {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("1.Parameterized Constructor");
        System.out.println("2. parameterized constructor with name and author");
        System.out.println("3. No argument constructor");
        System.out.print("Select Options:");
        int num=scanner.nextInt();

        switch (num){
            case 1->{
                System.out.print("Enter book name: ");
                String name = scanner.next();
                System.out.print("Enter book author Name: ");
                String author = scanner.next();
                System.out.print("Enter a book price");
                double price = scanner.nextDouble();
               Book book= new Book(name,author,price);
                book.displayBookDetails();
            }case  2->{
                System.out.print("Enter book name: ");
                String name = scanner.next();
                System.out.print("Enter book author Name: ");
                String author = scanner.next();
                 Book book2 =new Book(name,author);
                book2.displayBookDetails();
            }case  3->{
                 Book book3 =new Book();
                book3.displayBookDetails();
            }
        }


    }
}
