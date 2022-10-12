public class randomchar {
    public static char getrandomchar(char ch1,char ch2){

        return (char)(ch1+Math.random()*(ch2-ch1+1));
    }
    public static char getrandomlowercase(){
        return getrandomchar('a','z');
    }
    public  static char getrandomuppercase(){

        return getrandomchar('A','Z');
    }
    public static char getrandomdigitchar(){

        return getrandomchar('0','9');
    }

    public static void main(String[] args) {

        System.out.println(getrandomlowercase());
        System.out.println(getrandomuppercase());
        System.out.println(getrandomdigitchar());
    }
}
