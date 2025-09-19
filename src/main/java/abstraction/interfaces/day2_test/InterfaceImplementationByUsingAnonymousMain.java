package abstraction.interfaces.day2_test;
interface Printer{
    public abstract PrinterDemo print();
}
class PrinterDemo {
    public Printer getPrinter(){

        return new Printer() {
            @Override
            public PrinterDemo print() {
                System.out.println(" Hello from Printer implemented using Anonymous Inner Class!");
                return null;
            }
        };
    }
}
public class InterfaceImplementationByUsingAnonymousMain {
    public static void main(String[] args) {
       PrinterDemo d = new PrinterDemo().getPrinter().print();
    }
}
