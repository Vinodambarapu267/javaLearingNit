package thread.order_delivery_system_in_restaurant;

public class Chef extends Thread{
    private Restaurant restaurant;

    public Chef(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        restaurant.prepareOrder();
    }
}
