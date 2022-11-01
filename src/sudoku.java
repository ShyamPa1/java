import java.util.Scanner;

public class sudoku {
    public static void main(String[] args) {
        int [][]grid=readpuzzle();
        if(!isvalid(grid))
            System.out.println("invalid solution");
        else if (search(grid)) {
            System.out.println("solution is found");
            printgrid(grid);
        }
        else
            System.out.println("no solution");
    }

    public static int[][] readpuzzle() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the puzzle");
        int[][] grid = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                grid[i][j] = input.nextInt();
            }
        }
        return grid;
    }

    public static int[][] freecells(int[][] grid) {
        int freecells = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (grid[i][j] == 0) {
                    freecells++;
                }
            }
        }
        int[][] freecelllist = new int[freecells][2];
        int count = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (grid[i][j] == 0) {
                    grid[count][0] = i;
                    grid[count++][1] = j;
                }
            }
        }
        return freecelllist;
    }

    public static void printgrid(int[][] grid) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean search(int[][] grid) {
        int [][] freecelllist=freecells(grid);
        int k=0;
        boolean found=false;
        while (!found){
            int i=freecelllist[k][0];
            int j=freecelllist[k][1];
            if (grid[i][j]==0)
                grid[i][j]=1;
            if (isvalid(i,j,grid)){
                if(k+1==freecelllist.length){
                    found =true;
                }
                else {
                    k++;
                }
            }
            else if (grid[i][j]<9){
                grid[i][j]=grid[i][j]+1;
            }
            else {
                while (grid[i][j]==9){
                    grid[i][j]=0;
                    if (k==0){
                        return false;
                    }
                    k--;
                    i=freecelllist[k][0];
                    j=freecelllist[k][1];
                }
                grid[i][j]=grid[i][j]+1;
            }
        }
        return true;
    }

    public static boolean isvalid(int i, int j, int[][] grid) {
        for (int col = 0; col < 9; col++)
            if (col != j && grid[i][col] == grid[i][j])
                return false;
        for (int row = 0; row < 9; row++)
            if (row != i && grid[row][j] == grid[i][j])
                return false;
            for (int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++)
                for (int col = (j / 3) * 3; col < (j / 3) * 3 +3;col++)
                    if (row != i && col != j && grid[row][col] == grid[i][j])
                        return false;
            return true;
    }
    public static boolean isvalid(int[][]grid){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (grid[i][j]!=0&&!isvalid(i,j,grid))return false;

            }
            }
        return true;
    }
}

