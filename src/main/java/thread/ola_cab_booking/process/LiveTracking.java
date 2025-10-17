package thread.ola_cab_booking.process;

public class LiveTracking extends Thread
{
    @Override
    public void run() {
        for (int i=20;i<=100;i+=20){
            System.out.println("Updating ride location... "+i+"% completed" );
        }
        System.out.println("Ride Completed");
    }
}
