package polymorphism.bank_application;

public class FixedDepositAccount extends BankAccount {
    protected double interestRate =6.5;
    protected int depositTerm;
    public FixedDepositAccount(String accName, String accNum, double balance, int depositTerm) {
        super(accName, accNum, balance);
        if(depositTerm<=0){
            System.err.println("Deposit term must be positive.");
            System.exit(0);
        }
        this.depositTerm = depositTerm;
    }
    public  void calculateInterest(){
        System.out.println("Fixed Deposit Interest for "+depositTerm+"  years RS :"+(balance*depositTerm*interestRate)/100);
    }

}
