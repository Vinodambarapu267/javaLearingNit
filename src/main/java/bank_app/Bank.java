package bank_app;

public class Bank {
    private  String customerName;
    private long accountNumber;
    private  double currentBalance;

    public static String bankName="union Bank";
    public static String bankAddress="Hyderabad";
    public static String bankIFSCCode="UNB00008231";
    public void setCustomerDetails(String name,long accNumber,double balance){
        customerName=name;
        accountNumber=accNumber;
        currentBalance=balance;
    }
    public void withDraw(double withdraw){
        if(withdraw<currentBalance){
            currentBalance=currentBalance - withdraw;
        }else {
            System.err.println("you hae insufficient balance");
        }
    }
    public void deposit(double deposit){
        if(deposit<=0){
            System.err.println("please enter more than zero");
        }else {
            currentBalance = currentBalance + deposit;
        }
    }

    @Override
    public String toString() {
        return  "CustomerName: " + customerName + '\'' +
                "\nAccountNumber: " + accountNumber +
                "\nCurrentBalance: " + currentBalance +
                "\nBankName: "+bankName+
                "\nBankAddress: "+bankAddress+
                "\nBankIFSCCode: "+bankIFSCCode;
    }

}
