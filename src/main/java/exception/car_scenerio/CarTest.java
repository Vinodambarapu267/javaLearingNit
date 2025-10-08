package exception.car_scenerio;

public class CarTest {
    public static void stop (String message)throws CarStoppedException{
if (message.equals("go")){
    throw new CarStoppedException("Car not stalled.");
}else{
        throw new CarStoppedException("Car stopped for some reason.");
    }}
    public static void puncture (String message)throws CarPuncutureException{
        if (message.equals("puncture")){
    throw  new CarPuncutureException("Car is punctured.");
        }
        else {
    throw new CarPuncutureException("Car not punctured.");
}
}
    public static void carHeat (int deg)throws CarHeatedException{
       if (deg<50){
           throw  new CarHeatedException("Car temperature normal.");
       }
       else {
           throw  new CarHeatedException("Car is heated more than 50 degrees Celsius.");
       }
    }

}
