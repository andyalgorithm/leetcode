import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 51. N皇后
 */

public class NQueens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] memo = new char[n][n];
        for(char[] t: memo){
            Arrays.fill(t, '.');
        }

        dp(0,0, 0, memo, res);

        return res;
    }

    void dp(int row, int col, int n, char[][] memo, List<List<String>> res){
        if(row>memo.length){
            return;
        }else if(n==memo.length){
            ArrayList<String> temp = new ArrayList<>();
            for(char[] t: memo){
                temp.add(new String(t));
            }
            res.add(temp);
            return;
        }

        for(int i=0; i<memo.length; i++){
            if(memo[row][i] =='.' && isValid(row, i, memo)){
                memo[row][i] = 'Q';
                dp(row+1, i, n+1, memo, res);
                memo[row][i] = '.';
            }
        }
    }

    boolean isValid(int row, int col, char[][] memo){
        for(int i=0; i<memo.length; i++){
            if(memo[i][col]=='Q'){
                return false;
            }
        }
        for(int j=0; j<memo.length; j++){
            if(memo[row][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--){
            if(memo[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row+1,j=col+1; i<memo.length && j<memo.length; i++,j++){
            if(memo[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1; i>=0 && j<memo.length; i--,j++){
            if(memo[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row+1,j=col-2; i<memo.length && j>0; i++,j--){
            if(memo[i][j]=='Q'){
                return false;
            }
        }


        return true;
    }
}
