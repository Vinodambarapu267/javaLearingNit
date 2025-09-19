package abstraction.interfaces.day2_test;

import java.util.Scanner;

class PaymentGateway{
    public Payment initiatePayment(Payment payment){
        if(payment instanceof CreditCardPayment){
            return  new CreditCardPayment();
        }else if(payment instanceof UPIPayment){
            return  new UPIPayment();
        }else
        return  null;
    }
}

public class PaymentGatewayUsingInterface{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        PaymentGateway gateway = new PaymentGateway();
        Payment payment = null;
        switch (choice){
            case 1->

               payment=  gateway.initiatePayment(new CreditCardPayment());

            case  2->
             payment =    gateway.initiatePayment(new UPIPayment());
            default ->{
                System.out.println("Wrong choice");
            System.exit(0);
            }
        }
        payment.applyDiscount();
        payment.processPayment();
    }
}
interface Payment{
  void applyDiscount();
  void processPayment();


}
class CreditCardPayment implements Payment{

    @Override
    public void applyDiscount() {
        System.out.println("Initiating Credit Card payment.\n" +
                "Applying 10% discount for credit card users.");
    }
    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment");
    }
}
class UPIPayment implements Payment{

    @Override
    public void applyDiscount() {
        System.out.println("Initiating UPI payment.\n" +
                "Applying 100 cashback for UPI users.");
    }
    @Override
    public void processPayment() {
        System.out.println("Processing UPI payment");
    }
}