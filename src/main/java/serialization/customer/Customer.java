package serialization.customer;

import java.io.Serializable;
import java.util.Scanner;

public class Customer implements Serializable {
    private int customerId;
    private  String customerName;
    private Double customerBill;

    public Customer(int customerId, String customerName, Double customerBill) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerBill = customerBill;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Double getCustomerBill() {
        return customerBill;
    }

    public void setCustomerBill(Double customerBill) {
        this.customerBill = customerBill;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerBill=" + customerBill +
                '}';
    }

    public static Customer getCustomer(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Id:");
        int id= sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Bill");
        double bill = sc.nextDouble();
        return  new Customer(id,name,bill);
    }
}
