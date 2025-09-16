package abstraction.abstract_method;

abstract class Shape{
    public abstract void draw();
}
class Square extends Shape{

    @Override
    public void draw() {
        System.out.println("Square is drawing");
    }
}
class Cube extends Shape{

    @Override
    public void draw() {
        System.out.println("Cube is drawing");
    }
}
public class AbstractDemo1 {
    public static void main(String[] args) {
        Shape s = null;
        s=new Square();
        s.draw();
        s=new Cube();
        s.draw();
    }
}
