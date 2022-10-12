import javax.swing.*;
import java.util.Scanner;

public class subtractionusingloop {
    public static void main(String[] args) {
        final int number_of_questions=5;
        int correctcount=0;
        int count=0;
        String output="";
        long starttime=System.currentTimeMillis();

        Scanner input=new Scanner(System.in);
        while(count<number_of_questions) {
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);
            System.out.println("what is" + number1 + "-" + number2 + "?");
            int answer = input.nextInt();
            if (number1 - number2 == answer) {
                System.out.println("you are correct");
                correctcount++;
            } else
                System.out.println("your answer was wrong\n" + number1 + "-" + number2 + "should be" + (number1 - number2));
            count++;

       output+="\n"+number1+"-"+number2+"="+answer+((number1-number2==answer) ? "correct":"wrong");

        }
        long endtime=System.currentTimeMillis();
        long testtime=endtime-starttime;
        System.out.println("correct count is"+correctcount+"\ntest time is"+testtime/1000+"seconds"+output);
    }
}
