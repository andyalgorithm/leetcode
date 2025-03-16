package stack_queue;

import org.junit.Test;

public class ImplementQueueUsingStacksTest {

    ImplementQueueUsingStacks solver = new ImplementQueueUsingStacks();

    @Test
    public void testOne() {
        solver.push(1);
        solver.push(2);
        solver.push(3);
        System.out.println(solver.peek());
        solver.pop();
        System.out.println(solver.peek());
        solver.pop();
        System.out.println(solver.peek());
        solver.pop();
        System.out.println(solver.peek());
    }
}
