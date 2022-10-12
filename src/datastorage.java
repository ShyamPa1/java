import java.util.Scanner;

public class datastorage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       /* System.out.println("enter the digit(the program exit when the digit is zero)=]");
        int data=input.nextInt();
       int sum=0;
        while (data!=0){
           sum+=data;
            System.out.println("(the program exit if the data is zero)enter the value=");
            data=input.nextInt();
        }
        System.out.println("the sum is="+sum);*/
        double value=Math.pow(Math.sqrt(2),2)-2;
        if (value==0)
            System.out.println("it is zero");
        else
            System.out.println("it is not a zero");
    }
}

