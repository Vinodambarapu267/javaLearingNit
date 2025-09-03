package polymorphism.bank_application;

public class SavingAccount extends BankAccount{
   protected double interestRate= 4.0;

    public SavingAccount(String accName, String accNum, double balance) {
        super(accName, accNum, balance);

    }

    public  void calculateInterest(){
        System.out.println("Saving Account Interest Rs: "+balance*interestRate/100);
    }
}
