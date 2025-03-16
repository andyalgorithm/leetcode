package stack_queue;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class MinStackTest {

    private MinStack min = new MinStack();

    @Test
    public void tet1() {
        int res;

        min.push(-2);
        min.push(0);
        min.push(-3);

        res = min.getMin();
        Assert.assertEquals(-3, res);

        min.pop();
        min.pop();
        res = min.getMin();
        Assert.assertEquals(-2, res);

    }



}
