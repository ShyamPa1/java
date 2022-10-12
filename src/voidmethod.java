

public class voidmethod {
    public static void main(String[] args) {
        System.out.println("the grade is=");
        grade(-5);
    }
    public static void grade(double score){
        if (score<0||score>100){
            System.out.println("invalid score");
            return;
        }
        if (score>90)
            System.out.println("A");
        else if (score>80)
            System.out.println("B");
        else if(score>70)
            System.out.println("C");
        else
            System.out.println("fail");
    }
}
