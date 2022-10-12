import java.util.Scanner;

public class dimondstar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the num of rows");
        int row=input.nextInt();
        for (int i=1;i<row;i++){
            for (int j=i;j<=row;j++)
                System.out.print(" ");
            for (int k=1;k<=i;k++)
                System.out.print("*");
            for (int s=1;s<i;s++)
                System.out.print("*");
            System.out.println();
        }
        for (int s=1;s<=row;s++){
            for(int j=1;j<=s;j++){
                System.out.print(" ");}
            for (int a=s;a<row;a++){
                System.out.print("*");}
            for (int k=s;k<=row;k++){
                System.out.print("*");}

            System.out.println();
        }
    }
}
