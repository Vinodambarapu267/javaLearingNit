package collection_packages.arraylist.Online_Cab_Booking;

public record Customer(Integer id, String customerName, String pickupLocation, String dropLocation, Integer distance,
                       String phone) {
    public Customer {
        if (customerName.isBlank() || customerName == null) {
            throw new IllegalArgumentException("Customer name cannot be null or blank.");
        }
        if (id < 0) {
            throw new IllegalArgumentException("Customer ID must be positive.");
        }
        if (pickupLocation.isBlank() || pickupLocation == null) {
            throw new IllegalArgumentException("Pickup location cannot be null or blank.");
        }
        if (dropLocation.isBlank()) {
            throw new IllegalArgumentException("Drop location cannot be null or blank");
        }
        if (distance < 0) {
            throw new IllegalArgumentException("Distance cannot be negative.");
        }
        if (phone.length() < 10) {
            throw new IllegalArgumentException("Phone number must be 10 digits only");
        }
    }
}
