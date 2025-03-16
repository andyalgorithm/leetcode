package stack_queue;

import org.junit.Assert;
import org.junit.Test;

public class LongestValidParenthesesTest {

    LongestValidParentheses longest = new LongestValidParentheses();

    @Test
    public void test1() {
        String s = new String("(()");
        int res = longest.longestValidParentheses(s);
        Assert.assertEquals(2, res);
    }

    @Test
    public void test2() {
        String s = new String(")()())");
        int res = longest.longestValidParentheses(s);
        Assert.assertEquals(4, res);
    }

    @Test
    public void test3() {
        String s = new String("");
        int res = longest.longestValidParentheses(s);
        Assert.assertEquals(0, res);
    }

    @Test
    public void test4() {
        String s = new String("(())((()");
        int res = longest.longestValidParentheses(s);
        Assert.assertEquals(4, res);
    }
}
