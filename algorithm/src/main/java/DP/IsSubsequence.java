package DP;

/**
 * 392 判断子序列
 */

public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        boolean res = true;
        res = dp(s, s.length()-1, t, t.length()-1);
        return res;
    }

    boolean dp(String s, int p1, String t, int p2){
        if(p1<0){
            return true;
        }else if(p2<0){
            return false;
        }
        if(s.charAt(p1)==t.charAt(p2)){
            return dp(s, p1-1, t, p2-1);
        }else {
            return dp(s, p1, t, p2-1);
        }
    }
}