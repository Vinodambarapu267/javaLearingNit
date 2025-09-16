package abstraction.abstract_method;
abstract class Alpha{
    public abstract void show();
    public abstract void demo();
}
abstract class Beta extends Alpha{
    public void show(){
        System.out.println("show method is overridden in beta class");
    }
}
class Gamma extends Beta{

    @Override
    public void demo() {
        System.out.println("demo method is overridden in gamma class");
    }
}
public class AbstractDemo5 {
    public static void main(String[] args) {
        Gamma g=new Gamma();
        g.demo();
        g.show();
    }
}
