package stack_queue;

import java.util.Stack;

/**
 * 232 用栈实现队列
 */
public class ImplementQueueUsingStacks {

    private int peekValue=-1;
    Stack<Integer> stack = new Stack<>();

    void push(int x) {
        if(stack.isEmpty()) {
            peekValue = x;
        }
        stack.push(x);
    }

    int pop() {
        Stack<Integer> temp = new Stack<>();
        int sz = stack.size();
        while (sz>2) {
            temp.push(stack.pop());
            sz--;
        }
        if(sz==2) {
            peekValue = stack.peek();
            temp.push(stack.pop());
        }else {
            peekValue = -1;
        }
        int res = stack.pop();

        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }
        return res;
    }

    int peek() {
        return peekValue;
    }

    boolean empty() {
        return stack.isEmpty();
    }
}
