package DP;

/**
 * 1143 最长公共子序列
 */

public class LongestCommonSubsequence {

    public int longestCommonSubsequence(String text1, String text2){
        int res = 0;
        res = dp(text1, 0, text2, 0);

        return  res;
    }

    int dp(String text1, int p1, String text2, int p2){
        if(p1>=text1.length() || p2>=text2.length()) {
            return 0;
        }
        if(text1.charAt(p1)==text2.charAt(p2)){
            return dp(text1, p1+1, text2, p2+1)+1;
        }
        return Math.max(dp(text1, p1+1, text2, p2), dp(text1, p1, text2, p2+1));
    }
}
