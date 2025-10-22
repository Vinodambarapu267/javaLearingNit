package thread.order_delivery_system_in_restaurant;

public class Restaurant {
    private String name;
    private String orderName;
    private boolean isOrderReady=false;

    public Restaurant(String name) {
        this.name = name;
    }


    public synchronized void placeOrder(String orderName) {
        this.orderName=orderName;
        System.out.println("Waiter: placed order for " + orderName);
        while (!isOrderReady) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Waiter: Serving the fried chicken");
        }

    }
    public synchronized void prepareOrder() {
            System.out.println("Chef: preparing " + orderName);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Chef: " + orderName + " is ready!\n");
            isOrderReady=true;
            notifyAll();

    }


}
