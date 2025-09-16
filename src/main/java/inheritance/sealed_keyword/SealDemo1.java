package inheritance.sealed_keyword;

sealed class  Bird permits Parrot,Sparrow{
    public void fly(){
        System.out.println("Generic bird is flying");
    }
}
non-sealed class Parrot extends Bird{
    @Override
    public void fly(){
        System.out.println("parrot bird is flying");
    }
}
non-sealed class Sparrow extends Bird{
    @Override
    public void fly(){
        System.out.println("Sparrow bird is flying");
    }
}

public class SealDemo1 {
    public static void main(String[] args) {
        Bird b  = null;
        b=new Parrot();
        b.fly();
        b = new Sparrow();
        b.fly();
    }

}
