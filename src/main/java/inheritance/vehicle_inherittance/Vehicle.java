package inheritance.vehicle_inherittance;

public class Vehicle {
    protected String make;
    protected String model;
    protected int year;

    public Vehicle(String make, String model, int year) {
        if(year<=0){
            System.out.println("Error Invalid Input");
        }
        this.make = make;
        this.model = model;
        this.year = year;
    }

}
