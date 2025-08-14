package inheritance.virtualzoomanagement;

public class Dog extends Mammal{
    private String breed;

    public Dog(String name, boolean hasFur, String breed) {
        super(name, hasFur);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Animal Name: "+getName()+
                "\nHas Fur: "+isHasFur()+
                "\nBreed: "+breed;
    }
}
