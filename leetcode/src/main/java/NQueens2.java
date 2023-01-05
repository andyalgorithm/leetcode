import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 52. N皇后II
 */

public class NQueens2 {
    public int totalNQueens(int n) {
        int res=0;
        char[][] memo = new char[n][n];
        for(char[] t: memo){
            Arrays.fill(t, '.');
        }

        res = dp(0,0, 0, memo);

        return res;
    }

    int dp(int row, int col, int n, char[][] memo){
        if(row>memo.length){
            return 0;
        }else if(n==memo.length){
            return 1;
        }

        int res = 0;
        for(int i=0; i<memo.length; i++){
            if(memo[row][i] =='.' && isValid(row, i, memo)){
                memo[row][i] = 'Q';
                res += dp(row+1, i, n+1, memo);
                memo[row][i] = '.';
            }
        }
        return res;
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
