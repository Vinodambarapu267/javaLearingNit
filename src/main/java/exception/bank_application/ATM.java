package exception.bank_application;

import exception.bank_application.exceptions.AccountNotFoundException;
import exception.bank_application.exceptions.InsufficientFundsException;
import exception.bank_application.exceptions.InvalidAmountException;
import exception.bank_application.exceptions.LoanNotAllowedException;
import exception.bank_application.services.BankAccount;
import exception.bank_application.services.Customer;

import java.util.Scanner;

public class ATM {
    static Scanner sc = new Scanner(System.in);

    static BankAccount acc1 = new BankAccount(1111, 60000);
    static BankAccount acc2 = new BankAccount(2222, 3000);
    static Customer customer1 = new Customer("Alice".toLowerCase(), acc1);
    static Customer customer2 = new Customer("Bob".toLowerCase(), acc2);

    public static void main(String[] args) {
        System.out.println("Select Options:\n1. Deposit\n2. Withdraw\n3. check Loan Application\n4. check Balance\n5. check Balance\n6. Exit");
        int choice = Integer.parseInt(sc.next());
        switch (choice) {
            case 1 -> depositMethod();
            case 2-> withDrawMethod();
            case 3-> applyLoan();
            case 4-> checkBalance();
            case 5-> transfer();
            case 6-> System.out.println("Thank you for using the ATM. Goodbye!");
            default -> System.err.println(" please enter above option");
        }
    }
    public static void depositMethod(){
        try{
            System.out.print("Enter Account Holder Name: ");
            String name = sc.next();
            System.out.print("Enter the amount to deposit: ");
            double deposit = Double.parseDouble(sc.next());
            if (!customer1.getName().equals(name) && !customer2.getName().equals(name)){
                throw  new AccountNotFoundException("Please valid account name");
            }
            else if (customer1.getName().equals(name)) {
                acc1.deposit(deposit);
            } else if (customer2.getName().equals(name)) {
                acc2.deposit(deposit);
            }
        }catch ( InvalidAmountException |AccountNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void withDrawMethod() {
        try {
            System.out.print("Enter Account Holder Name : ");
            String name = sc.next();
            System.out.print("Enter the amount to withdraw : ");
            double withdraw = Double.parseDouble(sc.next());
            if (!customer1.getName().equals(name) && !customer2.getName().equals(name)){
                throw  new AccountNotFoundException("Please valid account name");
            }
            else if (customer1.getName().equals(name)) {
                acc1.withDraw(withdraw);
            } else if (customer2.getName().equals(name)) {
                acc2.withDraw(withdraw);
            }
        } catch (RuntimeException|InvalidAmountException|InsufficientFundsException|AccountNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void applyLoan() {
        try{
            System.out.print("Enter Account Holder Name: ");
            String name = sc.next();
            System.out.print("Enter the amount to check loan acceptance");
            double amt = Double.parseDouble(sc.next());
            if (!customer1.getName().equals(name) && !customer2.getName().equals(name)){
                throw  new AccountNotFoundException("Please valid account name");
            }
            else  if (customer1.getName().equals(name)) {
                acc1.applyLoan(amt);
            } else if (customer2.getName().equals(name)) {
                acc2.applyLoan(amt);
            }
        }catch (InvalidAmountException| LoanNotAllowedException |AccountNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    public static void checkBalance(){
        System.out.print("Enter Account Holder Name: ");
        String name = sc.next();
        try{
            if (!customer1.getName().equals(name) && !customer2.getName().equals(name)){
                throw  new AccountNotFoundException("Please valid account name");
            }
            else  if (customer1.getName().equals(name)) {
                System.out.println(acc1.getBalance());;
            } else if (customer2.getName().equals(name)) {
                System.out.println(acc2.getBalance());;
            }
        }catch (AccountNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    public static void transfer()  {
       try {
           System.out.print("Enter Account Holder Name: ");
           String name = sc.next();
           System.out.print("Enter the amount to transfer:  ");
           double transferAmount= Double.parseDouble(sc.next());
           if (!customer1.getName().equals(name) && !customer2.getName().equals(name)){
               throw  new AccountNotFoundException("Please valid account name");
           }
           else if (customer1.getName().equals(name)) {
               if (transferAmount>=acc2.getBalance()){
                   acc2.transfer(acc1,transferAmount);
               }else {
                   System.out.println("Insufficient Amount");
               }
           } else if (customer2.getName().equals(name)) {
               if (transferAmount>=acc1.getBalance()){
                   acc1.transfer(acc2,transferAmount);
               }else {
                   System.out.println("Insufficient Amount");
               }
           }
       }catch (InvalidAmountException| AccountNotFoundException e ){
           System.out.println(e.getMessage());
       }
    }

}