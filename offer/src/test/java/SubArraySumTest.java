import org.junit.Test;

public class SubArraySumTest {

    SubArraySum solver = new SubArraySum();

    @Test
    public void testOne() {
        int[] nums = {1, 1, 1};
        int k = 2;
        int res = solver.subarraySum(nums, k);
        System.out.println(res);
        // 2
    }

    @Test
    public void testTwo() {
        int[] nums = {1, 2, 3};
        int k = 3;
        int res = solver.subarraySum(nums, k);
        System.out.println(res);
        // 2
    }
}
