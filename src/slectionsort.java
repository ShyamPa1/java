import java.util.Scanner;

public class slectionsort {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.print("enter the arr elements=");
        for (int i = 0; i <= arr.length-1; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("before sortig arr elements is=");
        for (int i = 0; i < arr.length; i++) {
            System.out.println( arr[i]);
        }
        selection(arr);
        System.out.println("after sorting the arr elements is=");
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void selection(int arr[]){
     for (int i=0;i< arr.length-1;i++){
       int smallest=i;
       for (int j=i+1;j< arr.length;j++) {
           if (arr[j] < arr[smallest]) {
               smallest = j;
           }
       }
           int temp=arr[smallest];
           arr[smallest]=arr[i];
           arr[i]=temp;

     }
    }
}
