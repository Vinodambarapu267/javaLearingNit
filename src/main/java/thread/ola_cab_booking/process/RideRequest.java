package thread.ola_cab_booking.process;

public class RideRequest extends Thread{
    public void run() {
        System.out.println("User requested a ride...");
        try {
            Thread.sleep(2000);
            System.out.println("Searching for nearby drivers...");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
