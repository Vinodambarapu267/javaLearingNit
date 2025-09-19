package abstraction.interfaces.shopping_cart_using_different_payment_methods;

public class CreditCardPayment implements Payment{

   private String cardHolderName;
   private long cardNumber;

    public CreditCardPayment(String cardHolderName, long cardNumber) {
        this.cardHolderName = cardHolderName;
        this.cardNumber= cardNumber;
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("Starting checkout for amount RS :"+amount);
        System.out.println("Paid RS :"+amount+" using Credit Card Holder : "+this.cardHolderName+" by card number is "+cardNumber);
    }

    @Override
    public void makeRefund(double amount) {
        System.out.println("Order Canceled. Initiating Refund...");
        System.out.println("Cancelling order for amount RS :"+amount);
        System.out.println("Refunded RS :"+amount+" to Credit Card Holder : "+this.cardHolderName);
        System.out.println("Refunded amount successfully to the card Number  "+this.cardNumber);
    }
}
