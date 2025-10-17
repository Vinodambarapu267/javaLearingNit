package thread.ola_cab_booking.process;

public class DriverAssignment extends  Thread{
    @Override
    public void run(){
        System.out.println("Driver found and assigned!");
    }
}
