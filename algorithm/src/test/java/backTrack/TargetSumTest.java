package backTrack;

import org.junit.Test;

public class TargetSumTest {

    TargetSum solver = new TargetSum();

    @Test
    public void testOne() {
        int[] nums = new int[]{1,1,1,1,1};

        int res = solver.targetSum(nums, 3);
        System.out.println(res);
        // 5
    }
}
