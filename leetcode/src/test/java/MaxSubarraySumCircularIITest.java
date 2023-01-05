import org.junit.Test;

public class MaxSubarraySumCircularIITest {
    MaxSubarraySumCircularII solver = new MaxSubarraySumCircularII();

    @Test
    public void test1() {
        int[] nums = {1, -2, 3, -2};
        int res = solver.maxSubarraySumCircular(nums);
        System.out.println(res);
        // 3
    }

    @Test
    public void test2() {
        int[] nums = {5, -3, 5};
        int res = solver.maxSubarraySumCircular(nums);
        System.out.println(res);
        // 10
    }

    @Test
    public void test3() {
        int[] nums = {3, -2, 2, -3};
        int res = solver.maxSubarraySumCircular(nums);
        System.out.println(res);
        // 3
    }

    @Test
    public void test4() {
        int[] nums = {-1};
        int res = solver.maxSubarraySumCircular(nums);
        System.out.println(res);
        // -1
    }

}
