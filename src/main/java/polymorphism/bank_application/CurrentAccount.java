package polymorphism.bank_application;

public class CurrentAccount extends BankAccount{
    protected double overDraftLimit =5000.0;

    public CurrentAccount(String accName, String accNum, double balance) {
        super(accName, accNum, balance);

    }
    public  void calculateInterest(){
        System.out.println("Current accounts do not earn interest.");
    }
    public void checkOverDraftLimit(){
        System.out.println("Overdraft limit RS :"+this.overDraftLimit);
    }
}
