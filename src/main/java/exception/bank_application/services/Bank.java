package exception.bank_application.services;

import exception.bank_application.exceptions.AccountNotFoundException;
import exception.bank_application.exceptions.InsufficientFundsException;
import exception.bank_application.exceptions.InvalidAmountException;
import exception.bank_application.exceptions.LoanNotAllowedException;

public interface Bank {
    void deposit(double amount) throws InvalidAmountException;
    void withDraw(double amount) throws InsufficientFundsException,InvalidAmountException;
    void transfer(BankAccount toAccount, double amount) throws AccountNotFoundException,InvalidAmountException;
    void applyLoan(double amount) throws LoanNotAllowedException,InvalidAmountException;
    double getBalance();
}
