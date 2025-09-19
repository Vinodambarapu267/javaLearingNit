package abstraction.interfaces.shopping_cart_using_different_payment_methods;

public class ShoppingCart {
    private double totalAmount;

    public ShoppingCart(double totalAmount) {
        if(totalAmount<0){
            System.out.println("Invalid Input");
            System.exit(0);
        }
        this.totalAmount = totalAmount;
    }
    public void checkout(Payment payment){
        if (payment instanceof CreditCardPayment){
            CreditCardPayment creditCard = (CreditCardPayment) payment;
            creditCard.makePayment(totalAmount);
            creditCard.makeRefund(totalAmount);

        } else if (payment instanceof  DebitCardPayment) {

            DebitCardPayment debitCard = (DebitCardPayment) payment;
            debitCard.makePayment(totalAmount);
            debitCard.makeRefund(totalAmount);
        }else {
            UPIPayment upi= (UPIPayment) payment;
            upi.makePayment(totalAmount);
            upi.makeRefund(totalAmount);
        }
    }
    public void checkOrder(Payment payment){

    }
}
