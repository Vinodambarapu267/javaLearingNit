package inheritance.demo;

public class Son extends Father{
    public  void car(){
        System.out.println("audi car");
    }

    public static void main(String[] args) {
        Son son= new Son();
        son.car();
        son.house();
       
    }
}
