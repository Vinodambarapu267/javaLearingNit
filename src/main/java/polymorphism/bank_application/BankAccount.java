package polymorphism.bank_application;

public class BankAccount {
    protected String accName;
    protected String accNum;
    protected double balance;
    public static  final String IFSC_Code="IBN0000023";

    public BankAccount(String accName, String accNum, double balance) {
        if(balance<=0){
            System.err.println("Balance cannot be negative");
            System.exit(0);
        }
        this.accName = accName;
        this.accNum = accNum;
        this.balance = balance;
    }
    public  void calculateInterest(){

    }
    public void displayAccountDetails(){
        System.out.println("Account Holder: "+this.accName);
        System.out.println("Account Number: "+this.accNum);
        System.out.println("Balance Rs: "+this.balance);
        System.out.println("IFSC CODE: "+this.IFSC_Code);
    }

}
