package basics;

import java.util.Scanner;

public class FahrenhitToCelsius {
    public static void main(String[] args) {
        float fahrenheitTocelsius;
        float celsiusTofahrenheit=0;
        Scanner scanner =new Scanner(System.in);
        String convertion = scanner.next();
        if(convertion.equals("fahrenheit")){
            System.out.println("enter a fahrenheit value: ");
            float fahrenheitInp = scanner.nextFloat();
            fahrenheitTocelsius = (fahrenheitInp-32)*5/9;
            System.out.println("celsuis  : "+fahrenheitTocelsius);
            return;
        }
        if(convertion.equals("celsius")){
            System.out.println("Enter a celsius value : ");
        float celsiusInp = scanner.nextFloat();
            celsiusTofahrenheit = ((9 * celsiusInp) / 5) + 32;
            System.out.println("Fahrenheit : "+celsiusTofahrenheit);
        }
    }
}
