package constructors.cardetails;

public class Car {
    private  String name;
    private int year;
    private double price;

    public Car(String name, int year, double price) {
        if(year<2010){
            System.err.println("year must be greater than 2010");
            System.exit(0);
        }
        if (price<0){
            System.err.println("price must be positive integer");
            System.exit(0);
        }
        this.name = name;
        this.year = year;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {

        this.year = year;

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
