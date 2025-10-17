package thread.itc_program;

public class Depositor extends Thread{
    private Account account;

    public Depositor(Account account){
        this.account= account;
    }

    @Override
    public void run() {
        int []deposits= {1000,2000,5000};
        for (int deposit:deposits){
            account.deposit(deposit);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){

            }
        }
    }

}
