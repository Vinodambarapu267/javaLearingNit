package thread.itc_program;

public class Drawer extends Thread {
    private Account account;

    public Drawer( Account account) {

        this.account = account;
    }

    @Override
    public void run() {
        int[] withdrawals = {1000, 3000, 500};
        for (int withdraw : withdrawals) {
            account.withDraw(withdraw);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
