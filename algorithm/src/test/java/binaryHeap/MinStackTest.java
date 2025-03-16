package binaryHeap;

import org.junit.Assert;
import org.junit.Test;

public class MinStackTest {

    private MinStack min = new MinStack();

    @Test
    public void test1() {
        int res;
        int expect;

        min.push(-2);
        min.push(0);
        min.push(-3);

        res = min.getMin();
        expect = -3;
        Assert.assertEquals(expect, res);

        min.pop();
        res = min.top();
        expect = 0;
        Assert.assertEquals(expect, res);

        res = min.getMin();
        expect = -2;
        Assert.assertEquals(expect, res);
    }
}
