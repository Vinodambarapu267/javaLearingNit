package inheritance.ha_relation.customer_and_management;

import java.util.Scanner;

public class Customer {
    private String customerName;
    private String customerEmail;
    private String customerMobileNo;
    private  String address;
    private Order order;

    public Customer(String customerName, String customerEmail, String address, String customerMobileNo) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the order Id:");
        String id= sc.nextLine();
        System.out.println("Enter the order item:");
        String item= sc.nextLine();
        System.out.println("Enter the order price");
       double price  = sc.nextDouble();
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.address= address;
        this.customerMobileNo = customerMobileNo;
        this.order= new Order(id,item,price);
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getAddress() {
        return address;
    }

    public String getCustomerMobileNo() {
        return customerMobileNo;
    }

    public Order getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerMobileNo='" + customerMobileNo + '\'' +
                ", address='" + address + '\'' +
                ", order=" + order +
                '}';
    }
}
