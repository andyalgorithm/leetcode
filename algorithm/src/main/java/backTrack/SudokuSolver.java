package backTrack;

/**
 * 37 解数独
 */

// 9x9的格子布局
public class SudokuSolver {

    public void sudokuSolver(char[][] board) {

        backtrack(0,0, board);
    }

    boolean backtrack(int row, int col, char[][] board) {
        // 最后一列，那么换行
        if(col==9) {
            return backtrack(row+1, 0, board);
        }
        // 最后一行已经穷举完成，得到正确结果
        if(row==9) {
            return true;
        }

        // 如果有预设数据，那么不用我们穷举
        if(board[row][col] != '.') {
            return backtrack(row, col+1, board);
        }

        for(char ch='1'; ch<='9'; ch++) {
            if(isValid(row, col, board, ch)) {
                board[row][col] = ch;

                // 如果找到可行解，那么立即结束
                if(backtrack(row, col+1, board)) {
                    return true;
                }
                board[row][col] = '.';
            }
        }

        // 穷举完1-9，依旧没有找到可行解
        return false;
    }

    boolean isValid(int row, int col, char[][] board, char n) {
        for(int i=0; i<9; i++) {
            // 判断行是否满足
            if (board[row][i] == n) {
                return false;
            }

            // 判断列是否满足
            if (board[i][col] == n) {
                return false;
            }
        }

        //判断3x3格子是否满足
        for(int i=row/3*3; i< row/3*3+3; i++) {
            for(int j=col/3*3; j< col/3*3+3; j++) {
                if(board[i][j] == n) {
                    return false;
                }
            }
        }

        return true;
    }
}
