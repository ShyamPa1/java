public class passingarraystomethods {
    public static void main(String[] args) {
        int x=1;
        int y[]=new int[10];
        m(x,y);
        System.out.println(x);
        System.out.println(y[3]);

    }
    public static void m(int num,int numbers[]){
        num=1001;
        numbers[3]=7;
    }
}
