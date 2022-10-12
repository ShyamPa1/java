public class shiftingarray {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7,8};
        System.out.println("input array:");
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        int last=array[7];
        for (int j=array.length-1;j>array[0];j--){
            array[j]=array[j-1];
        }
        array[0]=last;
        System.out.println();
        System.out.println("out put array:");
        for (int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
