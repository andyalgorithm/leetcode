package stack_queue;

import org.junit.Assert;
import org.junit.Test;

public class MinAddMakeValidTest {

    private MinAddMakeValid add = new MinAddMakeValid();

    @Test
    public void test1() {
        String s = new String("())");
        int res = add.minAddMakeValid(s);
        Assert.assertEquals(1, res);
    }

    @Test
    public void test2() {
        String s = new String("(((");
        int res = add.minAddMakeValid(s);
        Assert.assertEquals(3, res);
    }

    @Test
    public void test3() {
        String s = new String(")))");
        int res = add.minAddMakeValid(s);
        Assert.assertEquals(3, res);
    }
}
