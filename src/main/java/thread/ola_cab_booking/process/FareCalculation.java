package thread.ola_cab_booking.process;

public class FareCalculation extends Thread{
    @Override
    public void run() {
        System.out.println("Calculating estimated fare...");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Estimated fare: 135.75 RS.");
    }
}
