import java.util.Scanner;

public class numberinc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the num of rows");
        int row = input.nextInt();
        //int p=1;
        for(int i=1;i<=row;i++){
            int p=1;
            for(int j=1;j<=i;j++)
                System.out.print(p++);
               // if(p%2==0)
                   // System.out.print(1);
           // else
               // System.out.print(2);
            System.out.println();
        }
    }
}
