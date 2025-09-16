package abstraction.abstract_method;

abstract class ATM{
    public abstract void withdraw(double amount);
    public abstract void deposit(double amount);
    public abstract void  pinChange();
}
class SBIATM extends ATM{
    @Override
    public void withdraw(double amount) {
        System.out.println("Making withdraw of "+amount+"Through SBI ATM");
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Making deposit of "+amount+"Through SBI ATM");
    }

    @Override
    public void pinChange() {
        System.out.println("Pin change Successfully");
    }
}
public class AbstractDemo2 {
    public static void main(String[] args) {
        ATM atm = new SBIATM();
        atm.deposit(20000);
        atm.withdraw(2000);
        atm.pinChange();
    }


}
