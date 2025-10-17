package thread.itc_program;

public class Account {
    private int balance=0;

    public synchronized void withDraw(int amount){
        while (balance<amount){
            try {
                System.out.println("Insufficient balance");
                wait();

            } catch (InterruptedException e) {

            }
        }
        balance = balance-amount;
        System.out.println(" After withdraw amount : "+this.balance);
    }
    public synchronized void deposit(int amount){
        balance+=amount;
        System.out.println("After deposit amount :"+this.balance);
        notify();
    }
}
