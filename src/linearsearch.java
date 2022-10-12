import java.util.Scanner;
public class linearsearch {
    public static void main(String[] args) {
        int key;
        int arr[]=new int[5];
        Scanner input =new Scanner(System.in);
        for (int i=0;i<arr.length;i++) {
            System.out.println("enter the elements in arr=");
             arr[i]=input.nextInt();
        }
        System.out.println("enter the kay value=");
        key=input.nextInt();
        System.out.println( linear(arr,key));
    }
    public static int linear(int arr[],int key){
        for (int i=0;i<arr.length;i++) {
            if (key == arr[i])
                return i;
        }
        return -1;
    }
}
