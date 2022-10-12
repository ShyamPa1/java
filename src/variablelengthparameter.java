public class variablelengthparameter {
    public static void main(String[] args) {
        varlen(34,4,5,6,7,6,6,3,4,5,6);
        varlen(new double[]{2,5,6,7,});

    }
    public static void varlen(double...num){
    if (num.length==0){
        System.out.println("no argument is passed");
    }
    double max=num[0];
    for (int i=1;i<num.length;i++){
        if (max<num[i])
            max=num[i];
    }
        System.out.println("the max is"+max);

    }
}
