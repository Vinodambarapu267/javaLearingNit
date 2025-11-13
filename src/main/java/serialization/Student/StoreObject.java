package serialization.Student;

import java.io.*;
import java.util.Scanner;

public class StoreObject {
   public static void main() throws IOException {
        Scanner sc = new Scanner(System.in);
        var fos = new FileOutputStream("C:\\Users\\ambar\\OneDrive\\Desktop\\my folder\\java_codes\\student.txt");
        var oos = new ObjectOutputStream(fos);
        try (fos;oos;sc){
            int numOfObjects = sc.nextInt();
            for (int i=1;i<=numOfObjects;i++){
           Student student = Student.getStudentObject();
           oos.writeObject(student);
                System.out.println(student);
            }
            System.out.println("Object stored successfully");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
