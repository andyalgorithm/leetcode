package stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *  255 用队列实现栈
 */

public class ImplementStackUsingQueues {
    private int peekValue=-1;
    Queue<Integer> queue =new LinkedList<>();

    void push(int x) {
        queue.offer(x);
        peekValue = x;
    }

    int pop() {
        int sz = queue.size();
        while (sz>2) {
            queue.offer(queue.poll());
            sz--;
        }
        if(sz==2) {
            peekValue = queue.peek();
            queue.offer(queue.poll());
        }else {
            peekValue = -1;
        }
        int res = queue.poll();
        return res;
    }

    int peek() {
        return peekValue;
    }

    boolean empty() {
        return queue.isEmpty();
    }

}
