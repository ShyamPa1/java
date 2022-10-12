import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        int data;
        int sum=0;
        Scanner input=new Scanner(System.in);
        do {
            System.out.println("enter the data =");
            data=input.nextInt();
            sum+=data;
        }while (data!=0);
        System.out.println("the sum is="+sum);

    }
}
