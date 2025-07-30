package bank_app;

import java.util.Scanner;

public class BankCustomer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank customer = new Bank();
        System.out.println("Enter a customer name");
        String name = sc.next();
        System.out.println("Enter a account Number");
        long acc= sc.nextInt();
        System.out.println("Enter a current balance");
        double currentbalance = sc.nextDouble();
        System.out.println("select the number for the withdraw/deposit");
        System.out.println("1. withdraw");
        System.out.println("2. Deposit");
        customer.setCustomerDetails(name, acc, currentbalance);
        int value=sc.nextInt();
        switch (value){
           case 1-> {
               System.out.println("enter a withdraw amount");

            double withdraw = sc.nextDouble();
            customer.withDraw(withdraw);
            System.out.println(customer);}
        case 2->{
            System.out.println("enter a deposit amount");
            double deposit = sc.nextDouble();
            customer.deposit(deposit);
            System.out.println(customer);}
        }


    }
}
