package inheritance.vehicle_inherittance;

public class Car extends Vehicle{
    protected int numberOfDoors;

    public Car(String make, String model, int year, int numberOFDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOFDoors;
    }
    public void displayDetails(){
        System.out.println("Engine Details:");
        System.out.println("Make : "+make);
        System.out.println("Model : "+model);
        System.out.println("Year : "+year);
        System.out.println("Number of Doors"+ numberOfDoors);
    }
}
