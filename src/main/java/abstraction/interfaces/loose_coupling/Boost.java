package abstraction.interfaces.loose_coupling;

public class Boost implements HotDrink{

    @Override
    public void prepare() {
        System.out.println("preparing Boost hot Drink");
    }
}
