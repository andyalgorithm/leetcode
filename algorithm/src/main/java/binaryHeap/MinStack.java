package binaryHeap;

import java.util.PriorityQueue;
import java.util.Stack;

/**
 * 155. 最⼩栈
 */

public class MinStack {

    private Stack<Integer> stack = new Stack<>();
    // 从小到大排序
    private Stack<Integer> min = new Stack<>();

    public MinStack() {

    }

    public void push(int val) {
        stack.push(val);
        if(min.isEmpty()) {
            min.add(val);
        } else if(min.peek()>val) {
            min.add(val);
        } else {
            min.add(min.peek());
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
