package array.binarySearch;

/**
 * 392.判断子序列
 */

public class IsSubsequence {

    boolean isSubsequence(String s, String t) {

        boolean res = false;

        int left = 0;
        int right = 0;
        while (left<s.length() && right<t.length()) {
            if(s.charAt(left)==t.charAt(right)) {
                left++;
                right++;
            }else{
                right++;
            }
        }
        if(left==s.length()) {
            res = true;
        }
        return res;
    }

}
