package polymorphism.bank_application;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("1) Saving Account\n" +
                "2) Current Account\n" +
                "3) Fixed Deposit Account");
        int input =Integer.parseInt(sc.next());
                switch (input){
                    case 1->{
                        System.out.println("Enter account Holder Name: ");
                        String name= sc.next();
                        System.out.println("Enter account Number: ");
                        String num= sc.next();
                        System.out.println(" Enter the Amount : ");
                        double bal= Double.parseDouble(sc.next());
                        BankAccount saving = new SavingAccount(name,num,bal);
                        saving.displayAccountDetails();
                        saving.calculateInterest();
                    }
                    case 2->{
                        System.out.println(" Enter account Holder Name: ");
                        String name= sc.next();
                        System.out.println(" Enter account Number: ");
                        String num= sc.next();
                        System.out.println(" Enter the Amount : ");
                        double bal= sc.nextDouble();
                        BankAccount current = new CurrentAccount(name,num,bal);
                        current.displayAccountDetails();
                        current.calculateInterest();
                        ((CurrentAccount) current).checkOverDraftLimit();
                    }
                    case 3->{
                        System.out.println(" Enter account Holder Name: ");
                        String name= sc.next();
                        System.out.println(" Enter account Number: ");
                        String num= sc.next();
                        System.out.println(" Enter the Amount : ");
                        double bal= sc.nextDouble();
                        System.out.println("Enter the deposit term [For How many years you want to deposit] ");
                        int depositTime=sc.nextInt();
                        BankAccount fixed = new FixedDepositAccount(name,num,bal,depositTime);
                        fixed.displayAccountDetails();
                        fixed.calculateInterest();
                    }


                    default -> throw new IllegalStateException("Unexpected value: " + input);
                }
    }
}
