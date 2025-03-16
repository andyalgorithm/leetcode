package DP;

import java.util.Arrays;

/**
 * 63 不同路径II
 */

public class UniquePathsWithObstacles {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int res = 0;
        int[][] memo = new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int[] ints:memo) {
            Arrays.fill(ints, -1);
        }
        if(obstacleGrid[0][0]==0) {
            memo[0][0] = 1;
        }else{
            memo[0][0] = 0;
        }
//        if(memo.length>1){
//            if(obstacleGrid[1][0]==0 && memo[0][0]==1) {
//                memo[1][0] = 1;
//            }else {
//                memo[1][0] = 0;
//            }
//        }
//        if(memo[0].length>1){
//            if(obstacleGrid[0][1]==0 && memo[0][0]==1) {
//                memo[0][1] = 1;
//            }else {
//                memo[0][1] = 0;
//            }
//        }
        res = dp(memo.length-1, memo[0].length-1, memo, obstacleGrid);


        return res;
    }

    int dp(int row, int col, int[][] memo, int[][] obs){
        if(row<0 || col<0 || obs[row][col]==1) {
            return 0;
        }

        if(memo[row][col]!=-1) {
            return memo[row][col];
        }

        memo[row][col] = dp(row-1, col,memo, obs) + dp(row, col-1, memo, obs);
        return memo[row][col];
    }
}
