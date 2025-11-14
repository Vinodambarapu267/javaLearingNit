package collection_packages.arraylist.sorting_of_data.customer_using_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SortingCustomer {

    static void main() {
        Scanner sc = new Scanner(System.in);
        Customer cust = null;
        ArrayList<Customer> customers = new ArrayList<>();
        int numOfObj = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numOfObj; i++) {
            System.out.println("Enter the customer number");
            int num = Integer.parseInt(sc.nextLine());
            System.out.println("Enter the name: ");
            String name = sc.nextLine();
            System.out.println("Enter the customer Bill");
            double bill = Double.parseDouble(sc.nextLine());
            cust = new Customer(num, name, bill);
            customers.add(cust);
        }
        for (Customer customer : customers) {
            System.out.println(customer);
        }
        int choic = Integer.parseInt(sc.nextLine());
        switch (choic) {
            case 1 -> {
                System.out.println(cust.compId);
                for (Customer customer : customers) {
                    System.out.println(customer);
                }
            }
            case 2 -> {
                System.out.println("Name: sort");
                customers.sort(cust.compName);
                for (Customer customer : customers) {
                    System.out.println(customer);
                }
            }
            case 3 -> {
                System.out.println("Bill");
                customers.sort(cust.compBill);
                for (Customer customer : customers) {
                    System.out.println(customer);
                }
            }
        }


    }

}
