public class arraycopying {

    public static void main(String[] args) {
        int firstarray[]=new int[5];//create array
        firstarray[0]=1;//create array elements
        firstarray[1]=2;
        firstarray[2]=3;
        firstarray[3]=4;
        for (int i=0;i<firstarray.length;i++){
            System.out.print(firstarray[i]+" ");
        }
        /*int nextarray[]=new int[firstarray.length];
        for (int i=0;i<nextarray.length;i++){
            nextarray[i]=firstarray[i];
            System.out.print(nextarray[i]+" ");
        }*/

    }
}
