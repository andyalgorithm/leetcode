package stack_queue;

import org.junit.Test;

import java.util.PriorityQueue;



public class QueueTest {



    // 从小到大排列
    PriorityQueue<QueueNode> queue = new PriorityQueue<>(
            (o1, o2) -> {
                return o1.val - o2.val;
            }
    );

    @Test
    public void testOne() {
        QueueNode n1 = new QueueNode(1);
        QueueNode n2 = new QueueNode(2);
        queue.add(n1);
        queue.add(n2);
        assert queue.peek() != null;
        System.out.println(queue.peek().val); // 1
        n1.val = 5;
        assert queue.peek() != null;
        System.out.println(queue.peek().val); // 5
    }

    @Test
    public void testTwo() {
        QueueNode n1 = new QueueNode(1);
        QueueNode n2 = new QueueNode(2);
        queue.add(n1);
        queue.add(n2);
        assert queue.peek() != null;
        n1.val = 5;
        assert queue.peek() != null;
        System.out.println(queue.poll().val); // 5
    }


    class QueueNode {
    int val;

    public QueueNode(int val) {
        this.val = val;
    }
}


}
