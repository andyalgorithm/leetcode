import org.junit.Test;

public class RobTest {
    Rob solver = new Rob();

    @Test
    public void test1() {
        int[] nums = {1,2,3,1};
        int res = solver.rob(nums);
        System.out.println(res);
        // 4
    }

    @Test
    public void test2() {
        int[] nums = {2,7,9,3,1};
        int res = solver.rob(nums);
        System.out.println(res);
        // 12
    }

}
