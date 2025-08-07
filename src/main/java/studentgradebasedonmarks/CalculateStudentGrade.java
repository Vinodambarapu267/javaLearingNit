package studentgradebasedonmarks;

public class CalculateStudentGrade {

    public static StudentGrade calculateGrade(Student student){
       int marks = student.getMarks();
       char grade;
        if (marks>=90){
        grade='A';
        } else if (marks>=75) {
            grade ='B';
        } else if (marks>=60) {
            grade='C';
        }else if(marks>35){
            grade='D';
        }else {
            grade ='F';
        }
        return new StudentGrade(student,grade);
    }
}
