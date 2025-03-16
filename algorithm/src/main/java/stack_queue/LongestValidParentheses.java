package stack_queue;

import java.util.Stack;

/**
 * 32. 最长有效括号
 */

public class LongestValidParentheses {

    public int longestValidParentheses(String s) {
        int res=0;
        int[] dp = new int[s.length()+1];
        Stack<Integer> stack = new Stack<>();
        dp[0] = 0;

        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(c=='(') {
                stack.push(i); // 压入左括号索引
                dp[i+1] = 0;
            } else {
                if(stack.empty()) {
                    dp[i+1]=0;
                } else {
                    int index = stack.pop();
                    dp[i+1] = i + 1 - index + dp[index];
                }
            }
        }

        for(int i=0;i<dp.length;i++) {
            res = Math.max(res, dp[i]);
        }

        return res;
    }


}
