import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        //int rows=6;
        Scanner input=new Scanner(System.in);
        System.out.println("number of rows=");
        int rows=input.nextInt();
        for (int i=1;i<=rows;i++){
            for (int k=rows;k>=i;k--){
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(j+"   ");
            }
            System.out.println("\n");
        }

    }
}
