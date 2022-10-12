import java.util.Scanner;

public class nestedloop {
    public static void main(String[] args) {
        String grade = null;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the marks");
        double score = input.nextDouble();
        if (score >= 90) {
            // System.out.println("the grade is A");
            System.out.println(grade);
            grade = "A";}

             else if (score >= 80) {
                System.out.println(grade);
                //System.out.println("the grade is B");
                grade = "B";}
             else if (score >= 70) {
                //System.out.println("the grade is C");
                System.out.println(grade);
                grade = "C";}
             else if (score >= 60) {
                System.out.println(grade);
                // System.out.println("the grade is D");
                grade = "D";}
                else
                //  System.out.println("he or she is fail");
                grade = "fail";
                System.out.println(grade);


        }
    }

