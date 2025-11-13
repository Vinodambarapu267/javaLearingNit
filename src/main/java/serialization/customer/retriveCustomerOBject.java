package serialization.customer;


import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class retriveCustomerOBject {

    static void main() throws IOException, ClassNotFoundException {
        var fin = new FileInputStream("C:\\Users\\ambar\\OneDrive\\Desktop\\my folder\\java_codes\\CustomerObject.txt");
        var ois = new ObjectInputStream(fin);
        try (fin;ois){
            while (true) {
                Customer customer = (Customer) ois.readObject();
                System.out.println(customer);
            }
        }catch (EOFException e){
        System.out.println("End of file has Reached");   }
    }
}
