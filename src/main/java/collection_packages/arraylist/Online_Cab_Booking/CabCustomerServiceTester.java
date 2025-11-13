package collection_packages.arraylist.Online_Cab_Booking;

import java.util.Scanner;

public class CabCustomerServiceTester {
    public static void main(String[] args) {
        CustomerService service = new CustomerService();
        Customer johnReturn = new Customer(1, "JOHN", "LocA", "LocB", 6, "1234567890");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the customer Name:");
        String name = sc.nextLine();
        System.out.println("Enter the pickupLocation: ");
        String pickup = sc.nextLine();
        System.out.println("Enter the dropLocation");
        String drop = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter the distance");
        int distance = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the phone number:");
        String phone = sc.nextLine();
        Customer customer = new Customer(id, name, pickup, drop, distance, phone);
        service.isFirstCustomer(customer);
        System.out.println(service.printBIll(customer));
    }
}
