package exception.bank_application.services;

import exception.bank_application.exceptions.AccountNotFoundException;
import exception.bank_application.exceptions.InsufficientFundsException;
import exception.bank_application.exceptions.InvalidAmountException;
import exception.bank_application.exceptions.LoanNotAllowedException;

public class BankAccount implements Bank {

    private double balance;
    public BankAccount(long accountNumber, double balance) {
        this.balance = balance;

    }

    @Override
    public void deposit(double amount) throws InvalidAmountException {
        if (amount<=0){
            throw new InvalidAmountException("the amount is less than or equal to zero");
        }else {
            System.out.println("New balance: "+(balance +=amount));
        }
    }

    @Override
    public void withDraw(double amount) throws InsufficientFundsException, InvalidAmountException {
    if (balance<=0){
        throw new InsufficientFundsException("the amount is less than or equal to zero.");
    }else if (amount<balance){
        throw new InvalidAmountException("the amount is less than or equal to zero");
    }else {
        System.out.println("After withdraw Amount is: "+(balance-=amount));;
    }
    }

    @Override
    public void applyLoan(double amount) throws LoanNotAllowedException, InvalidAmountException {
        if (balance<=5000){
            throw new LoanNotAllowedException("the loan amount exceeds the allowed limit");
        }else if (amount<=0){
            throw new InvalidAmountException("the amount is less than or equal to zero");
        }else {
            System.out.println("loan successfully");
            System.out.println("And credited to your Account: "+(balance+=amount));
        }
    }
    @Override
    public void transfer(BankAccount toAccount, double amount) throws AccountNotFoundException,InvalidAmountException{
        if (toAccount == null){
            throw  new AccountNotFoundException("the target account is not found");
        }else if (amount<=0){
            throw  new InvalidAmountException("the amount is less than or equal to zero.");
        }
        else {
            System.out.println("After transfer Amount is : "+(balance +=amount));;
        }
    }

    public double getBalance() {
        return this.balance;
    }
}
