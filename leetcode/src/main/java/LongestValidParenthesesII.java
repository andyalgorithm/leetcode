import java.util.Stack;

/**
 * 32 最长有效括号
 */

public class LongestValidParenthesesII {
    public int longestValidParentheses(String s) {
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='('){
                stack.push(i);
            }else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }
                res = Math.max(res, i-stack.peek());
            }
        }
        return res;
    }

}
