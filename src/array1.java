public class array1 {
    public static void main(String[] args) {
        int mylist[]={2,4,5,6,7};
       System.out.println(mylist[4]);
       //return mylist;
        char[] city={'s','h','y','a','m'};
        System.out.println(city);

       // double[] list={1.9,2.9};
        //System.out.println(list);
        int array[]=new int[5];
        array[0]=1;
        array[1]=2;
        array[2]=3;
        array[3]=4;
        array[4]=5;
        for (int i=0;i<array.length;i++){
            int total=0;
            total += array[i];
            //System.out.print(array[i]+" ");
            System.out.print(total);



        }




    }
}
