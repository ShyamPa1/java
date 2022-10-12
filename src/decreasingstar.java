import java.util.Scanner;

public class decreasingstar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the num of rows");
        int row=input.nextInt();
        for (int i=1;i<=row;i++){
            for (int j=i;j<=row;j++)
                System.out.print("$");
            System.out.println();
        }
    }
}
