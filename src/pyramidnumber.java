import javax.print.attribute.standard.OrientationRequested;
import java.util.Scanner;

public class pyramidnumber {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the number of lines");
        int numberoflines=input.nextInt();
        if(numberoflines<1||numberoflines>15){
            System.out.println("enter the digit=");
            System.exit(0);
        }
        for(int row=1;row<=numberoflines;row++){
            for(int column=1;column<=numberoflines-row;column++)
                System.out.print("    ");
            for(int num=row;num>=1;num--)
                System.out.print("   "+num);
            for(int num=2;num<=row;num++)
                System.out.print("   "+num);
            System.out.println();
        }
    }
}
