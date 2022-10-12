public class firstnprimenumbers {
    public static void main(String[] args) {
        int cout=0;
        int num=50;
        for (int i=1;i<=num;i++){
            cout=0;
            for (int j=2;j<i;)
            {
                if (i%j==0)
                    cout++;
                break;
            }
            if (cout==0)
                System.out.println(i);
        }
    }
}
