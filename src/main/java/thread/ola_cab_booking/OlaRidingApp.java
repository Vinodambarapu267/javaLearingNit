package thread.ola_cab_booking;


import thread.ola_cab_booking.process.*;

public class OlaRidingApp {

    public static void main(String[] args) {
        RideRequest request = new RideRequest();
        FareCalculation fareCalculation = new FareCalculation();
        DriverAssignment driverAssignment = new DriverAssignment();
        LiveTracking tracking = new LiveTracking();
        PaymentProcessing processing = new PaymentProcessing();
        RatingSystem ratingSystem = new RatingSystem();

        try {
            request.start();
            fareCalculation.start();
            request.join();
            driverAssignment.start();
            tracking.start();
            tracking.join();
            processing.start();
            processing.join();
            ratingSystem.start();

        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
            System.err.println("ride is interupted");
        }
//Thread t= new Thread(){
//    @Override
//    public void run() {
//        System.out.println("User requested a ride...");
//        try {
//            sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("Searching for nearby drivers...");
//    }
//};
//t.setName("RideRequest");
//t.start();
    }
}
