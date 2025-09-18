package abstraction.interfaces.interface_static_method.calculator;

public class Test{
    public static void main(String[] args) {
        double sum = Calculator.doSum(12,3);
        System.out.println("Sum is :"+sum);
        double square = Calculator.getSquare(12);
        System.out.println("Square is: "+square);
    }
}
