package abstraction.interfaces.loose_coupling;

import java.util.Scanner;

public class LooseCouplingDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the option in Below\n 1. Tea \n 2. Coffee\n 3. Boost");
        int input =sc.nextInt();

        switch (input){
            case 1-> Restaurant.acceptAndPrepare(new Tea());
            case 2-> Restaurant.acceptAndPrepare(new Coffee());
            case 3-> Restaurant.acceptAndPrepare(new Boost());
        }



    }
}
