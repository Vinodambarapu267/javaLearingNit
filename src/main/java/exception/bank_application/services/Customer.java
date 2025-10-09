package exception.bank_application.services;

public class Customer {
    private final String name;
    private final BankAccount account;
    public Customer(String name, BankAccount account) {
        this.name = name;
        this.account = account;
    }
    public String getName() {
        return name;
    }
    public BankAccount getAccount() {
        return account;
    }
}
