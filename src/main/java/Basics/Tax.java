package Basics;

public class Tax {
    public static void main(String[] args) {
        int n = 990000;
        float tax = (float) (n*4.9)/100;
        float totalAmonut = tax+n;
        System.out.println(totalAmonut);
    }
}
