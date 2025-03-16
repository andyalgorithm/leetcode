import org.junit.Test;

public class NumSubArrayProductLessThanKTest {
    NumSubArrayProductLessThanK solver = new NumSubArrayProductLessThanK();

    @Test
    public void testOne() {
        int[] nums = {10, 5, 2, 6};
        int k = 100;
        int res = solver.numSubarrayProductLessThanK(nums, k);
        System.out.println(res);
        // 8
    }

    @Test
    public void testTwo() {
        int[] nums = {1, 2, 3};
        int k = 0;
        int res = solver.numSubarrayProductLessThanK(nums, k);
        System.out.println(res);
        // 0
    }

    @Test
    public void testThree() {
        int[] nums = {10,9,10,4,3,8,3,3,6,2,10,10,9,3};
        int k = 19;
        int res = solver.numSubarrayProductLessThanK(nums, k);
        System.out.println(res);
        // 18
    }
}
