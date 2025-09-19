package abstraction.interfaces.shopping_cart_using_different_payment_methods;

public class UPIPayment implements Payment{

    private String upiId;
    private String upiHolderName;

    public UPIPayment( String upiHolderName,String upiId) {
        this.upiHolderName = upiHolderName;
        this.upiId = upiId;

    }

    @Override
    public void makePayment(double amount) {
        System.out.println("Starting checkout for amount RS :"+amount);
        System.out.println("Paid RS :"+amount+" using UPI ID : "+this.upiId);
    }

    @Override
    public void makeRefund(double amount) {
        System.out.println("Order Canceled. Initiating Refund...");
        System.out.println("Cancelling order for amount RS :"+amount);
        System.out.println("Refunded RS :"+amount+" to UPI ID : "+this.upiId);
        System.out.println("Refunded amount successfully to this Upi name: "+this.upiHolderName);


    }
}
