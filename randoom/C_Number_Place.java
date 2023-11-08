package randoom;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;
class C_Number_Place {

    //row check
    public static boolean rowCheck(int[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if(board[i][j]!='.'){
                    if(set.contains(board[i][j])){
                        return false;
                    }
                    set.add(board[i][j]);
                }
            }
        }
        return true;
    }
    //coloum check
    public static boolean colCheck(int[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if(board[j][i]!='.'){
                    if(set.contains(board[j][i])){
                        return false;
                    }
                    set.add(board[j][i]);
                }
            }
        }
        return true;
    }


    // box check
    public static boolean boxCheck(int[][] board) {
        for (int i = 0; i < 9; i+=3) {
            for (int j = 0; j < 9; j+=3) {
                HashSet<Integer> set = new HashSet<>();
                for (int k = i; k < i+3; k++) {
                    for (int l = j; l < j+3; l++) {
                        if(board[k][l]!='.'){
                            if(set.contains(board[k][l])){
                                return false;
                            }
                            set.add(board[k][l]);
                        }
                    }
                }
            }
        }
        return true;
    }
    public static boolean isValidSudoku(int[][] board) {
        
        if(rowCheck(board) && colCheck(board) && boxCheck(board)){
            return true;
        }
        return false;

        
    }
    public static void main(String[] args) {
        int[][] board = new int[9][9];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                board[i][j] = sc.nextInt();
            }
        }
        // System.out.println(Arrays.deepToString(board));

       
        System.out.println(isValidSudoku(board)?"Yes":"No");
        sc.close(); 
        
    }
}