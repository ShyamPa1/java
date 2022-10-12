import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {

        //System.out.println("            now finding the greater common divisor");
        Scanner INPUT =  new Scanner(System.in);
        System.out.println("enter the number 1=");
        int n1= INPUT.nextInt();
        System.out.println("enter the number 2=");
        int n2=INPUT.nextInt();
        int gcd=1;
        int k=1;
        while(k<=n1&&k<=n2){
            if(n1 % k==0 && n2 % k==0)

            gcd=k;
            k++;
        }
        System.out.println("the greater common divisorof"+n1+"and"+n2+"is"+gcd);
    }
}
