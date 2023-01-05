/**
 * 79. 单词搜索
 */

public class Exist {
    public boolean exist(char[][] board, String word) {
        boolean res = false;
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j]==word.charAt(0)){
                    if(backtrack(i, j, visited, 0, board, word)){
                        return true;
                    }
                }
            }
        }

        return res;
    }

    boolean backtrack(int row, int col, boolean[][] visited, int start, char[][] board, String word){
        if(start==word.length()){
            return true;
        }else if(row>=board.length || col>=board[0].length || row<0 || col<0){
            return false;
        }else if(visited[row][col] || board[row][col]!=word.charAt(start)){
            return false;
        }
        visited[row][col] = true;
        boolean res =
                backtrack(row, col-1, visited, start+1, board, word) ||
                backtrack(row, col+1, visited, start+1, board, word) ||
                backtrack(row-1, col, visited, start+1, board, word) ||
                backtrack(row+1, col, visited, start+1, board, word)
                ;
        visited[row][col] = false;

        return res;
    }
}
