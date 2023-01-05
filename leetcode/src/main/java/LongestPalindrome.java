import java.util.Arrays;

/**
 * 5 最长回文子串
 */

public class LongestPalindrome {


    public String longestPalindrome(String s) {
        String res = "";
        int start=0, len=0;
        int[][] memo = new int[s.length()][s.length()];
        for(int[] t: memo)
            Arrays.fill(t, -1);
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                int temp = dp(i, j, s, memo);
                if(temp>len){
                    start = i;
                    len = temp;
                }
            }
        }

        return s.substring(start, start+len);
    }

    int dp(int start, int end, String s, int[][] memo) {
        if (start > end || start < 0 || end >= s.length()) {
            return 0;
        }
        if (memo[start][end] != -1) {
            return memo[start][end];
        }
        if (start == end) {
            memo[start][end] = 1;
        } else if (s.charAt(start) == s.charAt(end)) {
            if (start + 1 == end || dp(start + 1, end - 1, s, memo) > 0) {
                memo[start][end] = dp(start + 1, end - 1, s, memo) + 2;
            } else {
                memo[start][end] = 0;
            }
        }
        return memo[start][end];
    }


}
