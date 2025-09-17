package abstraction.interfaces.multiple_inheritance;



interface Alpha{
    void m1();
}
interface Beta{
    void m2();
}
class Implementer implements Alpha,Beta{

    @Override
    public void m1() {
        System.out.println("m1 method is implemented");
    }

    @Override
    public void m2() {
        System.out.println("m2 method is implemented");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        Implementer i= new Implementer();
        i.m1();
        i.m2();
    }
}
