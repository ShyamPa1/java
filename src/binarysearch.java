import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("enter the elements in arr=");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int key;
        System.out.println("enter the key value=");
        key = input.nextInt();
        System.out.println(binary(arr,0,key,arr.length-1));

        }



    public static int binary(int arr[], int low, int key, int high) {

        while (low<=high) {
            int mid = (low + high) / 2;

        if (key == arr[mid]) {
           return mid;
        } else if (key<=arr[mid]) {
            return binary(arr,low,key,mid-1);
        } else {
            return binary(arr,mid+1,key,high);
        }
       }
        return -1;
    }
}
