package functional_programming;
interface Drawable{
    void draw();
}
public class FunctionalInterfaceDemo1 {
    public static void main(String[] args) {
        Drawable draw = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Drawing...");
            }
        };
        draw.draw();
    }
}
