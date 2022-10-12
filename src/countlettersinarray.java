import java.util.Random;

public class countlettersinarray {
    public static void main(String[] args) {
        char chars[]=createarray();
        System.out.println("the elements in array=");
        displayarray(chars);
        int count[]=counts(chars);
        System.out.println("the occurence of each letter=");
        displaycount(count);

    }
    public static char[] createarray(){
        char[] chars=new char[100];
        for (int i=0;i<chars.length;i++)
            chars[i]= randomchar.getrandomlowercase();//it calls through the another class called randomchar
        return chars;
    }
    public static void displayarray(char[] chars){
        for (int i=0;i<chars.length;i++){
            if ((i+1)%20==0)
                System.out.println(" "+chars[i]);
            else
                System.out.print(" "+chars[i]);
        }
    }
    public static int [] counts(char[]chars){
        int [] count=new int[26];
        for (int i=0;i<chars.length;i++)
            count[chars[i]-'a']++;
        return count;
    }
    public static void displaycount(int[]count){
        for (int i=0;i<count.length;i++){
            if ((i+1)%10==0)
                System.out.println(count[i]+" "+(char)(i+'a'));
            else
                System.out.print(count[i]+" "+(char)(i+'a')+" ");
        }
    }
}
