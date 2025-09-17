package abstraction.interfaces.bank_application_using_interface;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Total Amount: ");
        double amount = sc.nextDouble();
        Bank vinod = new Customer(amount);
        System.out.println("Select Option in the below \n 1. Deposit \n 2. Withdraw");
        int input = sc.nextInt();
        switch (input){
            case 1->{
                System.out.print("Enter the Deposit Amount: ");

                double depositAmount = sc.nextDouble();
                vinod.deposit(depositAmount);
                }
            case 2->{
                    System.out.print("Enter the withdraw Amount: ");

            double withdrawAmount = sc.nextDouble();
                vinod.withdraw(withdrawAmount);
            }
        }
    }
}
