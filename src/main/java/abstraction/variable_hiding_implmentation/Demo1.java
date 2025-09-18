package abstraction.variable_hiding_implmentation;
interface Alpha{
    int x=100;
}
abstract class Beta{
    int x=Alpha.x;
}
class Gamma extends Beta implements Alpha{
 int x=300;
 public void m1(){
     System.out.println(super.x);
 }
}
public class Demo1 {
    public static void main(String[] args) {
      Gamma  g =  new Gamma();
      g.m1();
        System.out.println(g.x);
    }
}
