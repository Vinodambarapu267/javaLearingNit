package abstraction.interfaces.shopping_cart_using_different_payment_methods;

public interface Payment {
    void makePayment(double amount);
    void makeRefund(double amount);
}
