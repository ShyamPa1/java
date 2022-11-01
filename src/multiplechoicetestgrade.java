import java.util.Scanner;

public class multiplechoicetestgrade {
    public static void main(String[] args) {
       char[][]studentkeptoptions={{'A','B','D','B','C','A'},
                                   {'D','C','B','A','D','C'},
                                   {'A','B','C','D','A','B'}};
       char[]key={'B','B','C','D','A','C'};
       for (int i=0;i<studentkeptoptions.length;i++){
           int correctcount=0;
           for (int j=0;j<studentkeptoptions[i].length;j++){
               if (studentkeptoptions[i][j]==key[j])
                   correctcount++;
           }
           System.out.println(correctcount);
       }

    }
}
