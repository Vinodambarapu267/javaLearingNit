package abstraction.interfaces.bank_application_using_interface;

public class Customer implements Bank{
    double balance;

    public Customer(double balance) {
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return this.getBalance();
    }

    @Override
    public void deposit(double amount) {
        if(amount<=0){
            System.err.println("amount cannot deposited");
            System.exit(0);
        }
this.balance=balance+amount;
        System.out.println("After deposit "+amount+"\nUpdated balance is "+this.balance);
    }

    @Override
    public void withdraw(double amount) {
if(amount>this.balance){
    System.err.println("insufficient Balance!!");
    System.exit(0);
}
this.balance=balance-amount;
        System.out.println("After withdraw of "+amount+"\nupdated balance  is: "+this.balance);
    }
}
