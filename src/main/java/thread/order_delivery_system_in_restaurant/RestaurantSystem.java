package thread.order_delivery_system_in_restaurant;

public class RestaurantSystem {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("KFC");
        Chef chef = new Chef(restaurant);
        Waiter waiter = new Waiter(restaurant);
        waiter.acceptOrder("fried chicken");
        waiter.start();
        chef.start();



    }
}
