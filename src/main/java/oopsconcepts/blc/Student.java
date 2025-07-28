package oopsconcepts.blc;
//blc
public class Student {
      int studentId;
    String studentName;
     int studentMarks;
    char studentGrade;

    @Override
    public String toString() {
        return "Student : [" +

                ", Name='" + studentName + '\'' +
                "Student ID=" + studentId +
                ", Marks=" + studentMarks +
                ", Grade=" + studentGrade +
                ']';
    }

    public   void setStudentData(int id,int marks, String name){
        studentId =id;
        studentName=name;
        studentMarks=marks;
    }
    public  void calculate(){
        if(studentMarks>=90){
            studentGrade ='A';
        }else if(studentMarks>=80){
            studentGrade ='B';
        }else if(studentMarks>=70){
            studentGrade ='C';
        }else if(studentMarks>=60){
            studentGrade ='D';
        }else {
            studentGrade ='E';
        }
}}
