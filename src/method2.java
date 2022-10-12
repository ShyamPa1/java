import java.util.Scanner;

public class method2 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("enter the num1:");
        int num1= inp.nextInt();
        System.out.println("enter the num2:");
        int num2= inp.nextInt();
        int sum=sum(num1,num2);
        System.out.println(sum);

    }
    public static int sum(int i,int j){
        int result;
        result=i+j;
        return result;
    }
}
