import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

/**
 * 946. 栈的压入、弹出序列
 */

public class ValidateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for(int n: pushed){
            stack.push(n);
            while (!stack.isEmpty() && stack.peek() == popped[index]){
                stack.pop();
                index++;
            }
        }

        return stack.isEmpty();
    }
}
