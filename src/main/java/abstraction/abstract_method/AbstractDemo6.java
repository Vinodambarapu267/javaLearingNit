package abstraction.abstract_method;

abstract class Vehicle{
    protected String name;
    protected int model;

    public Vehicle(String name, int model) {
        this.name = name;
        this.model = model;
    }
public abstract void run();
    @Override
    public String toString() {
        return null;
    }
}
class Bus extends Vehicle{

    public Bus(String name, int model) {
        super(name, model);
    }

    @Override
    public void run() {

    }

    @Override
    public String toString() {
        return "Bus name is"+name+" it Model is "+model;
    }
}
class Bike extends Vehicle{
    public Bike(String name, int model) {
        super(name, model);
    }

    @Override
    public void run() {
        System.out.println("bike is Running...");
    }
    @Override
    public String toString() {
        return "Bike name is"+name+" it Model is "+model;
    }
}
public class AbstractDemo6 {
    public static void main(String[] args) {
        Vehicle v= null;
        v= new Bike("honda",2024);
        v.run();
        System.out.println(v);
        v=new Bus("volvo ",2025);
        v.run();
        System.out.println(v);
    }
}
