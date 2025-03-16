package dataStructureDesign;

import java.util.Stack;

/**
 * 155 最小栈
 */

public class MinStack {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    void push(int val) {
        if(stack1.isEmpty()) {
            stack2.push(val);
        }else {
            int minVal = Math.min(stack2.peek(), val);
            stack2.push(minVal);
        }
        stack1.push(val);
    }

    void pop() {
        stack1.pop();
        stack2.pop();
    }

    int top() {
        return stack1.peek();
    }

    int getMin() {
        return stack2.peek();
    }
}
