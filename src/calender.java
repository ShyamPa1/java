import java.util.Scanner;

public class calender {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the year=");
        int year=input.nextInt();
        System.out.println("enter the month=");
        int month=input.nextInt();
        printmonth(year,month);
    }
    static void printmonth(int year,int month){
        printmonthtitle(year,month);
        monthbody(year,month);

    }
    static void printmonthtitle(int year,int month){
        System.out.println("       "+monthname(month)+"  "+year);
        System.out.println("-------------------------------");
        System.out.println("sun mon tue wed thu fri sat");
    }
    static String monthname(int month){
        String monthname=null;
        switch (month){
            case 1:monthname="january";break;
            case 2:monthname="february";break;
            case 3:monthname="march";break;
            case 4:monthname="april";break;
            case 5:monthname="may";break;
            case 6:monthname="june";break;
            case 7:monthname="july";break;
            case 8:monthname="august";break;
            case 9:monthname="september";break;
            case 10:monthname="october";break;
            case 11:monthname=" november";break;
            case 12:monthname="december";break;
        }
        return monthname;
    }
    static void monthbody(int year,int month){
        int i;
        int startday=getstarday(year,month);
        int numberofdaysinmonth=getnumberofdaysinmonth(year,month);

        for (i=0;i<startday;i++)
            System.out.print("    ");
        for (i=1;i<=numberofdaysinmonth;i++) {
            if (i < 10)
                System.out.print("   " + i);
            else
                System.out.print("  " + i);
            if ((i + startday) % 7 == 0)
                System.out.println();
        }
        System.out.println();

    }
    static int getstarday(int year,int month){
        final int startdayforjan1880=3;
        int totalnumberofdays=gettotalnumberofdays(year,month);
        return (totalnumberofdays+startdayforjan1880)%7;

    }
    static int gettotalnumberofdays(int year,int month){
        int total=0;
        for (int i=1800;i<year;i++)
            if (isleapyear(i))
                total=total+366;
               else
                   total=total+365;
               for (int i=1;i<month;i++)
                   total=total+getnumberofdaysinmonth(year,i);
               return total;

    }
    static int getnumberofdaysinmonth(int year,int month){
        if (month==1||month==3||month==5||month==7||month==8||month==10||month==12)
            return 31;
        if (month==4||month==6||month==9||month==11)
            return 30;
        if (month==2)return isleapyear(year)? 29:28;
        return 0;

    }
    static boolean isleapyear(int year){
        return year%400==0||(year%4==0&&year%100!=0);
    }
}
