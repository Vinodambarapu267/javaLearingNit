/* Develop a program using a functional interface to check whether a Car is eligible for sale.
Record Name: Car
brand : String
price : Double
mileage : Integer
Class Name: CarSelling (ELC)
In the main method, read the car details using Scanner.
Write a Predicate<Car> to check eligibility based on:
Car price should be ≤ 5,00,000
Car mileage should be ≥ 20
If eligible, print:
<brand> is eligible for sale
Otherwise, print::
 <brand> is not eligible for sale
Input Format
Brand name (String)
Price (Double)
Mileage (Integer)
Output Format
Eligibility result in the given format.
*/
package functional_programming;
import java.util.Scanner;
import java.util.function.Predicate;

record Car(String brand,Double price,Integer mileage){
}
public class  CarSelling{
    public static void main(String []args){
        Predicate<Car> check =c->c.price()<=500000
                &&
                c.mileage()>=20;
        Scanner sc = new Scanner(System.in);
        String brand = sc.nextLine();
        double price = sc.nextDouble();
        int mileage = sc.nextInt();
        Car car = new Car(brand,price,mileage);
        if (check.test(car)) {
            System.out.println(brand + " is eligible for sale");
        } else {
            System.out.println(brand + " is not eligible for sale");
        }
    }
}