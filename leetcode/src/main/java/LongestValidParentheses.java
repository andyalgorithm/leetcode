import java.util.Arrays;
import java.util.Stack;

/**
 * 32 最长有效括号
 */

public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        int res = 0;

        int left=0, right=0;
        for(char c: s.toCharArray()){
            if(c=='('){
                left++;
            }else{
                right++;
            }

            if(left<right){
                left=0;
                right=0;
            }else if(left==right) {
                res = Math.max(res, 2*right);
            }
        }

        left=0; right=0;
        for(int i=s.length()-1; i>=0; i--){
            char c = s.charAt(i);
            if(c=='('){
                left++;
            }else{
                right++;
            }

            if(left>right){
                left=0;
                right=0;
            }else if(left==right) {
                res = Math.max(res, 2*right);
            }
        }

        return res;

    }

}
