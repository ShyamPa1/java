import javax.sql.rowset.serial.SQLOutputImpl;

public class mathmethods {
    public static void main(String[] args) {

        System.out.println(Math.sin(0));
        System.out.println(Math.sin(Math.PI/3));
        System.out.println(Math.cos(Math.PI));
        System.out.println(Math.cos(60));
        System.out.println(Math.PI);
        System.out.println(Math.toRadians(1));
        System.out.println(Math.toDegrees(0.017453292519943295));
        System.out.println(Math.ceil(3.3));
        System.out.println(Math.ceil(3.8));
        System.out.println(Math.floor(3.3));
        System.out.println(Math.floor(3.7));
        System.out.println(Math.floor(3));
        System.out.println(Math.rint(3.5));
        System.out.println(Math.rint(3.3));
        System.out.println(Math.rint(3.7));
        System.out.println(Math.round(2.6f));
        System.out.println(Math.round(3.4));
        System.out.println(Math.round(3.6));
        System.out.println(Math.max(4.5,5));
        System.out.println(Math.min(-2,2));
        System.out.println(Math.abs(2.4));
        System.out.println(Math.abs(-2.4));
        System.out.println((int)(Math.random()*100));
        System.out.println(50+(int)(Math.random()*50));
        System.out.println((char)('a'+Math.random()*('z'-'a'+1)));
        System.out.println((char)('A'+Math.random()*('Z'-'A')));
    }

}
