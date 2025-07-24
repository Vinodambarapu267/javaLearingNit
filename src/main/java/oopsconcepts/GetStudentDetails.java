package oopsconcepts;

public class GetStudentDetails {
    public static void main(String[] args) {
        Students student1 = new Students();
        student1.name="Vinod";
        student1.age=21;
        student1.height=5.2;
        student1.gender='M';
        student1.StudentDetails();
        Students student2 = new Students();
        System.out.println("_______________\n");
        student2.name="ram";
        student2.age=21;
        student2.height=5.2;
        student2.gender='M';
        student2.StudentDetails();
    }

}
