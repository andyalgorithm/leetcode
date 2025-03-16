package stack_queue;


import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesesTest {

    private ValidParentheses valid = new ValidParentheses();

    @Test
    public void test1() {
        String s = new String("([)]");
        boolean res = valid.validParentheses(s);
        Assert.assertFalse(res);
    }

    @Test
    public void test2() {
        String s = new String("()[]{}");
        boolean res = valid.validParentheses(s);
        Assert.assertTrue(res);
    }

    @Test
    public void test3() {
        String s = new String("()");
        boolean res = valid.validParentheses(s);
        Assert.assertTrue(res);
    }

    @Test
    public void test4() {
        String s = new String("(]");
        boolean res = valid.validParentheses(s);
        Assert.assertFalse(res);
    }


}
