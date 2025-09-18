package abstraction.interfaces.interface_static_method;


interface Alpha1{
    static void m1(){
        System.out.println("static Method of Interface Alpha");
    }
}
class Beta1 implements Alpha1{

}
public class InterfaceStaticMethod {
    public static void main(String[] args) {
        Alpha.m1();
    }
}
