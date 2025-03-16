package backTrack;

import org.junit.Test;

public class TargetSum2Test {

    TargetSum2 solver = new TargetSum2();

    @Test
    public void testOne() {
        int[] nums = new int[]{1,1,1,1,1};

        int res = solver.targetSum(nums, 3);
        System.out.println(res);
        // 5
    }
}
