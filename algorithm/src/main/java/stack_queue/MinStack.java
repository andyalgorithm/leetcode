package stack_queue;

/**
 * 155. 最⼩栈
 */

import java.util.Stack;

public class MinStack {

    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> min = new Stack<>();

    public MinStack() {

    }

    public void push(int val) {
        stack.push(val);
        if(min.isEmpty()) {
            min.push(val);
        } else {
            Integer res = Math.min(min.peek(), val);
            min.push(res);
        }
    }

    public void pop() {
        stack.pop();
        min.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }

}
