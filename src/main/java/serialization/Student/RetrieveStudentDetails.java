package serialization.Student;

import java.io.*;

public class RetrieveStudentDetails {
    static void main() throws IOException {
        var fos = new FileInputStream("C:\\Users\\ambar\\OneDrive\\Desktop\\my folder\\java_codes\\student.txt");
        var oos = new ObjectInputStream(fos);
        try (fos; oos) {
while (true){
    Student student = (Student) oos.readObject();
    System.out.println(student);
}
        } catch (Exception e) {
            System.out.println("End of file reached...");
        }
    }
}
