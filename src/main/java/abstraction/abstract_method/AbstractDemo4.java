package abstraction.abstract_method;

abstract class Animal{
    public abstract void checkup();
}
class Lion extends Animal{

    @Override
    public void checkup() {
        System.out.println("Lion checkup");
    }
}
class  Elephant extends Animal{

    @Override
    public void checkup() {
        System.out.println("Elephant checkup");
    }
}
public class AbstractDemo4 {
    public static void main(String[] args) {
        Animal lions [] ={new Lion(),new Lion(),new Lion()};
        regularAnimalCheck(lions);
        System.out.println("---------------------------------");
        Animal elephants []  =new Elephant[2];
        elephants[1]= new Elephant();
        elephants[0] = new Elephant();
        regularAnimalCheck(elephants);
    }
    public static void regularAnimalCheck(Animal animals[]){
        for (Animal animal:animals ){
            animal.checkup();
        }
    }
}
