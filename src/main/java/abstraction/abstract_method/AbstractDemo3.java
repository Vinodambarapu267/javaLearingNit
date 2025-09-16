package abstraction.abstract_method;

abstract class Car{
    protected int speed = 120;

    public Car() {
        System.out.println("car class constructor ");
    }
    public void getCarDetails(){
        System.out.println("It has four wheels and one engine");
    }
    public abstract void run();
}

class Honda extends Car{

    @Override
    public void run() {
        System.out.println("Honda Car is running!!!");
    }
}

public class AbstractDemo3 {
    public static void main(String[] args) {
        Car c = new Honda();
        c.getCarDetails();
        c.run();
        System.out.println("Speed Of the Car is :"+c.speed);

    }
}
