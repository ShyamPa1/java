import java.util.Scanner;

public class gcd1  {
    public static void main(String[] args) {

        // find GCD between n1 and n2
        Scanner INPUT =  new Scanner(System.in);
        System.out.println("enter the number 1=");
        int n1= INPUT.nextInt();
        System.out.println("enter the number 2=");
        int n2=INPUT.nextInt();

        // initially set to gcd
        int gcd = 1;

        for (int i = 1; i <= n1 && i <= n2; ++i) {

            // check if i perfectly divides both n1 and n2
            if (n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }

        System.out.println("GCD of " + n1 +" and " + n2 + " is " + gcd);
    }

}
