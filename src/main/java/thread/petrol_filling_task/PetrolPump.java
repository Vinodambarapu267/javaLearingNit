package thread.petrol_filling_task;

public class PetrolPump {
    public synchronized void refillCar(String carName) {

        try {System.out.println("<"+carName+"> started filling ");
            Thread.sleep(3000);
            System.out.println("<"+carName+"> completed filling ");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}