package serialization.customer;

import java.io.*;
import java.util.Scanner;

public class StoreCustomerObject {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        var fis = new FileOutputStream("C:\\Users\\ambar\\OneDrive\\Desktop\\my folder\\java_codes\\CustomerObject.txt");
        var oos = new ObjectOutputStream(fis);
        try (fis; oos; sc) {
            System.out.println("how mant objects:");
            int objects = Integer.parseInt(sc.next());
            for (int i = 1; i <= objects; i++) {
                Customer customer = Customer.getCustomer();
                oos.writeObject(customer);
                System.out.println(customer);
            }
            System.out.println("Object store successfully");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
