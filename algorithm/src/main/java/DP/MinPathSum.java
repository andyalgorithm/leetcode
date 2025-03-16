package DP;

import java.util.Arrays;

/**
 *  64 最小路径和
 */

public class MinPathSum {
    public int minPathSum(int[][] grid) {
        int res = 0;
        int[][] memo = new int[grid.length][grid[0].length];
        for(int[] t: memo){
            Arrays.fill(t, -1);
        }

        res = dp(grid.length-1, grid[0].length-1, memo, grid);

        return res;
    }

    int dp(int row, int col, int[][] memo, int[][] grid){
        if(row<0 || col<0){
            return 0;
        }

        if(memo[row][col]!=-1){
            return memo[row][col];
        }

        if(row==0) {
            memo[row][col] = dp(row, col-1, memo, grid)+grid[row][col];
        }else if(col==0) {
            memo[row][col] = dp(row-1, col, memo, grid)+grid[row][col];
        }else {
            memo[row][col] = Math.min(
                    dp(row - 1, col, memo, grid),
                    dp(row, col - 1, memo, grid))+grid[row][col];
        }
        return memo[row][col];
    }
}
