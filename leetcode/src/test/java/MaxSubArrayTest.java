import org.junit.Test;

public class MaxSubArrayTest {
    MaxSubArray solver = new MaxSubArray();

    @Test
    public void test1() {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int res = solver.maxSubArray(nums);
        System.out.println(res);
        // 6
    }

    @Test
    public void test2() {
        int[] nums = {1};
        int res = solver.maxSubArray(nums);
        System.out.println(res);
        // 1
    }

    @Test
    public void test3() {
        int[] nums = {5,4,-1,7,8};
        int res = solver.maxSubArray(nums);
        System.out.println(res);
        // 23
    }

    @Test
    public void test4() {
        int[] nums = {-1};
        int res = solver.maxSubArray(nums);
        System.out.println(res);
        // -1
    }
}
