package collection_packages.arraylist.sorting_of_data.customer_using_comparator;

import java.util.Comparator;

public class Customer {

    private int customerNumber;
    private String customerName;
    private double customerBill;

    public Customer(int customerNumber, String customerName, double customerBill) {
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        this.customerBill = customerBill;
    }


    @Override
    public String toString() {
        return STR."Customer{customerNumber=\{customerNumber}, customerName='\{customerName}', customerBill=\{customerBill}}";
    }

    Comparator<Customer> compId = (c1, c2) -> Integer.compare(c1.customerNumber, c2.customerNumber);
    Comparator<Customer> compName = (c1, c2) -> c1.customerName.compareTo(c2.customerName);
    Comparator<Customer> compBill = (c1, c2) -> Double.compare(c1.customerBill, c2.customerBill);
}
