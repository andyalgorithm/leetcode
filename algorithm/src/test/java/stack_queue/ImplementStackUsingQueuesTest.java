package stack_queue;

import org.junit.Test;

public class ImplementStackUsingQueuesTest {

    ImplementStackUsingQueues solver = new ImplementStackUsingQueues();

    @Test
    public void testOne() {
        solver.push(1);
        solver.push(2);
        solver.push(3);
        System.out.println(solver.peek()); // 3
        solver.pop();
        System.out.println(solver.peek()); // 2
        solver.pop();
        System.out.println(solver.peek()); // 1
        solver.pop();
        System.out.println(solver.peek()); // -1

    }
}
