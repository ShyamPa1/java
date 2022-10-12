import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("enter the array elemnets");
        for (int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("before sorting");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        bubble(arr);
        System.out.println("after the sorting");
        for (int i=0;i<arr.length;i++){
            System.out.println(" "+arr[i]);
        }

    }
    public static void bubble(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
