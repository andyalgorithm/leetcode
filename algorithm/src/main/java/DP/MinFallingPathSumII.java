package DP;

import java.util.Arrays;

/**
 * 931 最小下降和（简化if判断）
 */

public class MinFallingPathSumII {

    public int minFallingPathSum(int[][] matrix) {
        int res = Integer.MAX_VALUE;
        int[][] memo = new int[matrix.length][matrix[0].length]; // 创建备忘录
        for(int[] t: memo) {
            Arrays.fill(t, Integer.MAX_VALUE);
        }

        dp(matrix.length-1, matrix[0].length-1, matrix, memo);
        for(int i=0; i<memo[0].length; i++) {
            res = Math.min(res, memo[matrix.length-1][i]);
        }

        return res;

    }

    int dp(int row, int col, int[][] matrix, int[][] memo) {
        if(row<0 || col<0) {
            return 0;
        }

        if(memo[row][col]!=Integer.MAX_VALUE) {
            return memo[row][col];
        }


        int temp;
        for(int i=0; i<matrix[0].length; i++) {
            temp = dp(row-1, i, matrix, memo);
            // 列数大于1，且当前列数大于1，那么比较
            if(matrix[0].length>1 && i>0){
                temp = Math.min(temp, dp(row-1, i-1, matrix, memo));
            }
            // 列数大于1，且未到达最右侧，那么比较
            if(matrix[0].length>1 && i+1<matrix[0].length) {
                temp = Math.min(temp, dp(row-1, i+1, matrix, memo));
            }

            memo[row][i] = temp + matrix[row][i];
            }
        return memo[row][col];
    }


}
