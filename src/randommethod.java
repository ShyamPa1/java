import java.util.Scanner;

public class randommethod {
    public static void main(String[] args) {
        int number1=(int)(Math.random()*1000000000);
        int number2=(int)(Math.random()*10000);
       // if(number1<number2){
          //  int temp=number1;
         //   number1=number2;
          //  number2=temp;

      //  }

        Scanner input=new Scanner(System.in);
        System.out.println("waht is="+number1+"-"+number2+"?");
        int answer= input.nextInt();
        if(number1-number2==answer)
            System.out.println("you are correct");
        else
            System.out.println("your answer was wrong\n"+number1+"-"+number2+"is"+(number1-number2));


    }
}
