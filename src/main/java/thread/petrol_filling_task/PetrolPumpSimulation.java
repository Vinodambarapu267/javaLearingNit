package thread.petrol_filling_task;

import java.util.Scanner;

public class PetrolPumpSimulation {
    public static void main(String[] args) {
        System.out.println("Enter a number of cars");
       Scanner sc= new Scanner(System.in);
        PetrolPump p = new PetrolPump();
int count = sc.nextInt();
        Car []cars = new Car[count];
        for (int i=0;i<count;i++){
            String name = sc.next();
           Thread t = new Thread(new Car(name,p));
           t.start();

        }


    }
}
