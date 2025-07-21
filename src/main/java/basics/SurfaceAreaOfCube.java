package basics;

import java.util.Scanner;

public class SurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int side = scanner.nextInt();
        int surfaceAreaOfCube = 6*side;
        System.out.println("Surface Area of a cube : "+surfaceAreaOfCube);
    }
}
