package abstraction.interfaces;

public class Car implements Vehicle{

    @Override
    public void run() {
        System.out.println("Car is running...");
    }

    @Override
    public void horn() {
        System.out.println("car is having Horn : POP POP");
    }

    @Override
    public void digitalMeter() {
        System.out.println("Car is having Digital Meter");
    }
}
