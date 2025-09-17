package abstraction.interfaces.interface_demo1;



public class InterfaceDemo1 {
    public static void main(String[] args) {
        Moveable m = new Car();
        m.move();
        System.out.println("Speed of the Car is : "+Moveable.speed);
    }
}
