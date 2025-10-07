package exception;

import java.util.Scanner;

public class AreaCalculationMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double len = sc.nextDouble();
        double width = sc.nextDouble();
        try {
            if (len<=0||width<=0){
                throw  new IllegalStateException(" Length and width must be > 0.");
            }
            else System.out.println(calculateArea(len,width));
        }catch (IllegalStateException e){
            System.out.println(e);
        }
    }

public  static double calculateArea(double len,double wid){

        return  len*wid;
}
}
