public class testrandomchar {
    public static void main(String[] args) {

        final int number_of_chars=150;
        final int number_of_chars_per_line=20;
        for (int i=1;i<=number_of_chars;i++){
            char ch=randomchar.getrandomlowercase();
            if ((i+1)%number_of_chars_per_line==0)
            System.out.println(ch);
            else
                System.out.print(ch);
            char k=randomchar.getrandomdigitchar();
            System.out.print(k);
        }
        int k=overloading.max(3,5);
        System.out.println("\n"+k);


    }
}
