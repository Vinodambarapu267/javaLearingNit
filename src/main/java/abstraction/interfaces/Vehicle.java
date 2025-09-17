package abstraction.interfaces;

public interface Vehicle{
    void run();
    void horn();
    default void digitalMeter(){
        System.out.println("Digital Meter facility is coming soon...");
    }
}
