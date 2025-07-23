package blcandelclogic.taskinLab;

import java.util.Scanner;

public class GradeFinder {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        int grades = sc.nextInt();
        if(grades<0||grades>99){System.out.println("Error: Invalid Input");}else{
            char result = GradeEvaluator.findGrade(grades);
            System.out.println("Grade: "+result);}

    }
}

class GradeEvaluator{
    public static char findGrade(int grade){

        if(grade >=90){
            return 'A';
        }else if(grade>=75 &&grade<90){
            return 'B';
        }else if(grade>=60 &&grade<70){
            return 'C';
        }else{
            return 'D';
        }
    }
}