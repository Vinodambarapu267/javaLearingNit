package abstraction.interfaces.bank_application_using_interface;

public interface Bank {
    double getBalance();
    void deposit(double amount);
    void withdraw(double amount);
}
