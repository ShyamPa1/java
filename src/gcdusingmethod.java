import java.util.Scanner;

public class gcdusingmethod {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the num1");
        int num1=input.nextInt();
        System.out.println("enter the num2");
        int  num2=input.nextInt();
        System.out.println("the gcd of num1"+num1+"and  num2 is"+gcd(num1,num2));
    }
    public static int gcd(int n1,int n2){
        int gcd=1;
        int k=2;
        while (k<=n1&&k<=n2){
            if (n1%k==0&&n2%k==0)
                gcd=k;
            k++;
        }
        return gcd;

    }
}
