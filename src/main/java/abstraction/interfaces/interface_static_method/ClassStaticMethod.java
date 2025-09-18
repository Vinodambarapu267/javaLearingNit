package abstraction.interfaces.interface_static_method;

class Alpha{
    public static void m1(){
        System.out.println("Static Method of Alpha class");
    }
}
class Beta extends Alpha{
    public static void m1(){
        System.out.println("Static Method of Beta class");
    }
}

public class ClassStaticMethod {
    public static void main(String[] args) {
        Beta.m1();
        System.out.println("----------");
        new Alpha().m1();
    }
}
