package backTrack;

/**
 * 52 N-Queues
 */

import java.util.ArrayList;

public class NQueues {

    public ArrayList<ArrayList<String>> nQueues(int n) {
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = '.';
            }
        }

        backtrack(board, 0, res);

        return res;
    }

    void backtrack(char[][] board, int row,  ArrayList<ArrayList<String>> res) {
        if(row==board.length) {
            ArrayList<String> temp = new ArrayList<>();
            for(int i=0; i<board.length; i++) {
                StringBuilder s = new StringBuilder();
                for(int j=0; j<board[0].length; j++) {
                    s.append(board[i][j]);
                }
                temp.add(s.toString());
            }
            res.add(temp);
            return;
        }

        for(int col=0; col<board.length; col++) {
                if(isValid(board, row, col)) {
                    board[row][col] = 'Q';
                    backtrack(board, row+1, res);
                    board[row][col] = '.';
                }
        }


    }

    boolean isValid(char[][] board, int row, int col) {

        // 判断水平-竖直方向是否有效
        for(int i=0; i<row; i++) {
            // 判断竖直方向是否有效
            if(board[i][col]=='Q') {
                return false;
            }

        }

        // 判断右上方向是否有效
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++) {
            if(board[i][j]=='Q') {
                return false;
            }
        }

        // 判断左上方向是否有效
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--) {
            if(board[i][j]=='Q') {
                return false;
            }
        }

        return true;
    }
}
