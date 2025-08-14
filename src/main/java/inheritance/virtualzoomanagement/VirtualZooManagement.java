package inheritance.virtualzoomanagement;

import java.util.Scanner;

public class VirtualZooManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        boolean hasFur = Boolean.parseBoolean(sc.next());
        String breed = sc.next();
        Dog dog = new Dog(name,hasFur,breed);
        System.out.println(dog);
    }
}
