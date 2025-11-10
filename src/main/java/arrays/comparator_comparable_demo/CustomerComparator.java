package arrays.comparator_comparable_demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

record Customer(Integer id,String name,Double price){

}
public class CustomerComparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (sc){
            System.out.println("Enter the Size:");
            int size = Integer.parseInt(sc.nextLine());
            Customer[] customer = new Customer[size];
            for (int i=0;i<size;i++){
                System.out.println("Enter id: ");
                int id = Integer.parseInt(sc.nextLine());
                System.out.println("Enter name");
                String name=sc.nextLine();
                System.out.println("Enter bill");
                double bill = Double.parseDouble(sc.nextLine());
                customer[i]= new Customer(id,name,bill);
            }
            System.out.println("Original Array:");
            for (Customer cust :customer){
                System.out.println(cust);
            }
            Comparator<Customer> comId = new Comparator<Customer>() {
                @Override
                public int compare(Customer c1, Customer c2) {
                    return Integer.compare(c1.id(),c2.id());
                }
            };
            Arrays.sort(customer,comId);
            System.out.println("Sorted by Id");
            for (Customer customer1: customer){
                System.out.println(customer1);
            }
            Comparator<Customer> compName = (c1,c2)->c1.name().compareTo(c2.name());
            Arrays.sort(customer,compName);
            System.out.println("Sorted by name");
            for (Customer customer1 : customer){
                System.out.println(customer1);
            }
            Arrays.sort(customer,(c1,c2)->Double.compare(c1.price(),c2.price()));
            System.out.println("Sorted by price");
            for (Customer customer1 : customer){
                System.out.println(customer1);
            }

        }
    }
}
