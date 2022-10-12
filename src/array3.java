import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        final int totalnumberofelements=6;
        int numbers[]=new int[totalnumberofelements];//create an array
        Scanner input =new Scanner(System.in);
        for (int i=0;i<numbers.length;i++){
            System.out.println("enter the element in array=");
            numbers[i]=input.nextInt();//storing the elements in array


        }
        int max=numbers[0];           //largest element in array
        for (int i=1;i<numbers.length;i++){
            if (max<numbers[i])
                max=numbers[i];        //updating the largest element
        }
        int count=0;
        for (int i=0;i<numbers.length;i++){
            if (numbers[i]==max)
                count++;
        }

        for (int i=0;i<numbers.length;i++){//printing the array elements

            System.out.println(numbers[i]);
        }
        System.out.println("the largest element="+max);//printing the largest element
        System.out.println("the cout"+count);
        }
    }

