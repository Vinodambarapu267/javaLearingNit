package basics;

public class StringToDouble {
    public static void main(String[] args) {
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        System.out.println(num1*num2);
    }
}
