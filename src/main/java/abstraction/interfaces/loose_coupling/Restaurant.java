package abstraction.interfaces.loose_coupling;

public  class Restaurant{
    public static void acceptAndPrepare(HotDrink hd){
        hd.prepare();
    }
}
