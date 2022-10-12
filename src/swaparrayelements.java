public class swaparrayelements {
    public static void main(String[] args) {
        int array[]={1,2};
        System.out.println("before invoking swap="+array[0]+"and"+array[1]);
        swap(array[0],array[1]);
        System.out.println("after the invoking of swap"+array[0]+"and"+array[1]);
        System.out.println("before invoking sceondswap"+array[0]+"ad"+array[1]);
        secondswap(array);
        System.out.println("after invoking second swap"+array[0]+"and"+array[1]);;

    }
    public static void swap(int n1,int n2){
        int temp=n1;
        n1=n2;
        n2=temp;
    }
    public static void secondswap(int []arrays){
        int temp=arrays[0];
        arrays[0]=arrays[1];
        arrays[1]=temp;
    }
}
