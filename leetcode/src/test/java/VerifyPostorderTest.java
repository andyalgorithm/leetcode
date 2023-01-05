import org.junit.Test;

public class VerifyPostorderTest {
    VerifyPostorder solver = new VerifyPostorder();

    @Test
    public void test1(){
        int[] nums = {1,6,3,2,5};
        boolean res = solver.verifyPostorder(nums);
        System.out.println(res);
    }
}
