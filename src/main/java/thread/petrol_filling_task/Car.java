package thread.petrol_filling_task;

public class Car implements Runnable{
    String name;
PetrolPump petrolPump;

    public Car(String name, PetrolPump petrolPump) {
       this.name=name;
        this.petrolPump = petrolPump;
    }

    public void run(){
        petrolPump.refillCar(name);
    }
}
