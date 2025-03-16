package BFS_DFS;

/**
 *  130. 被围绕的区域
 */

// 先用 for 循环遍历棋盘的四边，用 DFS 算法把那些与边界相连的 O 换成一个特殊字符，比如 #；
// 然后再遍历整个棋盘，把剩下的 O 换成 X，把 # 恢复成 O。
// 这样就能完成题目的要求，时间复杂度 O(MN)。
public class SurroundedRegions {

    public char[][] surroundedRegions(char[][] board) {

        int res = 0;
        int m = board.length, n= board[0].length;

        // 遍历周边岛屿，并标记 O 为 '#'
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(i==0 || i==board.length-1) {

                    if(board[i][j] == 'O') {
                        dfs(i, j, board);
                    }
                } else if(j==0 || j==board[0].length-1) {
                    if(board[i][j] == 'O') {
                        dfs(i, j, board);
                    }
                }
            }
        }

        // 将 # 标记为 O，将 O 标识为X
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(board[i][j] == 'O') {
                    board[i][j] = 'X';
                }else if(board[i][j] == '#') {
                    board[i][j] = 'O';
                }
            }
        }

        return board;
    }

    void dfs(int row, int col, char[][] board) {
        int m=board.length, n=board[0].length;
        if(row<0 || col<0 || row>=m || col>=n) {
            // 超出搜索边界
            return;
        }

        if(board[row][col]=='X') {
            // 已经是海水
            return;
        }
        // 将(row, col)变成海水，标记为 #
        board[row][col] = '#';
        // 淹没上下左右陆地
        dfs(row+1, col, board);
        dfs(row, col+1, board);
        dfs(row-1, col, board);
        dfs(row-1, col-1, board);
    }




}
