package collection_packages.arraylist.Online_Cab_Booking;

import java.util.ArrayList;

public class CustomerService {
    private ArrayList<Customer> customers;

    public CustomerService() {
        customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public boolean isFirstCustomer(Customer customer) {
        String phoneCheck = customer.phone();
        for (Customer exitCustomer : customers) {
            if (exitCustomer.phone().equals(phoneCheck)) {
                return false;
            }
        }
        return true;
    }

    public double calculateBill(Customer customer) {


        if (isFirstCustomer(customer)) {
            customers.add(customer);
            return 0.0;
        } int distance = customer.distance();
        if (distance < 4) {
            return 80;
        }
        else {
            return 80 + (distance - 4) * 6;
        }

    }
    public String printBIll(Customer customer){
        double billAmount = calculateBill(customer);
        return customer.customerName().toUpperCase() + " Please pay your bill of Rs." + billAmount;
    }
}
