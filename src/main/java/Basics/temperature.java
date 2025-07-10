package Basics;

public class temperature {
    public static void main(String[] args) {
        int temp = Integer.parseInt(args[0]);
        float celsius = (float) ((temp - 32) * 5) /9;
        System.out.println("Celsius : "+celsius);
    }
}
