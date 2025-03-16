package stack_queue;

/**
 * 20. 有效的括号
 */

import java.util.Stack;

public class ValidParentheses {

    public boolean validParentheses(String s) {
        boolean res = true;
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(c=='[' || c=='(' || c=='{') {
                stack.push(c);

            } else {
                if(stack.empty()) {
                    res = false;
                    break;
                }

                char pre = stack.pop();
                if((pre=='[' && c!=']') || (pre=='(' && c!=')') || (pre=='{' && c!='}')) {
                    res = false;
                    break;
                }
            }
        }

        return res;
    }
}
