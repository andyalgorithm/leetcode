package DP;

import java.util.Arrays;

/**
 * 1143 最长公共子序列
 */

public class LongestCommonSubsequenceII {

    public int longestCommonSubsequence(String text1, String text2){
        int res = 0;
        int[][] memo = new int[text1.length()][text2.length()];
        for (int[] ints : memo) {
            Arrays.fill(ints, -1);
        }
        res = dp(text1, text1.length()-1, text2, text2.length()-1, memo);

        return  res;
    }

    int dp(String text1, int p1, String text2, int p2, int[][] memo){
        if(p1<0 || p2<0) {
            return 0;
        }
        // 查询备忘录中是否存在数据
        if(memo[p1][p2]!=-1){
            return memo[p1][p2];
        }

        if(text1.charAt(p1)==text2.charAt(p2)){
            memo[p1][p2] = dp(text1, p1-1, text2, p2-1, memo)+1;
        }else {
            memo[p1][p2] = Math.max(dp(text1, p1 - 1, text2, p2, memo),
                                    dp(text1, p1, text2, p2 - 1, memo)
            );
        }
        return memo[p1][p2];
    }
}
