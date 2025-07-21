package basics;

import java.util.Scanner;

public class AreaOfCylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       final double pi = (double) 22/7;
        System.out.println("Enter a radius of Cylinder : ");
       int radius = scanner.nextInt();
        System.out.println("Enter a height of cylinder : ");
       int height = scanner.nextInt();
       double totalSurfaceAreaOfCylinder = 2*pi*radius*(radius+height);
        System.out.println("Total surface area of cylinder : "+totalSurfaceAreaOfCylinder);
    }
}
