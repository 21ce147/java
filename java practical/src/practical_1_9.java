//21CE147__UMAT_VISHVDIP
//git@github.com:21ce147/java.git
import java.io.*;
import java.util.*;
public class practical_1_9 {
    static int a = 9;
    static boolean in_range(int[][] board) {
        for (int i=0; i<a; i++) {
            for (int j=0; j<a; j++) {
                if (board[i][j] <= 0 || board[i][j] > 9) {
                    return false;
                }
            }
        }
        return true;
    }
    static boolean Valid_Sudoku(int[][] board) {
        if (in_range (board) == false) {
            return false;
        }
        boolean[] unique = new boolean[a+1];
        for (int i=0; i<a; i++) {
            Arrays.fill(unique,false);
            for (int j=0; j<a; j++) {
                int d = board[i][j];
                if (unique[d]) {
                    return false;
                }
                unique[d] = true;
            }
        }
        for (int i=0; i<a; i++) {
            Arrays.fill(unique,false);
            for (int j=0; j<a; j++) {
                int d = board[j][i];
                if (unique[d]) {
                    return false;
                }
                unique[d] = true;
            }
        }
        for (int i=0; i<a-2; i+=3) {
            for (int j=0; j<a-2; j+=3) {
                Arrays.fill(unique,false);
                for (int b=0; b<3; b++) {
                    for (int l=0; l<3; l++) {
                        int X = i+b;
                        int Y = j+l;
                        int d = board[X][Y];
                        if (unique[d]) {
                            return false;
                        }
                        unique[d] = true;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] board = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };

        if (Valid_Sudoku(board)) {
            System.out.println("Valid");
            }
        else {
            System.out.println("Not Valid");
        }
    }
}
