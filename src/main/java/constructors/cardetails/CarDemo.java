package constructors.cardetails;

import java.util.Scanner;

public class CarDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a car model");
        String name = sc.next();
        System.out.println("Enter a car year");
        int year = sc.nextInt();
        System.out.println("Enter a car price");
        double price = sc.nextDouble();
        Car car = new Car(name,year,price);
        System.out.println(car);
    }

}
