package constructors.rectangle;

import java.util.Scanner;

public class RectangleDemo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter width: ");
        double width = sc.nextDouble();
        System.out.println("enter height: ");
        double height = sc.nextDouble();
        Rectangle rec = new Rectangle(width,height);
        System.out.println("Perimeter of Rectangle: "+rec.getParameter());
        System.out.println("Area of Rectangle: "+rec.getArea());
    }
}
