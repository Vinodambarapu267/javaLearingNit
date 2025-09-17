package abstraction.interfaces;

public class Bike implements Vehicle{

    @Override
    public void run() {
        System.out.println("Bike is running");
    }

    @Override
    public void horn() {
        System.out.println("Bike is having Horn: PEEP PEEP");
    }

   
}
