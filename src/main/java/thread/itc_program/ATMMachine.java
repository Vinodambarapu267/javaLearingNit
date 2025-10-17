package thread.itc_program;

public class ATMMachine {
    public static void main(String[] args) {
        Account ac = new Account();
        Depositor depositor = new Depositor(ac);
        Drawer drawer = new Drawer(ac);
        drawer.start();
        depositor.start();
    }
}
