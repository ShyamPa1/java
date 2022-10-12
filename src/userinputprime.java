import java.util.Scanner;

public class userinputprime {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int count=0;
        for (int i=1;i<=num;i++){
            if (num%i==0)
                count++;
        }

        if(count==2)
            System.out.println("it is prime");
        else
            System.out.println("it is not a prime");
    }
}
