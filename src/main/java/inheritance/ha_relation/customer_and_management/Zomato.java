package inheritance.ha_relation.customer_and_management;

import java.util.Scanner;

public class Zomato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a customer Name: ");
        String name= scanner.nextLine();
        System.out.println("Enter a customer mail: ");
        String mail= scanner.nextLine();

        System.out.println("Enter a customer mobile Number: ");
        String mobileNo= scanner.nextLine();
        Customer customer = new Customer(name,mail,mobileNo);
        System.out.println(customer);
    }
}
