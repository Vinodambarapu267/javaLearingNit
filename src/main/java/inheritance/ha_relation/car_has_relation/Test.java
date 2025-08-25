package inheritance.ha_relation.car_has_relation;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter Car brand: ");
        String maker= sc.next();
        System.out.println("Enter the car model: ");
        String model = sc.next();
        System.out.println("enter the manufacture year: ");
        int year= sc.nextInt();
        Car  car= new Car(maker,model,year);
        System.out.println(car);
    }
}
