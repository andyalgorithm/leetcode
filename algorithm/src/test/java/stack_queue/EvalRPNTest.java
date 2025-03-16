package stack_queue;
import org.junit.Assert;
import org.junit.Test;

public class EvalRPNTest {

    private EvalRPN eval = new EvalRPN();

    @Test
    public void test1() {
        String[] tokens = new String[] {"2","1","+","3","*"};
        int res = eval.evalRPN(tokens);
        Assert.assertEquals(9, res);
    }

    @Test
    public void test2() {
        String[] tokens = new String[] {"4","13","5","/","+"};
        int res = eval.evalRPN(tokens);
        Assert.assertEquals(6, res);
    }

    @Test
    public void test3() {
        String[] tokens = new String[] {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        int res = eval.evalRPN(tokens);
        Assert.assertEquals(22, res);
    }




}
