package DP;

import java.util.Arrays;
import java.util.List;

/**
 *  120 三角形最小路径和
 */

public class MinimumTriangleTotal {
    public int minimumTotal(List<List<Integer>> triangle) {
        int res = 0;
        int[][] memo = new int[triangle.size()][triangle.size()];
        for(int[] t: memo){
            Arrays.fill(t, 666);
        }

//        memo[0][0] = triangle.get(0).get(0);
        res = dp(triangle.size()-1, triangle.size()-1, memo, triangle);
        for(int i=0; i<memo.length; i++) {
            res = Math.min(res, memo[memo.length-1][i]);
        }
        return res;
    }

    int dp(int row, int col, int[][] memo, List<List<Integer>> triangle) {
        if(row<0 || col<0) {
            return 0;
        }

        if(memo[row][col]!=666) {
            return memo[row][col];
        }

        for(int i=0; i<=row; i++) {
            // 处于最左侧
            if (i == 0) {
                memo[row][i] = dp(row-1, i, memo, triangle)+triangle.get(row).get(i);
            } else if (i == row) {
                // 处于最右侧
                memo[row][i] = dp(row - 1, i-1, memo, triangle) + triangle.get(row).get(i);
            } else {
                // 取最小值
                memo[row][i] = Math.min(
                        dp(row - 1, i - 1, memo, triangle),
                        dp(row - 1, i, memo, triangle)
                ) + triangle.get(row).get(i);
            }
        }
        return memo[row][col];
    }
}
