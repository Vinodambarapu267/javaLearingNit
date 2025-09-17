package abstraction.interfaces.loose_coupling;

public class Tea implements HotDrink{

    @Override
    public void prepare() {
        System.out.println("Preparing Irani Tea");
    }
}
