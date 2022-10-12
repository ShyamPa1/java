public class overloading {
    public static void main(String[] args) {
        System.out.println(max("shyam","pavan"));
        System.out.println(max(3,7));
        System.out.println(max(5.6,6.34));
        System.out.println(max(2,3));
        System.out.println(max(5.6,6));
    }
    public static int max(int n1,int n2){
        if (n1<n2)
            return n2;
        else
            return n1;

    }
    public static double max(double n1,double n2){
        if (n1<n2)
            return n2;
        else
            return n1;
    }
    public static String max(String name,String village){
        if (name==village)
            return name;
        else
            return village;
    }
}