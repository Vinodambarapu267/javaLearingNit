package exception.car_scenerio;
import java.util.Scanner;

public class CarUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.next());
        try {
            switch (choice){
                case 1-> {String stop = sc.next();
                            CarTest.stop(stop);
                        }
                case 2->{
                    String puncture= sc.next();
                    CarTest.puncture(puncture);
                }
                case 3->{
                    int degree = Integer.parseInt(sc.next());
                    CarTest.carHeat(degree);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            }

    }
}
