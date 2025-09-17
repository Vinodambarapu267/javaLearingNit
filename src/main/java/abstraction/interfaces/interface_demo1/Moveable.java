package abstraction.interfaces.interface_demo1;

sealed public interface Moveable permits Car {
    int speed =120;
    void move();
}
non-sealed class  Car implements Moveable{

    @Override
    public void move() {
        System.out.println("car is moving with "+speed+" Speed");
    }
}
