package abstraction.interfaces.loose_coupling;

public class Coffee implements HotDrink{

    @Override
    public void prepare() {
        System.out.println("preparing Coffee hot Drink");
    }
}
