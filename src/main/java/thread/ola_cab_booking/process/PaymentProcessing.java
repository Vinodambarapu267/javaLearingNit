package thread.ola_cab_booking.process;

public class PaymentProcessing extends Thread{
    Thread th = new Thread();
    @Override
    public  void run(){
        System.out.println("Processing payment...");
        try {
            th.sleep(2000);
            System.out.println("Payment successful!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
