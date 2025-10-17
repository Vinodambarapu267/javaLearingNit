package thread.ola_cab_booking.process;

public class RatingSystem extends Thread{
    Thread t= new Thread();
    @Override
    public void run() {
        try {
            System.out.println("Requesting user rating...");
            t.sleep(1000);
            System.out.println("User rated the ride: 5 star");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
