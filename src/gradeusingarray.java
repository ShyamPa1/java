import java.util.Scanner;

public class gradeusingarray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number of students=");
        int numberofstudents=input.nextInt();
        int scores[]=new int[numberofstudents];
        int best=0;
        char grade;
        for (int i=0;i<scores.length;i++){
            System.out.println("enter the scores=");
            scores[i]=input.nextInt();
            if (scores[i]>best)
                best=scores[i];
        }
        String output=" ";
        for (int i=0;i<scores.length;i++){
            if (scores[i]>=best-10)
                grade='A';
            else if (scores[i]>=best-20)
                grade='B';
            else if (scores[i]>=best-30)
                grade='C';
            else
                grade='F';
            output+=grade;

        }
        System.out.println(output);

    }
}
