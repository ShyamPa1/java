import java.util.Scanner;

public class guess {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 101);
        Scanner input = new Scanner(System.in);
        System.out.println("guess the magic number between 0 and 100");
       int guess = 0;
        while (guess != number) {
            System.out.println("enter your guess=");
             guess = input.nextInt();
            if (guess == number)
                System.out.println("yes it is correct");
            else if (guess > number)
                System.out.println("it is big number");
            else
                System.out.println("it is low");
        }
    }
}