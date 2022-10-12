public class swapingnumbers {
    public static void main(String[] args) {
        int num1=1;
        int num2=5;
        System.out.println("before invoking num1 is"+num1+"num2 is"+num2);
        swap(num1,num2);
        System.out.println("after invoking num1 is "+ num1+"num2 is "+ num2);
    }
    public static void swap(int num1,int num2){
        System.out.println("inside the swap");
        System.out.println("before swaping the n1 is "+num1+"n2 is "+ num2);
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("after swaping the n1 is"+num1+"n2 is "+num2);
    }
}
