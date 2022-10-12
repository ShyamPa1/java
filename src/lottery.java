import java.util.Scanner;

public class lottery {
    public static void main(String[] args) {
        int lottery=(int)(Math.random()*100);
        Scanner input=new Scanner(System.in);
        System.out.println("enter the guess ");
        int guess= input.nextInt();
        if(lottery==guess)
            System.out.println("exact match you won 100rs ");
       else if(lottery/10==guess%10&&lottery%10==guess/10)
            System.out.println("you r 2nd won 1ors");
        else if(lottery/10==guess%10||lottery%10==guess/10||lottery/10==guess/10||lottery%10==guess%10)
            System.out.println("u r 3rd u won 1rs");
        else
            System.out.println("sorry u dont get");


    }
}
