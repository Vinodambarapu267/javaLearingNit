package abstraction.interfaces.shopping_cart_using_different_payment_methods;

import java.util.Scanner;

public class Customer {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Amount: ");
        double amount = sc.nextDouble();
        System.out.println("select the payment Using below Options\n 1. CreditCardPayment\n 2. DebitCardPayment\n 3. UPIPayment");
        int choice = sc.nextInt();
        ShoppingCart cart = new ShoppingCart(amount);
        switch (choice){
            case 1->{
                System.out.print("enter the cardHolderName: ");
                String cardHolderName= sc.next();
                System.out.print("Enter the cardNumber: ");
                long cardNum = sc.nextLong();
                CreditCardPayment creditPayment = new CreditCardPayment(cardHolderName,cardNum);
                cart.checkout(creditPayment);
            }
            case 2->{
                System.out.print("Enter the bankName: ");
                String bankName = sc.next();
                System.out.print("Enter the debit card number: ");
                long num = sc.nextLong();
                DebitCardPayment debitCardPayment = new DebitCardPayment(bankName,num);
                cart.checkout(debitCardPayment);
            }
            case 3->{
                System.out.print("Enter the upi name: ");
                String name = sc.next();
                System.out.print("Enter the UPI Id: ");
                String upiId = sc.next();

                UPIPayment upiPayment = new UPIPayment(name,upiId);
                cart.checkout(upiPayment);
            }
        }

    }

}
