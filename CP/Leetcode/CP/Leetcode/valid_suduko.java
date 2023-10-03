package CP.Leetcode;

import java.util.HashSet;

class Solution {

    //row check
    
    public static boolean rowCheck(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> set = new HashSet<>();
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
    public static boolean colCheck(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> set = new HashSet<>();
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
    public static boolean boxCheck(char[][] board) {
        for (int i = 0; i < 9; i+=3) {
            for (int j = 0; j < 9; j+=3) {
                HashSet<Character> set = new HashSet<>();
                for (int k = i; k < i+3; k++) {
                    for (int l = j; l < j+3; l++) {
                        if(board[k][l]!='.'){
                            if(set.contains(board[k][l])){
                                return false;
                            }
                            set.add(board[k][l]);
                            // hi
                        }
                    }
                }
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        
        if(rowCheck(board) && colCheck(board) && boxCheck(board)){
            return true;
        }
        return false;

        
    }
}