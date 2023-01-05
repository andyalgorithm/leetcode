import org.junit.Test;

public class Rob2Test {
    Rob2 solver = new Rob2();

    @Test
    public void test1() {
        int[] nums = {2,3,2};
        int res = solver.rob(nums);
        System.out.println(res);
        // 3
    }

    @Test
    public void test2() {
        int[] nums = {1,2,3,1};
        int res = solver.rob(nums);
        System.out.println(res);
        // 4
    }

    @Test
    public void test3() {
        int[] nums = {1,2,3};
        int res = solver.rob(nums);
        System.out.println(res);
        // 3
    }

    @Test
    public void test4() {
        int[] nums = {1};
        int res = solver.rob(nums);
        System.out.println(res);
        // 1
    }

}
