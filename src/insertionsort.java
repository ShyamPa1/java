import java.util.Scanner;

public class insertionsort {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("enter the length of arr");
     int arr[] =new int[input.nextInt()];
        System.out.println("enter the array elments");
     for (int i=0;i<arr.length;i++){
         arr[i]=input.nextInt();
     }
        System.out.println("before sorting the array elements");
     for (int i=0;i<arr.length;i++){
         System.out.println(arr[i]+" ");
     }
     insetion(arr);
        System.out.println("after sorting");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void insetion(int arr[]){
        for (int i=1;i<arr.length;i++){
            int currentvalue=arr[i];
            int j=i-1;
            while (j>=0&&currentvalue<arr[j]){
                arr[j+1]=arr[j];//swap the small with large
                j--;
            }
            arr[j+1]=currentvalue;// when the aove condition is flase
        }
    }
}
