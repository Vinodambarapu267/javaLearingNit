package inheritance.sealed_keyword;


sealed class  Payment permits CreditCardPayment, DebitCardPayment, UPiPayment {
    public  double makePayment(double amount){
     return 0.0;
    }
}
non-sealed class UPiPayment extends Payment{

    public  double makePayment(double amount){
        return amount;
    }
}
non-sealed class DebitCardPayment extends Payment{

    public  double makePayment(double amount){
        return amount;
    }
}
non-sealed class CreditCardPayment extends  Payment{

    public  double makePayment(double amount){
        return amount;
    }
}
public class SealedDemo2 {
    public static void main(String[] args) {
        Payment p = null;
       p=new UPiPayment();
       double payment=p.makePayment(2000);
        System.out.println("Payment done By "+payment+" By upi");
        p=new CreditCardPayment();
        payment=p.makePayment(3000);
        System.out.println("Payment done By "+payment+" By creditCard");
        p=new DebitCardPayment();
       payment=p.makePayment(1000);
        System.out.println("Payment done By "+payment+" By DebitCard");

    }
}
