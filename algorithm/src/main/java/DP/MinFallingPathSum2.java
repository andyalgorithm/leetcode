package DP;

import java.util.Arrays;

/**
 *  1289. 下降路径最小和II
 */

public class MinFallingPathSum2 {
    public int minFallingPathSum(int[][] grid) {
        int res = Integer.MAX_VALUE;
        int[][] memo = new int[grid.length][grid[0].length];
        for(int[] t: memo) {
            Arrays.fill(t, Integer.MAX_VALUE);
        }
        dp(grid.length-1, grid[0].length-1, grid, memo);
        for(int i=0; i<memo[0].length; i++) {
            res = Math.min(res, memo[grid.length-1][i]);
        }

        return res;
    }

    int dp(int row, int col, int[][] grid, int[][] memo) {
        if(row<0 || col<0) {
            return 0;
        }

        if(memo[row][col]!=Integer.MAX_VALUE) {
            return memo[row][col];
        }

        for(int i=0; i<grid[0].length; i++) {
            int temp = Integer.MAX_VALUE;
            // 处理仅有一列的情况
            if(grid[0].length==1) {
                temp = dp(row-1, i, grid, memo);
            }
            for(int j=0; j<grid[0].length; j++) {
                if(i==j) {
                    continue;
                }
                temp = Math.min(temp, dp(row-1, j, grid, memo));
            }
            memo[row][i] = temp + grid[row][i];
        }
        return memo[row][col];
    }
}
