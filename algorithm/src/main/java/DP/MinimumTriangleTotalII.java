package DP;

import java.util.Arrays;
import java.util.List;

/**
 *  120 三角形最小路径和（简化if判断语句）
 */

public class MinimumTriangleTotalII {
    public int minimumTotal(List<List<Integer>> triangle) {
        int res = 0;
        int[][] memo = new int[triangle.size()][triangle.size()];
        for(int[] t: memo){
            Arrays.fill(t, Integer.MAX_VALUE);
        }

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

        if(memo[row][col]!=Integer.MAX_VALUE) {
            return memo[row][col];
        }


        for(int i=0; i<=row; i++) {
            int temp = dp(row-1, i, memo, triangle);
            if(i>0) {
                temp = Math.min(temp, dp(row-1, i-1, memo, triangle));
            }
            if(i+1<=row) {
                temp = Math.min(temp, dp(row-1, i, memo, triangle));
            }
            memo[row][i] = temp+triangle.get(row).get(i);
        }
        return memo[row][col];
    }
}
