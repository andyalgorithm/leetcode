import org.junit.Test;

public class CanJumpTest {
    CanJump solver = new CanJump();

    @Test
    public void test1() {
        int[] nums = {2,3,1,1,4};
        boolean res = solver.canJump(nums);
        System.out.println(res);
        // true
    }

    @Test
    public void test2() {
        int[] nums = {3,2,1,0,4};
        boolean res = solver.canJump(nums);
        System.out.println(res);
        // false
    }
}
