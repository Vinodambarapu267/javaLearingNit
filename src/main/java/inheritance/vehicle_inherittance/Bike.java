package inheritance.vehicle_inherittance;

public class Bike extends Vehicle{
    protected String type;

    public Bike(String make, String model, int year, String type) {
        super(make, model, year);
        this.type = type;
    }
    public  void  displayDetails(){
        System.out.println("___________________");
        System.out.println("Bike Details:");
        System.out.println("Make : "+make);
        System.out.println("Model : "+model);
        System.out.println("Year : "+year);
        System.out.println("Type: "+ type);
    }
}
