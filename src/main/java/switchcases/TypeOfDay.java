package switchcases;

import java.util.Scanner;

public class TypeOfDay {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String day = sc.nextLine().toLowerCase();
        String result = switch (day){
            case "monday","tuesday","wednesday ","thursday","friday"->"weekday";
                case "satursday","sunday" -> "weekend";
                default ->"not valid day ";
        };
        System.out.println(result);
    }
}
