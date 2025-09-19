package abstraction.interfaces.shopping_cart_using_different_payment_methods;

public class DebitCardPayment implements Payment{

   private String bankName;
   private long debitCardNumber;

    public DebitCardPayment(String bankName, long debitCardNumber) {
        this.bankName = bankName;
        this.debitCardNumber = debitCardNumber;
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("Starting checkout for amount RS :"+amount);
        System.out.println("Paid RS :"+amount+" using Debit Card Bank: "+this.bankName +" and card number is: "+this.debitCardNumber);
    }

    @Override
    public void makeRefund(double amount) {
        System.out.println("Order Canceled. Initiating Refund...");
        System.out.println("Cancelling order for amount RS :"+amount);
        System.out.println("Refunded RS :"+amount+" to Debit Card Bank: "+this.bankName);
        System.out.println("Refunded amount successfully to the card Number  "+this.debitCardNumber);

    }
}
