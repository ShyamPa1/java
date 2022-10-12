import java.util.Scanner;

public class hillpattren {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the num of rows");
        int row=input.nextInt();
        //int p=1;
        for (int i=1;i<=row;i++){

            for (int j=i;j<=row;j++)
                System.out.print("  ");
           // int p=row;
            for (int k=row;k>=1;k++)
                System.out.print(k +" ");

            for (int s=2;s<=row;s++)
                System.out.print(s+" ");
            System.out.println();
        }

    }
}
