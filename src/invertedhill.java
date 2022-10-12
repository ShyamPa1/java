import java.util.Scanner;

public class invertedhill {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter the num of rows");
        int row=input.nextInt();
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
