package stack_queue;

import java.util.Stack;

/**
 * 150. 逆波兰表达式求值
 */

public class EvalRPN {

    int evalRPN(String[] tokens) {
        Integer res;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<tokens.length;i++) {
            if(tokens[i].equals("+") || tokens[i].equals("-") ||
                tokens[i].equals("*") || tokens[i].equals("/")) {
                Integer num1 = stack.pop();
                Integer num2 = stack.pop();
                Integer temp;

                if(tokens[i].equals("+")) {
                    temp = num2 + num1;
                } else if(tokens[i].equals("-")) {
                    temp = num2 - num1;
                } else if(tokens[i].equals("*")) {
                    temp = num2 * num1;
                } else {
                    temp = num2 / num1;
                 }
                stack.push(temp);

            } else {
                Integer curr = Integer.valueOf(tokens[i]); // 将String转换成Integer
                stack.push(curr);
            }
        }

        res = stack.pop();
        return res;
    }
}
