package inheritance.ha_relation.car_has_relation;

import java.util.Scanner;

public class Car {
    private String make;
    private  String model;
    private int year;
    private  Engine engine;

    public Car(String make, String model, int year) {
        if(year<=0){
            System.err.println("Enter the positive year");
            System.exit(0);
        }
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the engine model: ");
        String engineModel= sc.nextLine();
        System.out.println("enter engine capacity: ");
        int capacity = sc.nextInt();
        this.make = make;
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineModel,capacity);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car[" +
                "make='" + make  +
                ", model='" + model  +
                ", year=" + year +
                ", engine=" + engine +
                ']';
    }
}
