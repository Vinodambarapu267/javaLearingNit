package test.rectangle;

import java.util.Scanner;

public class RectangleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a length");
        int len = sc.nextInt();
        System.out.print("Enter a width");
        int wid = sc.nextInt();
        Rectangle rectangle = new Rectangle(len,wid);
        System.out.println("area is "+rectangle.area());
        System.out.println("perimeter is:"+rectangle.perimeter());

    }
}
