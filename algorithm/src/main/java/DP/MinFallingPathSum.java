package DP;

import java.util.Arrays;

/**
 * 931 最小下降和
 */

public class MinFallingPathSum {

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


        for(int i=0; i<matrix[0].length; i++) {
            // 第一列
            if(i==0) {
                // 列数大于1
                if(matrix[0].length>1) {
                    memo[row][i] = Math.min(dp(row - 1, i, matrix, memo), dp(row - 1, i + 1, matrix, memo))+matrix[row][i];
                }else{
                    // 列数为1列
                    memo[row][i] = dp(row-1, i, matrix, memo)+ matrix[row][i];
                }
            }else if(i+1==matrix[0].length) {
                // 最后一列（默认列数大于1）
                memo[row][i] =  Math.min(dp(row-1, i-1, matrix, memo), dp(row-1, i, matrix, memo))+matrix[row][i];
            }else {
                memo[row][i] = Math.min(
                        dp(row - 1, i - 1, matrix, memo),
                        Math.min(
                                dp(row - 1, i, matrix, memo),
                                dp(row - 1, i + 1, matrix, memo)
                        )
                ) + matrix[row][i];
            }

        }
        return memo[row][col];
    }


}
