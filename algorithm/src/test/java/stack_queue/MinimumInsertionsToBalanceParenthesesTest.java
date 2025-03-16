package stack_queue;

import org.junit.Assert;
import org.junit.Test;

public class MinimumInsertionsToBalanceParenthesesTest {

    private MinimumInsertionsToBalanceParentheses min = new MinimumInsertionsToBalanceParentheses();

    @Test
    public void test1() {
        String s = new String("(()))");
        int res = min.minInsert(s);
        Assert.assertEquals(1, res);
    }

    @Test
    public void test2() {
        String s = new String("()))((");
        int res = min.minInsert(s);
        Assert.assertEquals(6, res);
    }

    @Test
    public void test3() {
        String s = new String("))())(");
        int res = min.minInsert(s);
        Assert.assertEquals(3, res);
    }
}
